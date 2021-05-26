package com.company;

import java.util.ArrayList;
import java.util.List;

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

    public static Character template (int num){

        return (Character) catalogue().get(num-1);
    }

    public static List catalogue() {
        List<Character> catalogue = new ArrayList<>();
        catalogue.add(new Character(1, "Magnar", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "Ravandil", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "Siegfied", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "Ulrich", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "Ludmila", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "Ursula", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "Hans", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "ork", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "duży ork", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "troll", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "gigant", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        catalogue.add(new Character(1, "smok", "m", 80, 4, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));


        return catalogue;
    }

    public static void showCatalogue(List<Character> catalogue) {
        int i = 1;
        for (Character character : catalogue) {
            System.out.println(i+". "+character.getName());
            i++;
        }
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

    public int getArmourProt(int loc){
        return armour[loc];
    }

    public void setArmour(int[] armour) {
        this.armour = armour;
    }
}
