package com.courses.apollo.service.motorcyclist;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.BodyArmor;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.Boot;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.Glove;
import com.courses.apollo.model.motorcyclist.motoequipment.motoarmor.Helmet;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Balaclava;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Bandana;
import com.courses.apollo.model.motorcyclist.motoequipment.motoclothing.Underpant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MotoServiceTest {

    public static ArrayList<MotoEquipment>  motoEquipment = new ArrayList<>();
    public static ArrayList<MotoEquipment>  motoEquipmentSortedWeight = new ArrayList<>();
    public static ArrayList<MotoEquipment>  motoEquipmentFiltered = new ArrayList<>();

    @Before
    public void testEquipment() {
        motoEquipment = new ArrayList<>();
        BodyArmor bodyArmmor = new BodyArmor("Fox", "240.54", 2.54, 2, false);
        Boot boot = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove = new Glove("Nike", "30.47", 0.35, 3, true);
        Helmet helmet = new Helmet("Shark", "367.48", 2.07, 1, false, true);
        Balaclava balaclava = new Balaclava("Monster", "19.99", 0.107, "XL", true);
        Bandana bandana = new Bandana("Bald head", "9.99", 0.087, "S", true);
        Underpant underpant = new Underpant("Brown back", "4.57", 5.178, "XXL", false);
        motoEquipment.add(bodyArmmor);
        motoEquipment.add(boot);
        motoEquipment.add(glove);
        motoEquipment.add(helmet);
        motoEquipment.add(balaclava);
        motoEquipment.add(bandana);
        motoEquipment.add(underpant);

        motoEquipmentSortedWeight = new ArrayList<>();
        BodyArmor bodyArmmor2 = new BodyArmor("Fox", "240.54", 2.54, 2, false);
        Boot boot2 = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove2 = new Glove("Nike", "30.47", 0.35, 3, true);
        Helmet helmet2 = new Helmet("Shark", "367.48", 2.07, 1, false, true);
        Balaclava balaclava2 = new Balaclava("Monster", "19.99", 0.107, "XL", true);
        Bandana bandana2 = new Bandana("Bald head", "9.99", 0.087, "S", true);
        Underpant underpant2 = new Underpant("Brown back", "4.57", 5.178, "XXL", false);
        motoEquipmentSortedWeight.add(bandana2);
        motoEquipmentSortedWeight.add(balaclava2);
        motoEquipmentSortedWeight.add(glove2);
        motoEquipmentSortedWeight.add(helmet2);
        motoEquipmentSortedWeight.add(bodyArmmor2);
        motoEquipmentSortedWeight.add(boot2);
        motoEquipmentSortedWeight.add(underpant2);

        motoEquipmentFiltered = new ArrayList<>();
        Boot boot3 = new Boot("Adidas", "157.48", 3.12, 1, true);
        Glove glove3 = new Glove("Nike", "30.47", 0.35, 3, true);
        Balaclava balaclava3 = new Balaclava("Monster", "19.99", 0.107, "XL", true);

        motoEquipmentFiltered.add(boot3);
        motoEquipmentFiltered.add(glove3);
        motoEquipmentFiltered.add(balaclava3);
    }
    @Test
    public void TestEquipmentPrice () {
        MotorcycleService.totalEquipmentPrice(motoEquipment);
    }

    @Test
    public void TestEquipmentSorter() {
        Assert.assertEquals(motoEquipmentSortedWeight, MotorcycleService.motoEquipmentSorter(motoEquipment));
    }

    @Test
    public void TestFindRangePrice() {
         Assert.assertEquals(motoEquipmentFiltered,
                 MotorcycleService.findEquipmentByPriceRange(motoEquipment,
                         new BigDecimal(10), new BigDecimal(200)));
    }
}
