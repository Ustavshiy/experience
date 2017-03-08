package com.courses.apollo;

import com.courses.apollo.model.House;
import org.junit.Test;

public class HouseServiceTest {
    private HouseService houseServiceTest = new HouseService();


    @Test
    public void testPrintHouseFields() {
        House[] houses = HouseTestData.getHouses();
        houseServiceTest.printHouseFields(houses[1]);
        houses.
    }
}
