package com.company;

public class PieceOfArmour {
    private int catalogueNo;
    private int[] protection;

    public PieceOfArmour(int catalogueNo, int[] protection) {
        this.catalogueNo = catalogueNo;
        this.protection = protection;
    }

    public int getCatalogueNo() {
        return catalogueNo;
    }

    public void setCatalogueNo(int catalogueNo) {
        this.catalogueNo = catalogueNo;
    }

    public int[] getProtection() {
        return protection;
    }

    public void setProtection(int[] protection) {
        this.protection = protection;
    }

}
