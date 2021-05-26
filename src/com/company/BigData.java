package com.company;

public class BigData {
    public int[][][] bleedingArray() {
        int[][][] bleeding = new int[6][15][10];
// Ta tablica przechowuje wielkość krwawienia dla określonej rany. - This array stores a value of bleeding for specified wound.
// Jest to ilość punktów obrażeń na rundę. - It is number of hit points per round.
// Wyróżniamy różne rodzaje ran w zależności od mechanizmu ich powstania: - There are different kinds of wound:
//  0 - cięte - cut
//  1 - tłuczone - broken
//  2 - rąbane - chopped
//  3 - kłute - stab
//  4 - szarpane
//  5 - oparzenia - burns
// Pierwszy indeks tablicy odpowiada właśnie rodzajowi rany. - First index of this array refers to the wound type.
// Drugi indeks tablicy odpowiada lokalizacji rany. - Second index of this array refers to localisation of a wound.
//  0 - głowa - head
//  1 - twarz - face
//  2 - szyja - neck
//  3 - bark - shoulder
//  4 - ramię - arm
//  5 - łokieć - elbow
//  6 - przedramię - forearm
//  7 - ręka - hand
//  8 - klatka - chest
//  9 - brzuch - abdomen
// 10 - biodro - hip
// 11 - udo - thigh
// 12 - kolano - knee
// 13 - goleń - leg(crus)
// 14 - stopa - foot
// Trzeci indeks pokazuje jak poważna to rana - Third indeks shows how serious is the wound.

// *************

// [0][][]  rany cięte - cut wounds

// [][0]  głowa - head
        bleeding[0][0][0] = 0;
        bleeding[0][0][1] = 1;
        bleeding[0][0][2] = 1;
        bleeding[0][0][3] = 2;
        bleeding[0][0][4] = 2;
        bleeding[0][0][5] = 3;
        bleeding[0][0][6] = 3;
        bleeding[0][0][7] = 4;
        bleeding[0][0][8] = 4;
        bleeding[0][0][9] = 5;

// [][1]  twarz - face
        bleeding[0][1][0] = 0;
        bleeding[0][1][1] = 1;
        bleeding[0][1][2] = 2;
        bleeding[0][1][3] = 3;
        bleeding[0][1][4] = 4;
        bleeding[0][1][5] = 4;
        bleeding[0][1][6] = 5;
        bleeding[0][1][7] = 6;
        bleeding[0][1][8] = 7;
        bleeding[0][1][9] = 8;

// [][2]  szyja - neck
        bleeding[0][2][0] = 0;
        bleeding[0][2][1] = 1;
        bleeding[0][2][2] = 2;
        bleeding[0][2][3] = 4;
        bleeding[0][2][4] = 8;
        bleeding[0][2][5] = 10;
        bleeding[0][2][6] = 10;
        bleeding[0][2][7] = 10;
        bleeding[0][2][8] = 10;
        bleeding[0][2][9] = 10;

// [][3]  bark - shoulder
        bleeding[0][3][0] = 0;
        bleeding[0][3][1] = 1;
        bleeding[0][3][2] = 2;
        bleeding[0][3][3] = 3;
        bleeding[0][3][4] = 3;
        bleeding[0][3][5] = 4;
        bleeding[0][3][6] = 8;
        bleeding[0][3][7] = 9;
        bleeding[0][3][8] = 10;
        bleeding[0][3][9] = 10;

// [][4]  ramię - arm {1, 2, 3, 4, 5, 6, 7, 8, 8};
        bleeding[0][4][0] = 0;
        bleeding[0][4][1] = 1;
        bleeding[0][4][2] = 2;
        bleeding[0][4][3] = 3;
        bleeding[0][4][4] = 4;
        bleeding[0][4][5] = 5;
        bleeding[0][4][6] = 6;
        bleeding[0][4][7] = 7;
        bleeding[0][4][8] = 7;
        bleeding[0][4][9] = 7;

// [][5]  łokieć - elbow {1, 2, 3, 3, 4, 4, 6, 7, 7};
        bleeding[0][5][0] = 1;
        bleeding[0][5][1] = 2;
        bleeding[0][5][2] = 3;
        bleeding[0][5][3] = 3;
        bleeding[0][5][4] = 4;
        bleeding[0][5][5] = 4;
        bleeding[0][5][6] = 6;
        bleeding[0][5][7] = 6;
        bleeding[0][5][8] = 6;

// [][6]  przedramię - forearm {1, 2, 3, 3, 4, 4, 5, 6, 6};
        bleeding[0][6][0] = 1;
        bleeding[0][6][1] = 2;
        bleeding[0][6][2] = 3;
        bleeding[0][6][3] = 3;
        bleeding[0][6][4] = 4;
        bleeding[0][6][5] = 4;
        bleeding[0][6][6] = 5;
        bleeding[0][6][7] = 5;
        bleeding[0][6][8] = 5;

// [][7]  ręka - hand {1, 1, 2, 2, 3, 3, 4, 4, 4};
        bleeding[0][7][0] = 1;
        bleeding[0][7][1] = 1;
        bleeding[0][7][2] = 2;
        bleeding[0][7][3] = 2;
        bleeding[0][7][4] = 3;
        bleeding[0][7][5] = 3;
        bleeding[0][7][6] = 4;
        bleeding[0][7][7] = 4;
        bleeding[0][7][8] = 4;

// [][8]  klatka - chest {1, 2, 2, 3, 4, 5, 6, 7, 12};
        bleeding[0][8][0] = 1;
        bleeding[0][8][1] = 2;
        bleeding[0][8][2] = 2;
        bleeding[0][8][3] = 3;
        bleeding[0][8][4] = 4;
        bleeding[0][8][5] = 5;
        bleeding[0][8][6] = 6;
        bleeding[0][8][7] = 7;
        bleeding[0][8][8] = 12;

// [][9]  brzuch - abdomen {1, 2, 3, 4, 5, 6, 7, 8, 12};
        bleeding[0][9][0] = 1;
        bleeding[0][9][1] = 2;
        bleeding[0][9][2] = 3;
        bleeding[0][9][3] = 4;
        bleeding[0][9][4] = 5;
        bleeding[0][9][5] = 6;
        bleeding[0][9][6] = 7;
        bleeding[0][9][7] = 8;
        bleeding[0][9][8] = 12;

// [][10]  biodro - hip {1, 1, 2, 2, 3, 4, 5, 6, 10};
        bleeding[0][10][0] = 1;
        bleeding[0][10][1] = 1;
        bleeding[0][10][2] = 2;
        bleeding[0][10][3] = 2;
        bleeding[0][10][4] = 3;
        bleeding[0][10][5] = 4;
        bleeding[0][10][6] = 5;
        bleeding[0][10][7] = 6;
        bleeding[0][10][8] = 8;

// [][11]  udo - thigh {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bleeding[0][11][0] = 1;
        bleeding[0][11][1] = 2;
        bleeding[0][11][2] = 3;
        bleeding[0][11][3] = 4;
        bleeding[0][11][4] = 5;
        bleeding[0][11][5] = 6;
        bleeding[0][11][6] = 7;
        bleeding[0][11][7] = 7;
        bleeding[0][11][8] = 7;

// [][12]  kolano - knee {1, 2, 3, 3, 4, 4, 6, 7, 8};
        bleeding[0][12][0] = 1;
        bleeding[0][12][1] = 2;
        bleeding[0][12][2] = 3;
        bleeding[0][12][3] = 3;
        bleeding[0][12][4] = 4;
        bleeding[0][12][5] = 4;
        bleeding[0][12][6] = 6;
        bleeding[0][12][7] = 6;
        bleeding[0][12][8] = 6;

// [][13]  goleń - leg(crus) {1, 2, 3, 3, 4, 4, 5, 6, 7};
        bleeding[0][13][0] = 1;
        bleeding[0][13][1] = 2;
        bleeding[0][13][2] = 3;
        bleeding[0][13][3] = 3;
        bleeding[0][13][4] = 4;
        bleeding[0][13][5] = 4;
        bleeding[0][13][6] = 5;
        bleeding[0][13][7] = 5;
        bleeding[0][13][8] = 5;

// [][14]  stopa - foot {1, 1, 2, 2, 3, 3, 4, 4, 4};
        bleeding[0][14][0] = 1;
        bleeding[0][14][1] = 1;
        bleeding[0][14][2] = 2;
        bleeding[0][14][3] = 2;
        bleeding[0][14][4] = 3;
        bleeding[0][14][5] = 3;
        bleeding[0][14][6] = 4;
        bleeding[0][14][7] = 4;
        bleeding[0][14][8] = 4;

//************************


        return bleeding;

    }

