package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Display {

    static void DramaticPause(int duration) {
        try {
            TimeUnit.MILLISECONDS.sleep(duration);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public static void InitialMessage() {
        System.out.println(" ");
        System.out.println("             Mateusz Styszyński prezentuje");
        DramaticPause(500);
        System.out.println("                                                   ");
        System.out.println("       ___________                                          ");
        System.out.println("      /______    /                                        ");
        System.out.println("            /  /         __           __       __       __    _______     _______   ________         __                 __");
        System.out.println("          /  /         /   |         /  |     /  |     |  |  |   ____|  /   ____|  /____   /       /   |               |  |");
        System.out.println("        /  /         /  /|  |       /    |  /    |    /  /  /  /____   |  |___        /  /       /  /|  |             /  /");
        System.out.println("      /  /         /  /___|  |     /  /|  /  /|  |   /  /  /  _____/    |___  |     /  /       /  /___|  |    __     /  /");
        System.out.println("    /  /______   /  ________  |   /  /  |__/  |  |  /  /  /  /____    _____/  /   /  /____   /  ________  |  |  |___/  /   ");
        System.out.println("  /__________/ /__/         |__| /__/         |__| |__|  |______  |  |_______/  /________/ /__/         |__|  |_______/     ");
        System.out.println("                                                               /_/ ");
        DramaticPause(500);
        System.out.println("           system obrażeń do gier fabularnych");
        System.out.println("            we współpracy z Zofią Styszyńską\n");
        DramaticPause(700);
    }

    public static void Menu() {
        System.out.println("\n Menu:");
        System.out.println("1) Wyświetl informacje o programie.");
        System.out.println("2) Wprowadź współczynniki postaci");
        System.out.println("3) Użyj szablonu postaci");
        System.out.println("4) Zmień system obliczania obrażeń");
        System.out.println("5) Przejdź dalej");


    }

    public static void info() {
        System.out.println(
                "\n Program jest narzędziem pomocniczym dla gier fabularnych.                  " +
                "\n Zadaniem programu jest przechowywanie bardzo rozbudowanej tabelki obrażeń, " +
                "\n obliczanie i podsumowywanie otrzymanych przez postać obrażeń.              " +
                "\n Parametry postaci można wprowadzić ręcznie (opcja 2) lub skorzystać        " +
                "\n z gotowych szablonów (opcja 3).                                            " +
                "\n Domyślnym sposobem jest ten jaki używa się w pierwszej edycji Warhammera   " +
                "\n a zatem wynik rzutu k6 powiększone o siłę atakującego i pomniejszone       " +
                "\n o wytrzymałość postaci obrażenie i punkty pancerza jego zbroi (k6+S-Wt-PP) " +
                "\n ");
    } // do napisania

    public static void armourSettingMenu() {
        System.out.println("1) Zakończ.");
        System.out.println("2) Dodaj następny element.");
        System.out.println("3) Wyświetl listę dodanych elementów zbroi.");
        System.out.println("4) Wyświetl katalog dostępnych elementów.");
        System.out.println("5) ");

    }

    public static void showArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void showArray(ArrayList<Integer> arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void showCharacter(Character character){
        System.out.print("Nr: " + character.getNumber() + ", imię: " + character.getName() + ", rodzaj gramatyczny: ");
        switch (character.getGender()){
            case "m":
                System.out.println("męski,");
                break;
            case "ż":
            case "z":
                System.out.println("żeński,");
                break;
            default:
                System.out.println("nijaki,");
        }
        System.out.println("żywotność: " + character.getVitality() + ", wytrzymałość: " + character.getToughness());
        System.out.print("zbroja: ");
        showArray(character.getArmour());
        System.out.println();
    }

}
