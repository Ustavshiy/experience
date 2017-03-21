package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

/**
 * This class made for constructor "BodyArmor".
 */
public class BodyArmor extends MotoArmor {

    public BodyArmor() {

    }

    /**
     * Field identify is this armor made with plastic.
     */
    private boolean isPlastic;

    public BodyArmor(String name, String price, double weight, int protectionClass, boolean isPlastic) {
        super(name, price, weight, protectionClass);
        this.isPlastic = isPlastic;
    }

    public boolean isPlastic() {
        return isPlastic;
    }

    public void setPlastic(boolean plastic) {
        isPlastic = plastic;
    }
}
