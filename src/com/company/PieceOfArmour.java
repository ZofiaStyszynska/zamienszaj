package com.company;

public class PieceOfArmour {
    int catalogueNumber;
    String name;
    int[] protByLoc;      //protection of armour by localisation, which is shown in "BigData" class

    public PieceOfArmour(int catalogueNumber, String name, int[] protByLoc) {
        this.catalogueNumber = catalogueNumber;
        this.name = name;
        this.protByLoc = protByLoc;
    }

    public int getCatalogueNumber() {
        return catalogueNumber;
    }

    public void setCatalogueNumber(int catalogueNumber) {
        this.catalogueNumber = catalogueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getProtByLoc() {
        return protByLoc;
    }

    public void setProtByLoc(int[] protByLoc) {
        this.protByLoc = protByLoc;
    }
}
