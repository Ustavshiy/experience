package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

/**
 * This class made for constructor "Bandana"
 */
public class Bandana extends MotoClothing{

    /**
     * Field identify is the Bandana has print of the Fire.
     */
    private boolean isFirePrint;

    public Bandana(String name, String price, double weight, String size, boolean isFirePrint) {
        this.isFirePrint = isFirePrint;
    }

    public boolean isFirePrint() {
        return isFirePrint;
    }

    public void setFirePrint(boolean firePrint) {
        isFirePrint = firePrint;
    }
}
