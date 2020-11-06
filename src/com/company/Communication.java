package com.company;

import java.util.Scanner;

public class Communication {


    public static int setCharacterNumber() {
        System.out.print("Proszę podać numer porządkowy postaci ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String setCharacterName() {
        System.out.print("imię lub nazwę postaci ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String setCharacterGender() {
        System.out.print("Proszę podać rodzaj gramatyczny postaci - męski (m), żeński (z) lub nijaki (n) ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int setCharacterVitality() {
        System.out.print("żywotność ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int setCharacterToughness() {
        System.out.print("wytrzymałość ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static int setHitStrength() {
        System.out.print("Proszę podać siłe ciosu (S + k6): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int setHitType() {
        System.out.print("Rodzaj ciosu: ");
        Scanner scanner = new Scanner(System.in);
        String hitType = scanner.next();
        hitType = hitType.toLowerCase();
        int hitTypeInt;
        switch (hitType) {
            case "c":
            case "ciete":
            case "cięte":
                hitTypeInt = 0;
                break;
            case "t":
            case "tluczone":
            case "tłuczone":
                hitTypeInt = 1;
                break;
            case "r":
            case "rabane":
            case "rąbane":
                hitTypeInt = 2;
                break;
            case "k":
            case "klute":
            case "kłute":
                hitTypeInt = 3;
                break;
            case "s":
            case "sz":
            case "szarpane":
                hitTypeInt = 4;
                break;
            case "o":
            case "oparzenia":
                hitTypeInt = 5;
                break;
            default:
                hitTypeInt = 6;
        }


        return hitTypeInt;
    }

    public static int setHitLocalisation() {
        // 0 głowa - head
        // 1 twarz - face
        // 2 szyja - neck
        // 3 bark - shoulder
        // 4 ramię - arm
        // 5 łokieć - elbow
        // 6 przedramię - forearm
        // 7 ręka - hand
        // 8 klatka - chest
        // 9 brzuch - abdomen
        // 10 biodro - hip
        // 11 udo - thigh
        // 12 kolano - knee
        // 13 goleń - leg(crus)
        // 14 stopa - foot

        System.out.print("Lokalizacja: ");
        Scanner scanner = new Scanner(System.in);
        String hitLocalisation = scanner.next();
        hitLocalisation = hitLocalisation.toLowerCase();
        int hitLocalisationInt;
        switch (hitLocalisation) {
            case "głowa":
            case "glowa":
            case "łeb":
                hitLocalisationInt = 0;
                break;
            case "twarz":
            case "gęba":
            case "ryj":
            case "pysk":
            case "morda":
            case "buzia":
            case "faciata":
                hitLocalisationInt = 1;
                break;
            case "szyja":
            case "grdyka":
            case "kark":
                hitLocalisationInt = 2;
                break;
            case "bark":
                hitLocalisationInt = 3;
                break;
            case "ramię":
            case "ramie":
                hitLocalisationInt = 4;
                break;
            case "łokieć":
            case "lokiec":
                hitLocalisationInt = 5;
                break;
            case "przedramię":
            case "przedramie":
                hitLocalisationInt = 6;
                break;
            case "ręka":
            case "reka":
            case "łapa":
            case "dłoń":
            case "dlon":
                hitLocalisationInt = 7;
                break;
            case "klatka":
            case "klata":
            case "klatka piersiowa":
            case "plecy":
            case "k":
                hitLocalisationInt = 8;
                break;
            case "brzuch":
            case "bebzol":
            case "lędźwie":
            case "b":
                hitLocalisationInt = 9;
                break;
            case "biodro":
                hitLocalisationInt = 10;
                break;
            case "udo":
                hitLocalisationInt = 11;
                break;
            case "kolano":
                hitLocalisationInt = 12;
                break;
            case "goleń":
            case "łydka":
            case "golen":
            case "lydka":
                hitLocalisationInt = 13;
                break;
            case "stopa":
                hitLocalisationInt = 14;
                break;
            default:
                hitLocalisationInt = 15;
        }
        return hitLocalisationInt;
    }

    public ArmourCatalogue setArmour {
        System.out.println("Proszę wybrać rodzaj zbroi:");
        Display.armourTypes;
        ArmourCatalogue armour = new ArmourCatalogue();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int catalogueNo = scanner.nextInt();
            int protectionByLoc[] = new int[15];
            switch (catalogueNo) {
                case 0:
                    protectionByLoc[] ={
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                } ;  //brak zbroi
                break;
                case 1:
                    protectionByLoc[] ={
                    3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3
                } ;  //pe�na zbroja p�ytowa
                break;
                case 2:
                    protectionByLoc[] ={
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
                } ;  //pe�na zbroja kolcza
                break;
                case 3:
                    protectionByLoc[] ={
                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
                } ;  //pe�na zbroja sk�rzana
                break;
                case 4:
                    protectionByLoc[] ={
                    3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                } ;  //he�m stalowy zamkni�ty
                break;
                case 5:
                    protectionByLoc[] ={
                    3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                } ;  //he�m stalowy otwarty
                break;
                defoult:
                System.out.println("Niespodziewana wartość");
                i -= 1;
            }
            PieceOfArmour pieceOfArmour = new PieceOfArmour(catalogueNo, protectionByLoc[]);
            armour.addNewPiece(i, pieceOfArmour);
            System.out.println("Dodano element zbroi nr: " + catalogueNo + ". Co dalej?");

            Display.setArmourMenu();
            int whatNow = scanner.nextInt();
            switch (whatNow) {
                case 1:
                    i = 10;
                    break;
                case 2:
                    break;
                case 3: //Display.addedPieces;
                    break;
                case 4:
                    Display.ArmourList();

            }

        }
        return armour;
    }
}
