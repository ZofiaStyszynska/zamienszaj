package com.company;

import java.util.ArrayList;
import java.util.List;

public class Armour {


    public static List catalogue() {
        List<PieceOfArmour> catalogue = new ArrayList<>();
        catalogue.add(new PieceOfArmour(0, "brak zbroi", new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(1, "pełny pancerz płytowy", new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}));
        catalogue.add(new PieceOfArmour(2, "pełny pancerz kolczy", new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
        catalogue.add(new PieceOfArmour(3, "pełny pancerz skórzany", new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        catalogue.add(new PieceOfArmour(4, "hełm zamkniety", new int[]{3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(5, "hełm otwarty", new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(6, "czepiec kolczy", new int[]{2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(7, "hełm skórzany", new int[]{1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(8, "naramienniki", new int[]{0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(9, "nałokietniki", new int[]{0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(10, "karwasze", new int[]{0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(11, "rękawice płytowe", new int[]{0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(12, "napierśnik", new int[]{0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(13, "takie coś na biodra", new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(14, "takie coś na uda", new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0}));
        catalogue.add(new PieceOfArmour(15, "nakolanniki", new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0}));

        return catalogue;
    }

    public static void showCatalogue(List<PieceOfArmour> catalogue) {
        for (PieceOfArmour pieceOfArmour : catalogue) {
            System.out.println(pieceOfArmour.getCatalogueNumber() + " - " + pieceOfArmour.getName());
        }
    }

    public static int[] protection(List<Integer> pieces, List<PieceOfArmour> catalogue) {
        // "pieces" to lista wybranych przez użytkownika elementów zbroi wg ich numerów katalogowych
        // Metoda pobiera z katalogu tablicę intów określającą ochronę (0-3) wybranego elementu zbroi.
        // Każdy numer odpowiada odpowiedniej lokalazcji na ciele.
        // Następnie w pętli "sumowane" są protekcje wszystkich elementów - tzn. wybierana zostaje wyższa.
        int[] prot = new int[15];
        for (Integer piece : pieces) {
            PieceOfArmour item = catalogue.get(piece);
            for (int j = 0; j < 15; j++) {
                if (prot[j] < item.getProtByLoc()[j]) prot[j] = item.getProtByLoc()[j];
            }

        }

        return prot;

    }


}


