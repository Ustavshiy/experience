package com.courses.apollo.model.motorcyclist;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Constructor class of object type Motorcyclist.
 */
public class Motorcyclist implements Serializable {

    public Motorcyclist() {}

    /**
     * Name of Motorcyclist.
     */
    private String name;

    /**
     * The List of Motorcyclist's Armor.
     */
    private ArrayList<MotoEquipment> motoEquipment;

    public Motorcyclist(String name, ArrayList<MotoEquipment> motoEquipment) {
        this.name = name;
        this.motoEquipment = motoEquipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MotoEquipment> getMotoEquipment() {
        return motoEquipment;
    }

    public void setMotoEquipment(ArrayList<MotoEquipment> motoEquipment) {
        this.motoEquipment = motoEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Motorcyclist that = (Motorcyclist) o;
        return Objects.equals(name, that.name)
                && Objects.equals(motoEquipment, that.motoEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, motoEquipment);
    }
}
