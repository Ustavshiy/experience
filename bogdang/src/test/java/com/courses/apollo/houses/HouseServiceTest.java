package com.courses.apollo.houses;

import com.courses.apollo.model.HouseTestData;
import com.courses.apollo.model.House;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HouseServiceTest {
    private HouseService houseServiceTest = new HouseService();
    private final static Integer ROOMS_QUANTITY_TEST = 2;
    private final static Integer AREA_TEST = 60;
    private final static Integer FLOOR_MIN_TEST = 2;
    private final static Integer FLOOR_MAX_TEST = 5;

    ArrayList<House> houses = HouseTestData.getHouses();
    ArrayList<House> housesTwo = HouseTestData.IntFlo_FirstCond();
    ArrayList<House> housesThree = HouseTestData.IntFlo_SecondCond();


    @Test
    public void testQuantityRooms() {
        ArrayList<House> housesExpected =HouseTestData.getHousesRooms();
        ArrayList<House> afterMethodRun = houseServiceTest.quantityRooms(houses, ROOMS_QUANTITY_TEST);
        House[] expectedHouses = housesExpected.toArray(new House[housesExpected.size()]);
        House[] result = afterMethodRun.toArray(new House[afterMethodRun.size()]);
        Assert.assertArrayEquals(expectedHouses, result);
    }

    @Test
    public void testHouseArea() {
        ArrayList<House> housesExpected =HouseTestData.getHousesArea();
        ArrayList<House> afterMethodRun = houseServiceTest.area(houses, AREA_TEST);
        House[] expectedHouses = housesExpected.toArray(new House[housesExpected.size()]);
        House[] result = afterMethodRun.toArray(new House[afterMethodRun.size()]);
        Assert.assertArrayEquals(expectedHouses, result);

    }

    @Test
    public void testQtyRooms_IntervalFloor() {
        ArrayList<House> housesExpected =HouseTestData.getQtyRooms_IntervalFloor();
        ArrayList<House> afterMethodRun = houseServiceTest.qtyRooms_IntervalFloor(houses, ROOMS_QUANTITY_TEST,FLOOR_MIN_TEST, FLOOR_MAX_TEST);
        House[] expectedHouses = housesExpected.toArray(new House[housesExpected.size()]);
        House[] result = afterMethodRun.toArray(new House[afterMethodRun.size()]);
        Assert.assertArrayEquals(expectedHouses, result);
    }

    @Test
    public void testQtyRooms_IntFlo_FirstCond() {
        ArrayList<House> housesExpected =HouseTestData.getIntFlo_Cond();
        ArrayList<House> afterMethodRun = houseServiceTest.qtyRooms_IntervalFloor(housesTwo, ROOMS_QUANTITY_TEST,FLOOR_MIN_TEST, FLOOR_MAX_TEST);
        House[] expectedHouses = housesExpected.toArray(new House[housesExpected.size()]);
        House[] result = afterMethodRun.toArray(new House[afterMethodRun.size()]);
        Assert.assertArrayEquals(expectedHouses, result);
    }

    @Test
    public void testQtyRooms_IntFlo_SecondCond() {
        ArrayList<House> housesExpected =HouseTestData.getIntFlo_Cond();
        ArrayList<House> afterMethodRun = houseServiceTest.qtyRooms_IntervalFloor(housesThree, ROOMS_QUANTITY_TEST,FLOOR_MIN_TEST, FLOOR_MAX_TEST);
        House[] expectedHouses = housesExpected.toArray(new House[housesExpected.size()]);
        House[] result = afterMethodRun.toArray(new House[afterMethodRun.size()]);
        Assert.assertArrayEquals(expectedHouses, result);
    }
}
