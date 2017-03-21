package com.courses.apollo.service.motoservice;

import com.courses.apollo.data.MotorcyclistDataTest;
import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MotoServiceTest {

    @Test
    public void TestEquipmentPrice () {
        BigDecimal testPrice = new BigDecimal (830.52);

        ArrayList<MotoEquipment> testMotoEquipments = new ArrayList<>();
        testMotoEquipments = MotorcyclistDataTest.getTestMotoEquipment();

        testPrice.equals(TotalPriceService.totalEquipmentPrice(testMotoEquipments));
    }

    @Test
    public void TestEquipmentSorter() {

    }

    @Test
    public void TestFindRangePrice() {

    }
}
