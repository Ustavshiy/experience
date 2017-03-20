package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

/**
 * This class made for constructor "Glove"
 */
public class Glove extends MotoArmor{


    /**
     * Field identify is the Glovs made with Nylon.
     */
    private boolean isNylon;

    public Glove(String name, String price, double weight, int protectionClass, boolean isNylon) {
        this.isNylon = isNylon;
    }

    public boolean isNylon() {
        return isNylon;
    }

    public void setNylon(boolean nylon) {
        isNylon = nylon;
    }
}
