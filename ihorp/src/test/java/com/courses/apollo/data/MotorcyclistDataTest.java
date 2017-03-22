package com.courses.apollo.data;

import com.courses.apollo.model.motorcyclist.Motorcyclist;
import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.*;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Balaclava;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Bandana;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Underpant;

import java.util.ArrayList;

/**
 * MotoEquipment equipment.
 */
public class MotorcyclistDataTest {

    public MotorcyclistDataTest() {}

    public static ArrayList<MotoEquipment> getTestEquipment() {

        BodyArmor bodyArmmor = new BodyArmor("Fox", "240.54", 2.54, 2, false);
        Boot boot = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove = new Glove("Nike", "30.47", 0.35, 3, true);
        Helmet helmet = new Helmet("Shark", "367.48", 2.07, 1, false, true);
        Balaclava balaclava = new Balaclava("Monster", "19.99", 0.107, "XL", true);
        Bandana bandana = new Bandana("Bald head", "9.99", 0.087, "S", true);
        Underpant underpant = new Underpant("Brown back", "4.57", 5.178, "XXL", false);

        ArrayList<MotoEquipment>  motoEquipment = new ArrayList<>();
        motoEquipment.add(bodyArmmor);
        motoEquipment.add(boot);
        motoEquipment.add(glove);
        motoEquipment.add(helmet);
        motoEquipment.add(balaclava);
        motoEquipment.add(bandana);
        motoEquipment.add(underpant);

        return motoEquipment;
    }

    public static ArrayList<MotoEquipment> getTestEquipmentSortedWeight() {

        BodyArmor bodyArmmor = new BodyArmor("Fox", "240.54", 2.54, 2, false);
        Boot boot = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove = new Glove("Nike", "30.47", 0.35, 3, true);
        Helmet helmet = new Helmet("Shark", "367.48", 2.07, 1, false, true);
        Balaclava balaclava = new Balaclava("Monster", "19.99", 0.107, "XL", true);
        Bandana bandana = new Bandana("Bald head", "9.99", 0.087, "S", true);
        Underpant underpant = new Underpant("Brown back", "4.57", 5.178, "XXL", false);

        ArrayList<MotoEquipment>  motoEquipmentSortedWeight = new ArrayList<>();
        motoEquipmentSortedWeight.add(bandana);
        motoEquipmentSortedWeight.add(balaclava);
        motoEquipmentSortedWeight.add(glove);
        motoEquipmentSortedWeight.add(helmet);
        motoEquipmentSortedWeight.add(bodyArmmor);
        motoEquipmentSortedWeight.add(boot);
        motoEquipmentSortedWeight.add(underpant);

        return motoEquipmentSortedWeight;
    }

    // Test Data. List of objects type MotoEquipment with price range from 10 to 200.
    public static ArrayList<MotoEquipment> getTestEquipmentFilter() {

        Boot boot = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove = new Glove("Nike", "30.47", 0.35, 3, true);
        Balaclava balaclava = new Balaclava("Monster", "19.99", 0.107, "XL", true);

        ArrayList<MotoEquipment>  motoEquipmentFilter = new ArrayList<>();
        motoEquipmentFilter.add(boot);
        motoEquipmentFilter.add(glove);
        motoEquipmentFilter.add(balaclava);
        return motoEquipmentFilter;
    }

    public static Motorcyclist getTestMotorcyclist() {

        Motorcyclist motorcyclist = new Motorcyclist();
        motorcyclist.setName("Terminator");
        motorcyclist.setMotoEquipment(getTestEquipment());


        return motorcyclist;
    }
}