    public String[][][] woundDescriptionArray() {
        String[][][] woundDescription = new String[6][15][10];

// [0][][]  cut wounds

// [][0][] head
        woundDescription[0][0][0] = "nic się nie stało";
        woundDescription[0][0][1] = "skaleczenie, PW - 1";
        woundDescription[0][0][2] = "głębokie skaleczenie, PW -2";
        woundDescription[0][0][3] = "pęknięcie kości, oszołomienie 1 runda";
        woundDescription[0][0][4] = "złamanie kości, oszołomienie 2 rundy";
        woundDescription[0][0][5] = "złamanie kości, uszkodzenie opony twardej, utrata przytomności";
        woundDescription[0][0][6] = "uszkodzenie istoty szarej mózgu, utrata przytomności";
        woundDescription[0][0][7] = "ciężkie uszkodzenie mózgu, utrata przytomności";
        woundDescription[0][0][8] = "ciężkie uszkodzenie mózgu, śmierć";
        woundDescription[0][0][9] = "ciężkie uszkodzenie mózgu, śmierć";

// [][1][]  face
        woundDescription[0][1][0] = "nic się nie stało";
        woundDescription[0][1][1] = "skaleczenie";
        woundDescription[0][1][2] = "głębokie skaleczenie";
        woundDescription[0][1][3] = "głęboka rana cięta, złamanie kości jarzmowej";
        woundDescription[0][1][4] = "głęboka rana cięta, złamanie szczęki, wybicie zębów";
        woundDescription[0][1][5] = "głęboka rana cięta, złamanie kości, uszkodzenie oka";
        woundDescription[0][1][6] = "głęboka rana cięta, złamanie żuchwy, rozcięcie języka i dna jamy ustnej";
        woundDescription[0][1][7] = "ciężki uraz jamy ustnej i nosowej";
        woundDescription[0][1][8] = "ciężki uraz jamy ustnej i nosowej";
        woundDescription[0][1][9] = "ciężki uraz jamy ustnej, nosowej i oczodołu";

// [][2][]  neck
        woundDescription[0][2][0] = "nic się nie stało";
        woundDescription[0][2][1] = "skaleczenie";
        woundDescription[0][2][2] = "głębokie skaleczenie, przecięcie mięśnia, Ref-1";
        woundDescription[0][2][3] = "głęboka rana, przecięcie mięśni, przecięcie tętnicy, Ref-2";
        woundDescription[0][2][4] = "głęboka rana, przecięcie mięśni, przecięcie tętnicy, Ref-3";
        woundDescription[0][2][5] = "głęboka rana, przecięcie mięśni, tchawicy, tętnic, Ref-3, zadyszka +2/r.";
        woundDescription[0][2][6] = "głęboka rana, przecięcie mięśni, tchawicy, tętnic, Ref-4, zadyszka +2/r.";
        woundDescription[0][2][7] = "głęboka rana, przecięcie mięśni, tchawicy, przełyku, tętnic, oszołomienie 1 r., Ref-4, zadyszka +3/r.";
        woundDescription[0][2][8] = "głęboka rana, przecięcie mięśni, tchawicy, przełyku, tętnic, Ref=0, zadyszka +3/r.";
        woundDescription[0][2][9] = "dekapitacja";

// [][3][]  shoulder
        woundDescription[0][3][0] = "nic się nie stało";
        woundDescription[0][3][1] = "skalecznie";
        woundDescription[0][3][2] = "głębokie skaleczenie";
        woundDescription[0][3][3] = "głęboka rana, przecięcie mięśnia czworobocznego, Ref-1";
        woundDescription[0][3][4] = "głęboka rana, przecięcie mięśnia naramiennego, złamanie wyrostka barkowego, Ref-2, PW-1";
        woundDescription[0][3][5] = "głęboka rana, przecięcie mięśnia czworobocznego i obojczyka Ref-2, PW-1";
        woundDescription[0][3][6] = "głęboka rana, przecięcie mięśnia czworobocznego, obojczyka i tętnicy podobojczykowej, Ref-2, PW-1";
        woundDescription[0][3][7] = "głęboka rana, przecięcie mięśnia czworobocznego i obojczyka, odma Ref-2, PW-2";
        woundDescription[0][3][8] = "głęboka rana, przecięcie mięśnia czworobocznego i obojczyka, odma Ref-3, PW-2";
        woundDescription[0][3][9] = "głęboka rana, przecięcie mięśnia czworobocznego i obojczyka, odma Ref-3, PW-2";

// [][4][]  ramię - arm
        woundDescription[0][4][0] = "nic się nie stało";
        woundDescription[0][4][1] = "skaleczenie";
        woundDescription[0][4][2] = "głębokie skaleczenie";
        woundDescription[0][4][3] = "przecięcie mięśnia, Ref-1";
        woundDescription[0][4][4] = "przecięcie mięśni, Ref-2";
        woundDescription[0][4][5] = "przecięcie mięśni i naczyń, Ref-3";
        woundDescription[0][4][6] = "przecięcie mięśni, naczyń i nerwów, kończyna bezwładna";
        woundDescription[0][4][7] = "przecięcie mięśni, naczyń i nerwów, złamanie kości, kończyna bezwładna";
        woundDescription[0][4][8] = "przecięcie kości i większości mięśni, naczyń i nerwów, kończyna bezwładna";
        woundDescription[0][4][9] = "amputacja";

// [][5][]  łokieć - elbow
        woundDescription[0][5][0] = "nic się nie stało";
        woundDescription[0][5][1] = "skaleczenie";
        woundDescription[0][5][2] = "głębokie skaleczenie";
        woundDescription[0][5][3] = "przecięcie ścięgien, Ref-2";
        woundDescription[0][5][4] = "uszkodzenie stawu, Ref-3";
        woundDescription[0][5][5] = "uszkodzenie stawu, kończyna bezwładna";
        woundDescription[0][5][6] = "uszkodzenie stawu, mięśni, naczyń i nerwów, kończyna bezwładna";
        woundDescription[0][5][7] = "uszkodzenie stawu, mięśni, naczyń i nerwów, kończyna bezwładna";
        woundDescription[0][5][8] = "uszkodzenie stawu, mięśni, naczyń i nerwów, kończyna bezwładna";
        woundDescription[0][5][9] = "amputacja";




        return woundDescription;

    }
}
