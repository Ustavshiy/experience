package com.courses.apollo;

import com.courses.apollo.model.House;

/**
 * Contains methods that provides some logic working with House.
 *
 * @see House
 */
public class HouseService {

    /**
     * Sorts of houses.
     *
     * @param house in input.
     */

    public void printHouse(House house) {
        System.out.println(house);
    }

    /**
     * Sorts houses by the number of rooms.
     *
     * @param houses in input.
     * @param roomsQty number of rooms.
     * @return result array.
     */

    public House[] printHouseFields(House[] houses, Integer roomsQty) {
        House[] houseQuantity = new House[houses.length];
        int count = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getRoomsQuantity().equals(roomsQty)) {
                houseQuantity[count] = houses[i];
                count++;
            }
        }
        House[] result = new House[count];
        System.arraycopy(houseQuantity, 0, result, 0, count);
        return result;
    }

    /**
     * Sorts houses by the number of rooms and floors.
     *
     * @param houses in input.
     * @param roomsQty number of rooms.
     * @param floorMin minimal floor.
     * @param floorMax maximum floor.
     * @return result array.
     */

    public House[] printHouseFieldsFloor(House[] houses, Integer roomsQty, Integer floorMin, Integer floorMax) {
        House[] houseFields = printHouseFields(houses, roomsQty);
        int count = 0;
        for (int i = 0; i <  houseFields.length; i++) {
            if (houseFields[i].getFloor() > floorMin && houseFields[i].getFloor() < floorMax)  {
                houseFields[count] = houseFields[i];
                count++;
            }
        }
        House[] result = new House[count];
        System.arraycopy(houseFields, 0, result, 0, count);
        return result;
    }

    /**
     * Sorts houses by the number area of rooms.
     *
     * @param houses in input.
     * @param areaHouse set the area of the house.
     * @return result array.
     */
    public House[] printHouseArea(House[] houses, Integer areaHouse) {
        House[] houseArea = new House[houses.length];
        int count = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getArea() > areaHouse) {
                houseArea[count] = houses[i];
                count++;
            }
        }
        House[] result = new House[count];
        System.arraycopy(houseArea, 0, result, 0, count);
        return result;
    }

}

