package com.company;

public class Wound {
    private int hitStrength;
    private int hitType;
    private int hitLocalisation;
    private int roundOfOccurrence;


    public Wound(int hitLocalisation, int hitType, int hitStrength, int roundOfOccurrence) {
        this.hitStrength = hitStrength;
        this.hitType = hitType;
        this.hitLocalisation = hitLocalisation;
        this.roundOfOccurrence = roundOfOccurrence;
    }

    public int bleeding(int currentRound, boolean lowCondition, boolean criticalCondition) {
        BigData bigData = new BigData();
        int amountOfRounds = currentRound - roundOfOccurrence;
        int bleeding = 0;
        if (hitStrength < 0) hitStrength = 0;
        if (hitStrength > 9) hitStrength = 9;

        if (amountOfRounds > 0 && !lowCondition && !criticalCondition) {
            bleeding = bigData.bleedingArray()[hitType][hitLocalisation][hitStrength] - amountOfRounds / 6;
        } else if (amountOfRounds > 0 && lowCondition && !criticalCondition) {
            bleeding = bigData.bleedingArray()[hitType][hitLocalisation][hitStrength] / 2 - amountOfRounds / 6;
        } else if (amountOfRounds > 0 && lowCondition && criticalCondition) {
            bleeding = bigData.bleedingArray()[hitType][hitLocalisation][hitStrength] / 4 - amountOfRounds / 6;
        }
        if (bleeding < 0) {
            bleeding = 0;
        }

        return bleeding;
    }

    public void woundDescription() {
        BigData bigData = new BigData();
        if (hitStrength < 0) {
            hitStrength = 0;
        }
        if (hitStrength > 9) {
            hitStrength = 9;
        }
            System.out.print(bigData.woundDescriptionArray()[hitType][hitLocalisation][hitStrength] + "; krwawienie " + bigData.bleedingArray()[hitType][hitLocalisation][hitStrength] + "/rundę\n");

    }


    public int getHitStrength() {
        return hitStrength;
    }

    public void setHitStrength(int hitStrength) {
        this.hitStrength = hitStrength;
    }

    public int getHitType() {
        return hitType;
    }

    public void setHitType(int hitType) {
        this.hitType = hitType;
    }

    public int getHitLocalisation() {
        return hitLocalisation;
    }

    public void setHitLocalisation(int hitLocalisation) {
        this.hitLocalisation = hitLocalisation;
    }

    public int getRoundOfOccurrence() {
        return roundOfOccurrence;
    }

    public void setRoundOfOccurrence(int roundOfOccurrence) {
        this.roundOfOccurrence = roundOfOccurrence;
    }


}
