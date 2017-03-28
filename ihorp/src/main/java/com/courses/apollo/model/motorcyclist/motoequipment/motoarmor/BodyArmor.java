package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BodyArmor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        BodyArmor bodyArmor = (BodyArmor) o;
        return isPlastic == bodyArmor.isPlastic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPlastic);
    }
}
