package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

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
}
