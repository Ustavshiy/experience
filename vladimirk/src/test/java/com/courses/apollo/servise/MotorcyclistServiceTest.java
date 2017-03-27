package com.courses.apollo.servise;

import com.courses.apollo.model.MotorciclystTestData;
import com.courses.apollo.model.motorcyclist.Equipment;
import com.courses.apollo.model.motorcyclist.Motorcyclist;
import com.courses.apollo.service.MotorcyclistService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MotorcyclistServiceTest {

    private final static Motorcyclist motorcyclist = MotorciclystTestData.getMotorcyclist();
    private final static List<Equipment> equipments = MotorciclystTestData.getEquipments();
    private final static int expectedSum = 315000;
    private final static int minPrice = 28000;
    private final static int maxPrice = 80000;
    private final static MotorcyclistService motorcyclistService = new MotorcyclistService();

    @Test
    public void testEquipMotorciclyst() {
        Assert.assertTrue(motorcyclistService.equip(motorcyclist));
    }

    @Test
    public void testSumPriceOfEquipments() {
        Assert.assertTrue(expectedSum == motorcyclistService.sumPrice(equipments));
    }

    @Test
    public void testSortEquipByWeight() {
        Assert.assertEquals(MotorciclystTestData.getExpectedEquipmentSortedByWeight(),
                motorcyclistService.sortEquipByWeight(equipments));
    }

    @Test
    public void testFindEquipInPriceRange() {
        Assert.assertEquals(MotorciclystTestData.getExpectedEquipmentFindedInPriceRange(),
                motorcyclistService.findEquipInPriceRange(equipments, minPrice, maxPrice));
    }

}
