package com.courses.apollo;

/**
 * Creates objects.
 */

public class HouseTestData {

    public static House[] getHouse(){
        House house = new House(3,4, "40 Sq.M",
                5);
        house.houseId = 1;
        house.nummer = 4;
        house.area = "34 Sq.M ";
        house.floor = 3;
        house.numRooms = 2;
        house.street ="Borshagovskaya";
        house.bildType = "Apartment";
        house.lifeTime = "4 years";

        House houseTwo = new House();
        houseTwo.houseId = 2;
        houseTwo.nummer = 36;
        houseTwo.area = "60 Sq.M ";
        houseTwo.floor = 1;
        houseTwo.numRooms = 4;
        houseTwo.street ="Shevchenka";
        houseTwo.bildType = "Private house";
        house.lifeTime = "2 years";


    }
}
