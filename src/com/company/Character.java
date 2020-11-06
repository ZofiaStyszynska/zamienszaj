package com.company;

public class Character {
    private int number;
    private String name;
    private String gender;
    private int vitality;
    private int toughness;
    private int[] armour;

    public Character(int number, String name, String gender, int vitality, int toughness, int[] armour) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.vitality = vitality;
        this.toughness = toughness;
        this.armour = armour;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int[] getArmour() {
        return armour;
    }

    public void setArmour(int[] armour) {
        this.armour = armour;
    }
}
