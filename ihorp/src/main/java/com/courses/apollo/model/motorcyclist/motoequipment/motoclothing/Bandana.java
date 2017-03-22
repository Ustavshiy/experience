package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

import java.util.Objects;

/**
 * This class made for constructor "Bandana".
 */
public class Bandana extends MotoClothing {

    /**
     * Field identify is the Bandana has print of the Fire.
     */
    private boolean isFirePrint;

    public Bandana(String name, String price, double weight, String size, boolean isFirePrint) {
        super(name, price, weight, size);
        this.isFirePrint = isFirePrint;
    }

    public boolean isFirePrint() {
        return isFirePrint;
    }

    public void setFirePrint(boolean firePrint) {
        isFirePrint = firePrint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Bandana)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Bandana bandana = (Bandana) o;
        return isFirePrint == bandana.isFirePrint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFirePrint);
    }
}
