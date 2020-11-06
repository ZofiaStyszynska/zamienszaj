package com.company;

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
        System.out.println("     *******           ZAMIENSZAJ           *******");
        System.out.println("           system obrażeń do gier fabularnych");
        System.out.println("            we współpracy z Zofią Styszyńską\n");
        DramaticPause(1000);
    }

    public static void Menu(){
        System.out.println("Menu:");
        System.out.println("1) Wyświetl informacje o programie.");
        System.out.println("2) Wprowadź współczynniki postaci");
        System.out.println("3) Użyj szablonu postaci");

    }

    public static void ArmourList() {
        System.out.println("0 - brak zbroi / zakończ \n" +
                "1 - pełen pancerz płytowy \n" +
                "2 - pełny pancerz kolczy \n" +
                "3 - pełny pancerz skórzany \n" +
                "4 - hełm stalowy z przyłbicą \n" +
                "5 - hełm stalowy otwarty \n" +
                "6 - czepiec kolczy \n" +
                "7 - hełm skórzany");

    }
    public static void setArmourMenu(){
        System.out.println("1) Zako�cz.");
        System.out.println("2) Dodaj nast�pny element.");
        System.out.println("3) Wy�wietl list� dodanych element�w zbroi.");
        System.out.println("4) Wy�wietl katalog dost�pnych element�w.");
        System.out.println("5) ");

    }

}
