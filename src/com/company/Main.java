package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Wound[] wound = new Wound[50];
        Character character = new Character(1, "Tescik", "m", 80, 3, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        Display.InitialMessage();

        int whatNow;
        while (true) {
            Display.Menu();
            whatNow = scanner.nextInt();
            if (whatNow == 1) Display.info(); // trzeba napisać informacje o programie
            if (whatNow == 2) {               // ręczne ustalanie cech postaci
                character.setNumber(Communication.setCharacterNumber());
                character.setName(Communication.setCharacterName());
                character.setGender(Communication.setCharacterGender());
                character.setVitality(Communication.setCharacterVitality());
                character.setToughness(Communication.setCharacterToughness());
                character.setArmour(Communication.setArmour());
                Display.showCharacter(character);
            }
            if (whatNow == 3) {
                Character.showCatalogue(Character.catalogue());
                int whichOne = scanner.nextInt();
                character = Character.template(whichOne);
                System.out.print("Jaki nr porządkowy nadać postaci? ");
                character.setNumber(scanner.nextInt());
                Display.showCharacter(character);
            }
            if (whatNow == 4)

            if (whatNow == 5) break;
        }

        System.out.print("Od której rundy zaczynamy? ");
        int round = scanner.nextInt();

        for (int i = 0; i < 20; ) {
            int condition = character.getVitality();
            int bloodLoss = 0;
            boolean lowCondition = false;
            boolean criticalCondition = false;
            System.out.println("1) Określ obrażenie 2) Następna runda 3) Przejdź do rundy 4) Zakończ program ");
            whatNow = scanner.nextInt();
            switch (whatNow) {
                case 1:
                    int loc = Communication.setHitLocalisation();
                    wound[i] = new Wound(loc, Communication.setHitType(),
                            Communication.setHitStrength() - character.getToughness() - character.getArmourProt(loc),
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
                case 4:
                    i = 20;
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
