package com.company.armour;

public enum Localisation {

    HEAD(0),       //  0 - głowa - head
    FACE(1),       //  1 - twarz - face
    NECK(2),       //  2 - szyja - neck
    SHOULDER(3),   //  3 - bark - shoulder
    ARM(4),        //  4 - ramię - arm
    ELBOW(5),      //  5 - łokieć - elbow
    FOREARM(6),    //  6 - przedramię - forearm
    HAND(7),       //  7 - ręka - hand
    CHEST(8),      //  8 - klatka - chest
    ABDOMEN(9),    //  9 - brzuch - abdomen
    HIP(10),       // 10 - biodro - hip
    THIGH(11),     // 11 - udo - thigh
    KNEE(12),      // 12 - kolano - knee
    CRUS(13),      // 13 - goleń - leg(crus)
    FOOT(14);      // 14 - stopa - foot

    private int localisation;

    Localisation(int loc) {localisation = loc;}

    int getLocalisation() {return localisation;}
}
