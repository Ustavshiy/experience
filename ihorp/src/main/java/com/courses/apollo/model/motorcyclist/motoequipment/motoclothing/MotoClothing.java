package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

/**
 * This class made constructor for all of sub classes "MotoClothing"
 */
public class MotoClothing extends MotoEquipment {

    public MotoClothing() {}

    /**
     * Field contains information of size.
     */
    protected String size;

    public MotoClothing(String name, String price, double weight, String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
