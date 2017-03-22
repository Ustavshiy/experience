package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

import java.util.Objects;

/**
 * This class made for constructor "Boots".
 */
public class Boot extends MotoArmor {

    /**
     * Field identify is this Boots has a quick off system.
     */
    private boolean quickTakeOff;

    public Boot(String name, String price, double weight, int protectionClass, boolean quickTakeOff) {
        super(name, price, weight, protectionClass);
        this.quickTakeOff = quickTakeOff;
    }

    public boolean isQuikTakeOff() {
        return quickTakeOff;
    }

    public void setQuikTakeOff(boolean quikTakeOff) {
        this.quickTakeOff = quikTakeOff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Boot)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Boot boot = (Boot) o;
        return quickTakeOff == boot.quickTakeOff;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quickTakeOff);
    }
}
