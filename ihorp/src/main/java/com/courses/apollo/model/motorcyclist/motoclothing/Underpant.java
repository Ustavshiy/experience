package com.courses.apollo.model.motorcyclist.motoclothing;

/**
 * This class made for constructor "Underpant"
 */
public class Underpant extends MotoClothing{

    /**
     * Field identify is this Undetpants skipp smell.
     */
    private boolean skipSmell;

    public Underpant(String name, String price, double weight, String size, boolean skipSmell) {
        this.skipSmell = skipSmell;
    }
}
