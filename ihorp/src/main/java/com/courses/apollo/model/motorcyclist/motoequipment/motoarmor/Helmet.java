package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

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
}
