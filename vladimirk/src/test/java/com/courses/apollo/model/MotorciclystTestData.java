package com.courses.apollo.model;

import com.courses.apollo.model.motorcyclist.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class MotorciclystTestData.
 */
public class MotorciclystTestData {

    public static List<Equipment> getEquipments() {
        Equipment helmet = new Helmet(50000, 1300);
        Equipment armor = new Armor(200000, 4200);
        Equipment overall = new Overall(30000, 800);
        Equipment gloves = new Gloves(10000, 360);
        Equipment boots = new Boots(25000, 1800);
        ArrayList<Equipment> equipments = new ArrayList();
        equipments.add(helmet);
        equipments.add(armor);
        equipments.add(overall);
        equipments.add(gloves);
        equipments.add(boots);
        return equipments;
    }

    public static Motorcyclist getMotorcyclist() {
        List<Equipment> equipments = getEquipments();
        Motorcyclist motorcyclist = new Motorcyclist(equipments, false);
        return motorcyclist;
    }

    public static List<Equipment> getExpectedEquipmentSortedByWeight() {
        Equipment helmet = new Helmet(50000, 1300);
        Equipment armor = new Armor(200000, 4200);
        Equipment overall = new Overall(30000, 800);
        Equipment gloves = new Gloves(10000, 360);
        Equipment boots = new Boots(25000, 1800);
        ArrayList<Equipment> equipments = new ArrayList();
        equipments.add(gloves);
        equipments.add(overall);
        equipments.add(helmet);
        equipments.add(boots);
        equipments.add(armor);
        return equipments;
    }

    public static List<Equipment> getExpectedEquipmentFindedInPriceRange() {
        Equipment helmet = new Helmet(50000, 1300);
        Equipment overall = new Overall(30000, 800);
        ArrayList<Equipment> equipments = new ArrayList();
        equipments.add(helmet);
        equipments.add(overall);
        return equipments;
    }

}
