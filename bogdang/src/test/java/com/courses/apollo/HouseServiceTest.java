package com.courses.apollo;

import com.courses.apollo.model.House;
import org.junit.Assert;
import org.junit.Test;

public class HouseServiceTest {
    private HouseService houseServiceTest = new HouseService();
    private final static Integer ROOMS_QUANTITY_TEST = 2;
    private final static Integer AREA_TEST = 40;
    private final static Integer FLOOR_AREA_TEST = 20;
    private final static Integer FLOOR_MIN_TEST = 2;
    private final static Integer FLOOR_MAX_TEST = 5;


    @Test
    public void testPrintHouseFields() {
        House[] houses = HouseTestData.getHouses();
        houseServiceTest.printHouseFields(houses, ROOMS_QUANTITY_TEST);
        
    }

    @Test
    public void testPrintHouseArea() {
        House[] houses = HouseTestData.getHouses();
        houseServiceTest.printHouseArea(houses, AREA_TEST);
    }

    @Test
    public void testPrintHouseFieldsFloor() {
        House[] houses = HouseTestData.getHouses();
        House[] housesExpected =HouseTestData.getHouses4();
        final House[] afterMethodRun = houseServiceTest.printHouseFieldsFloor(houses,FLOOR_AREA_TEST, FLOOR_MIN_TEST, FLOOR_MAX_TEST);
        Assert.assertArrayEquals(housesExpected,afterMethodRun);
    }

    @Test
    public void testPrintHouseFieldsFloorFirstCondition() {
        House[] houses = HouseTestData.getHouses1();
        House[] housesExpected =HouseTestData.getHouses3();
        final House[] afterMethodRun = houseServiceTest.printHouseFieldsFloor(houses,FLOOR_AREA_TEST, FLOOR_MIN_TEST, FLOOR_MAX_TEST);
        Assert.assertArrayEquals(housesExpected,afterMethodRun);
    }

    @Test
    public void testPrintHouseFieldsFloorSecondCondition() {
        House[] houses = HouseTestData.getHouses2();
        House[] housesExpected =HouseTestData.getHouses3();
        final House[] afterMethodRun = houseServiceTest.printHouseFieldsFloor(houses,FLOOR_AREA_TEST, FLOOR_MIN_TEST, FLOOR_MAX_TEST);
        Assert.assertArrayEquals(housesExpected,afterMethodRun);
    }

    @Test
    public void testPrint() {
        House[] houses = HouseTestData.getHouses();
        houseServiceTest.printHouse(houses[0]);
    }
}
