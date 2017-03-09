package com.courses.apollo;

import com.courses.apollo.model.House;
import org.junit.Test;

public class HouseServiceTest {
    private HouseService houseServiceTest = new HouseService();
    private final static Integer ROOMS_QUANTITY_TEST = 2;


    @Test
    public void testPrintHouseFields() {
        House[] houses = HouseTestData.getHouses();
        houseServiceTest.printHouseFields(houses, ROOMS_QUANTITY_TEST);

    }
}
