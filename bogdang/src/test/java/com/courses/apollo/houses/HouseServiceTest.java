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

    @Test
    public void testQuantityRooms() {
        Assert.assertEquals(HouseTestData.getHousesRooms(),houseServiceTest.quantityRooms(HouseTestData.getHouses(),
                ROOMS_QUANTITY_TEST));
    }

    @Test
    public void testHouseArea() {
        Assert.assertEquals(HouseTestData.getHousesArea(),houseServiceTest.area(HouseTestData.getHouses(), AREA_TEST));

    }

    @Test
    public void testQtyRooms_IntervalFloor() {
        Assert.assertEquals(HouseTestData.getQtyRooms_IntervalFloor(), houseServiceTest.qtyRooms_IntervalFloor(HouseTestData.getHouses(),
                ROOMS_QUANTITY_TEST,FLOOR_MIN_TEST, FLOOR_MAX_TEST));
    }

    @Test
    public void testQtyRooms_IntFlo_FirstCond() {
        Assert.assertEquals(HouseTestData.getIntFlo_Cond(), houseServiceTest.qtyRooms_IntervalFloor(HouseTestData.IntFlo_FirstCond(),
                ROOMS_QUANTITY_TEST,FLOOR_MIN_TEST, FLOOR_MAX_TEST));
    }

    @Test
    public void testQtyRooms_IntFlo_SecondCond() {
        Assert.assertEquals(HouseTestData.getIntFlo_Cond(), houseServiceTest.qtyRooms_IntervalFloor(HouseTestData.IntFlo_SecondCond(),
                ROOMS_QUANTITY_TEST,FLOOR_MIN_TEST, FLOOR_MAX_TEST));
    }
}
