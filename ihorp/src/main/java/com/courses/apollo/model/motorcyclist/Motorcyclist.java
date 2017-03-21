package com.courses.apollo.model.motorcyclist;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.util.ArrayList;

/**
 * Constructor class of object type Motorcyclist.
 */
public class Motorcyclist {

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
}
