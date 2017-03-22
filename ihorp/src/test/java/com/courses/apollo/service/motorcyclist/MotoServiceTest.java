package com.courses.apollo.service.motorcyclist;

import com.courses.apollo.data.MotorcyclistDataTest;
import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MotoServiceTest {

    @Test
    public void TestEquipmentPrice () {
        BigDecimal testPrice = new BigDecimal (830.52);

        ArrayList<MotoEquipment> testMotoEquipments = new ArrayList<>();
        testMotoEquipments = MotorcyclistDataTest.getTestEquipment();

        testPrice.equals(TotalPriceService.totalEquipmentPrice(testMotoEquipments));
    }

    @Test
    public void TestEquipmentSorter() {
        ArrayList<MotoEquipment> unsortedEquipment = new ArrayList<>();
        unsortedEquipment = MotorcyclistDataTest.getTestEquipment();

        ArrayList<MotoEquipment> sortedEquipment = new ArrayList<>();
        sortedEquipment = MotorcyclistDataTest.getTestEquipmentSortedWeight();

        Assert.assertEquals(sortedEquipment, MotoEquipmentSorterService.motoEquipmentSorter(unsortedEquipment));
    }

    @Test
    public void TestFindRangePrice() {
        ArrayList<MotoEquipment> testRangeOfEquipments;
        testRangeOfEquipments = MotorcyclistDataTest.getTestEquipment();

        ArrayList<MotoEquipment> testRangeOfEquipmentsFilter;
        testRangeOfEquipmentsFilter = MotorcyclistDataTest.getTestEquipmentFilter();

        Assert.assertEquals(testRangeOfEquipmentsFilter,
                FindRangePriceService.findEquipmentByPriceRange(testRangeOfEquipments, "10", "200"));
    }
}
