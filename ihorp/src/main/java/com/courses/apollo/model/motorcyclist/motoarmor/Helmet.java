package com.courses.apollo.model.motorcyclist.motoarmor;

/**
 * This class made for constructor "Helmet"
 */
public class Helmet extends MotoArmor {

    /**
     * Field identify the type of helmet.
     */
    boolean isOpen;

    /**
     * Field identify is this helmet has garniture.
     */
    boolean isGarniture;

    public Helmet (String name, String price, double weight, int protectionClass, boolean isOpen, boolean isGarniture) {
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
}
