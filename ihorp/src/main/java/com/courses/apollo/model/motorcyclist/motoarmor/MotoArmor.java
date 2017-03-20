package com.courses.apollo.model.motorcyclist.motoarmor;

import com.courses.apollo.model.motorcyclist.Motorcyclist;

/**
 * This class made constructor for all of sub classes "MotoArmor"
 */
public class MotoArmor extends Motorcyclist {

    public MotoArmor() {}

    /**
     * This variable contains the information of protection class of MotoArmor.
     */
    protected int protectionClass;

    public MotoArmor (String name, String price, double weight, int protectionClass) {
        this.protectionClass = protectionClass;
    }

    public int getProtectionClass() {
        return protectionClass;
    }

    public void setProtectionClass(int protectionClass) {
        this.protectionClass = protectionClass;
    }
}
