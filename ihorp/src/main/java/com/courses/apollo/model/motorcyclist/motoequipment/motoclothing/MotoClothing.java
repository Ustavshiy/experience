package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.util.Objects;

/**
 * This class made constructor for all of sub classes "MotoClothing".
 */
public class MotoClothing extends MotoEquipment {

    public MotoClothing() {}

    /**
     * Field contains information of size.
     */
    protected String size;

    public MotoClothing(String name, String price, double weight, String size) {
        super(name, price, weight);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MotoClothing)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MotoClothing that = (MotoClothing) o;
        return Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
