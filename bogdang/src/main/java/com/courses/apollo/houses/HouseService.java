package com.courses.apollo.houses;

import com.courses.apollo.model.House;

import java.util.ArrayList;

/**
 * Contains methods that provides some logic working with House.
 *
 * @see House
 */
public class HouseService {

    /**
     * Return the number of homes with a given number of rooms.
     *
     * @param houses in input.
     * @param roomsQty number of rooms.
     * @return result array.
     */
    public ArrayList<House> quantityRooms(ArrayList<House> houses, Integer roomsQty) {
        ArrayList<House> houseQuantity = new ArrayList<>();
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getRoomsQuantity().equals(roomsQty)) {
                houseQuantity.add(houses.get(i));
            }
        }
        return houseQuantity;
    }

    /**
     * Return the number of homes whose area is greater given area.
     *
     * @param houses in input.
     * @param areaHouse set the area of the house.
     * @return result array.
     */
    public ArrayList<House> area(ArrayList<House> houses, Integer areaHouse) {
        ArrayList<House> houseArea = new ArrayList<>();
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getArea() > areaHouse) {
                houseArea.add(houses.get(i));
            }
        }
        return  houseArea;
    }

    /**
     * Return the number of homes with a given number of rooms and in the given interval of floors.
     *
     * @param houses in input.
     * @param roomsQty number of rooms.
     * @param floorMin minimal floor.
     * @param floorMax maximum floor.
     * @return result array.
     */
    public ArrayList<House> qtyRooms_IntervalFloor(ArrayList<House> houses, Integer roomsQty, Integer floorMin, Integer floorMax) {
        ArrayList<House> houseQuantity = quantityRooms(houses, roomsQty);
        ArrayList<House> intervalFloor = new ArrayList<>();
        for (int i = 0; i <  houseQuantity.size(); i++) {
            if (houseQuantity.get(i).getFloor() > floorMin && houseQuantity.get(i).getFloor() < floorMax)  {
                intervalFloor.add(houseQuantity.get(i));
            }
        }
        return intervalFloor;
    }
}

