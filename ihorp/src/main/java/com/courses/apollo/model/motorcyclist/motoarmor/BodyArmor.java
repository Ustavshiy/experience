package com.courses.apollo.model.motorcyclist.motoarmor;

/**
 * This class made for constructor "BodyArmor"
 */
public class BodyArmor extends MotoArmor{

    /**
     * Field identify is this armor made with plastic.
     */
    boolean isPlastic;

    public BodyArmor (String name, String price, double weight, int protectionClass, boolean isPlastic) {
        this.isPlastic = isPlastic;
    }

    public boolean isPlastic() {
        return isPlastic;
    }

    public void setPlastic(boolean plastic) {
        isPlastic = plastic;
    }
}
