package com.courses.apollo.service.io;

import com.courses.apollo.model.motorcyclist.Motorcyclist;
import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.BodyArmor;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.Boot;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.Glove;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.Helmet;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Balaclava;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Bandana;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Underpant;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SerializeMotorcyclistTest {

    public static String file = "src/test/resources/Motorcyclist.ser";
    private Motorcyclist motorcyclist;
    private SerializeMotorcyclist serializeMotorcyclist = new SerializeMotorcyclist();

    @Before
    public void addMotorcyclist() {
        ArrayList<MotoEquipment> motoEquipment = new ArrayList<>();
        motoEquipment.add(new BodyArmor("Fox", "240.54", 2.54, 2, false));
        motoEquipment.add(new Boot("Adidas", "157.48", 3.12, 1, true));
        motoEquipment.add(new Glove("Nike", "30.47", 0.35, 3, true));
        motoEquipment.add(new Helmet("Shark", "367.48", 2.07, 1, false, true));
        motoEquipment.add(new Balaclava("Monster", "19.99", 0.107, "XL", true));
        motoEquipment.add(new Bandana("Bald head", "9.99", 0.087, "S", true));
        motoEquipment.add(new Underpant("Brown back", "4.57", 5.178, "XXL", false));
        motorcyclist = new Motorcyclist("Tom", motoEquipment);
    }

    @Test
    public void testReestablishMotorcyclist() throws IOException, ClassNotFoundException {
        serializeMotorcyclist.writeMotorcyclist(motorcyclist, file);
        Motorcyclist testMotorcyclist = serializeMotorcyclist.reestablishMotorcyclist(file);
        Assert.assertEquals(motorcyclist, testMotorcyclist);
    }

    @AfterClass
    public static void deleteFile() {
        new File(file).delete();
    }
}
