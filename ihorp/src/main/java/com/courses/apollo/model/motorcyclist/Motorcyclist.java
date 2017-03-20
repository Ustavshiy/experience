package com.courses.apollo.model.motorcyclist;

import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.MotoArmor;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.MotoClothing;

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
    private ArrayList<MotoArmor> motoArmors;

    /**
     * The List of Motorcyclist's Clothing.
     */
    private ArrayList<MotoClothing> motoClothings;

    public Motorcyclist(String name, ArrayList<MotoArmor> motoArmors, ArrayList<MotoClothing> motoClothings) {
        this.motoArmors = motoArmors;
        this.motoClothings = motoClothings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MotoArmor> getMotoArmors() {
        return motoArmors;
    }

    public void setMotoArmors(ArrayList<MotoArmor> motoArmors) {
        this.motoArmors = motoArmors;
    }

    public ArrayList<MotoClothing> getMotoClothings() {
        return motoClothings;
    }

    public void setMotoClothings(ArrayList<MotoClothing> motoClothings) {
        this.motoClothings = motoClothings;
    }
}
