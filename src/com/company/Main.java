package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Wound[] wound = new Wound[50];

        Display.InitialMessage();

        //Character character = new Character(Communication.setCharacterNumber(), Communication.setCharacterName(), Communication.setCharacterGender(),
                Communication.setCharacterVitality(), Communication.setCharacterToughness(), Communication.setArmour());
        Character character = new Character(1, "Tescik", "m", 80, 3, );

        System.out.print("Od której rundy zaczynamy? ");
        int round = scanner.nextInt();

        for (int i = 0; i < 20; ) {
            int condition = character.getVitality();
            int bloodLoss = 0;
            boolean lowCondition = false;
            boolean criticalCondition = false;
            System.out.print("1) Określ obrażenie 2) Następna runda 3) Przejdź do rundy ");
            int whatNow = scanner.nextInt();
            switch (whatNow) {
                case 1:
                    wound[i] = new Wound(Communication.setHitStrength() - character.getToughness(),
                            Communication.setHitType(),
                            Communication.setHitLocalisation(),
                            round);
                    wound[i].woundDescription();
                    i++;
                    break;
                case 2:
                    round++;
                    break;
                case 3:
                    System.out.print("Do której rundy mam przejść?");
                    round = scanner.nextInt();
                    break;
                default:
                    System.out.println("Unexpected value: " + whatNow);

            }
            for (int j = 1; j < round + 1; j++) {     // ta pętla sprawdza poszczególne rundy - this loop checks each round
                for (int k = 0; k < i; k++) {         // ta pętla sprawdza wszystkie zadane dotąd rany - this loop checks inflicted wounds
                    if (condition < 21) {
                        lowCondition = true;
                    }
                    if (condition < 1) {
                        criticalCondition = true;
                    }
                    bloodLoss += wound[k].bleeding(j, lowCondition, criticalCondition);
                    condition = character.getVitality() - bloodLoss;

                }

            }
            System.out.println("#" + character.getNumber() + " " + character.getName() + " - runda: " + round + ", żywotność: " + condition);

        }


    }
}
