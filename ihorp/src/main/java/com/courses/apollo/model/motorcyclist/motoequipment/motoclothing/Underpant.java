package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

import java.util.Objects;

/**
 * This class made for constructor "Underpant".
 */
public class Underpant extends MotoClothing {

    /**
     * Field identify is this Undetpants skipp smell.
     */
    private boolean skipSmell;

    public Underpant(String name, String price, double weight, String size, boolean skipSmell) {
        super(name, price, weight, size);
        this.skipSmell = skipSmell;
    }

    public boolean isSkipSmell() {
        return skipSmell;
    }

    public void setSkipSmell(boolean skipSmell) {
        this.skipSmell = skipSmell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Underpant)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Underpant underpant = (Underpant) o;
        return skipSmell == underpant.skipSmell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skipSmell);
    }
}
