package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.util.Objects;

/**
 * This class made constructor for all of sub classes "MotoArmor".
 */
public class MotoArmor extends MotoEquipment {

    public MotoArmor() {}

    /**
     * This variable contains the information of protection class of MotoArmor.
     */
    protected int protectionClass;

    public MotoArmor(String name, String price, double weight, int protectionClass) {
        super(name, price, weight);
        this.protectionClass = protectionClass;
    }

    public int getProtectionClass() {
        return protectionClass;
    }

    public void setProtectionClass(int protectionClass) {
        this.protectionClass = protectionClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MotoArmor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MotoArmor motoArmor = (MotoArmor) o;
        return protectionClass == motoArmor.protectionClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), protectionClass);
    }
}
