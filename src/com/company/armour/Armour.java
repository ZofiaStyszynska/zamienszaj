package com.company.armour;

public class Armour {
    public Armour(){}
    Armour prepareArmour(int protection, Localisation...localisations){
        return new Armour();
    }
    Armour helmet = prepareArmour(3,Localisation.HEAD,Localisation.NECK);
}
