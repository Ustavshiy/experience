package com.courses.apollo;

import com.courses.apollo.model.House;

public class HouseTestData {

    public static House[] getHouses() {
        House house = new House(1,4, 35,5, 2, "Borshagovskaya",
                "Apartment", "4 years");
        House houseTwo = new House(2,1,55,1, 5, "Shevchenka",
                "private house", "2 years");
        return new House[]{house, houseTwo};

    }
}