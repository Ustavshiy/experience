package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

import java.util.Objects;

/**
 * This class made for constructor "Glove".
 */
public class Glove extends MotoArmor {


    /**
     * Field identify is the Glovs made with Nylon.
     */
    private boolean isNylon;

    public Glove(String name, String price, double weight, int protectionClass, boolean isNylon) {
        super(name, price, weight, protectionClass);
        this.isNylon = isNylon;
    }

    public boolean isNylon() {
        return isNylon;
    }

    public void setNylon(boolean nylon) {
        isNylon = nylon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Glove)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Glove glove = (Glove) o;
        return isNylon == glove.isNylon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isNylon);
    }
}
