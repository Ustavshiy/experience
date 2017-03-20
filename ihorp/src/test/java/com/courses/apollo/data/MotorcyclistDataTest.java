package com.courses.apollo.data;

import com.courses.apollo.model.motorcyclist.Motorcyclist;
import com.courses.apollo.model.motorcyclist.motoarmor.*;
import com.courses.apollo.model.motorcyclist.motoclothing.Balaclava;
import com.courses.apollo.model.motorcyclist.motoclothing.Bandana;
import com.courses.apollo.model.motorcyclist.motoclothing.MotoClothing;
import com.courses.apollo.model.motorcyclist.motoclothing.Underpant;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Motorcyclist equipment.
 */
public class MotorcyclistDataTest {

    public MotorcyclistDataTest() {}

    public static ArrayList<MotoArmor> getMotoArmor() {

        BodyArmor bodyArmmor = new BodyArmor("Fox", "240.54", 2.54, 2, false);
        Boot boot = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove = new Glove("Nike", "30.47", 0.35, 3, true);
        Helmet helmet = new Helmet("Shark", "367.48", 2.07, 1, false, true);

        ArrayList<MotoArmor>  motoArmor = new ArrayList<>();
        motoArmor.add(bodyArmmor);
        motoArmor.add(boot);
        motoArmor.add(glove);
        motoArmor.add(helmet);

        return motoArmor;
    }

    public static ArrayList<MotoClothing> getMotoClothing() {

        Balaclava balaclava = new Balaclava("Monstr", "19.99", 0.107, "XL", true);
        Bandana bandana = new Bandana("Bald head", "9.99", 0.087, "S", true);
        Underpant underpant = new Underpant("Brown back", "4.57", 0.178, "XXL", false);

        ArrayList<MotoClothing> motoClothing = new ArrayList<>();
        motoClothing.add(balaclava);
        motoClothing.add(bandana);
        motoClothing.add(underpant);

        return motoClothing;
    }

    public static ArrayList<Motorcyclist> getMotorcyclist() {
        ArrayList<Motorcyclist> motorcyclist = new ArrayList<>();

        motorcyclist = getMotoArmor();
        return motorcyclist;
    }
}
