package com.courses.apollo;

import com.courses.apollo.model.House;

/**
 * Contains methods that provides some logic working with House
 *
 * @see House
 */
public class HouseService {

    public House[] printHouseFields(House[] houses, Integer roomsQty) {
        House[] result = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getRoomsQuantity().equals(roomsQty)) {
                result[i] = houses[i];
            }
        }
        return result;
    }
}
