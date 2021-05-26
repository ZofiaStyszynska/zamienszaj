package com.company;

import java.util.ArrayList;
import java.util.List;
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

    public static int[] setArmour() {
        System.out.println("Proszę wybrać zbroję dla tej postaci:");
        Armour.showCatalogue(Armour.catalogue());
        System.out.println("Proszę wpisać odpowiedni numer. Po wpisaniu 0 program zakończy dodawanie elementów zbroi");
        ArrayList<Integer> whichPieces = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int catalogueNo = scanner.nextInt();
            whichPieces.add(catalogueNo);
            if (catalogueNo == 0) break;
        }
        return Armour.protection(whichPieces, Armour.catalogue());
    }


    public static int setHitStrength() {
        System.out.print("Proszę podać siłe ciosu: ");
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
        int hitLocalisationInt = 15;
        while (hitLocalisationInt == 15) {
            String hitLocalisation = scanner.next();
            hitLocalisation = hitLocalisation.toLowerCase();
            switch (hitLocalisation) {
                case "głowa":
                case "glowa":
                case "łeb":
                case "0":
                    hitLocalisationInt = 0;
                    break;
                case "twarz":
                case "gęba":
                case "ryj":
                case "pysk":
                case "morda":
                case "buzia":
                case "faciata":
                case "1":
                    hitLocalisationInt = 1;
                    break;
                case "szyja":
                case "grdyka":
                case "kark":
                case "2":
                    hitLocalisationInt = 2;
                    break;
                case "bark":
                case "3":
                    hitLocalisationInt = 3;
                    break;
                case "ramię":
                case "ramie":
                case "4":
                    hitLocalisationInt = 4;
                    break;
                case "łokieć":
                case "lokiec":
                case "5":
                    hitLocalisationInt = 5;
                    break;
                case "przedramię":
                case "przedramie":
                case "6":
                    hitLocalisationInt = 6;
                    break;
                case "ręka":
                case "reka":
                case "łapa":
                case "dłoń":
                case "dlon":
                case "7":
                    hitLocalisationInt = 7;
                    break;
                case "klatka":
                case "klata":
                case "klatka piersiowa":
                case "plecy":
                case "k":
                case "8":
                    hitLocalisationInt = 8;
                    break;
                case "brzuch":
                case "bebzol":
                case "lędźwie":
                case "b":
                case "9":
                    hitLocalisationInt = 9;
                    break;
                case "biodro":
                case "10":
                    hitLocalisationInt = 10;
                    break;
                case "udo":
                case "11":
                    hitLocalisationInt = 11;
                    break;
                case "kolano":
                case "12":
                    hitLocalisationInt = 12;
                    break;
                case "goleń":
                case "łydka":
                case "golen":
                case "lydka":
                case "13":
                    hitLocalisationInt = 13;
                    break;
                case "stopa":
                case "14":
                    hitLocalisationInt = 14;
                    break;
                default:
                    hitLocalisationInt = 15;

            }
            if (hitLocalisationInt==15){
                System.out.println("Wartość " + hitLocalisation + " jest niezrozumiała," +
                        "program przewiduje 15 lokalizacji:\n" +
                        "0 głowa\n" +
                        "1 twarz\n" +
                        "2 szyja\n" +
                        "3 bark\n" +
                        "4 ramię\n" +
                        "5 łokieć\n" +
                        "6 przedramię\n" +
                        "7 ręka\n" +
                        "8 klatka\n" +
                        "9 brzuch\n" +
                        "10 biodro\n" +
                        "11 udo\n" +
                        "12 kolano\n" +
                        "13 goleń\n" +
                        "14 stopa\n" +
                        "proszę wpiszać numer lub nazwę lokalizacji bez polskich liter");
            }
        }
        return hitLocalisationInt;
    }

}
