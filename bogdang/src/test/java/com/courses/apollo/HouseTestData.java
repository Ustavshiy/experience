package com.courses.apollo;

public class HouseTestData {

    public static House[] getHouses(){
        House house = new House(1,4, "40 Sq.M",5, 2, "Borshagovskaya",
                "Apartment", "4 years");
        House houseTwo = new House(2,1, "55 Sq.M",1, 5, "Sshevchenka",
                "private house", "2 years");
        return new House[](house, houseTwo);
}
}