package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

import java.util.Objects;

/**
 * This class made for constructor "Helmet".
 */
public class Helmet extends MotoArmor {

    /**
     * Field identify the type of helmet.
     */
    private boolean isOpen;

    /**
     * Field identify is this helmet has garniture.
     */
    private boolean isGarniture;

    public Helmet(String name, String price, double weight, int protectionClass, boolean isOpen, boolean isGarniture) {
        super(name, price, weight, protectionClass);
        this.isOpen = isOpen;
        this.isGarniture = isGarniture;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isGarniture() {
        return isGarniture;
    }

    public void setGarniture(boolean garniture) {
        isGarniture = garniture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Helmet)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Helmet helmet = (Helmet) o;
        return isOpen == helmet.isOpen
                && isGarniture == helmet.isGarniture;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOpen, isGarniture);
    }
}
