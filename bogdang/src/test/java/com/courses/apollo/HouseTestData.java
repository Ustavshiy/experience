package com.courses.apollo;

import com.courses.apollo.model.House;

public class HouseTestData {

    public static House[] getHouses() {
        House house = new House(1,4, 35,5, 2, "Borshagovskaya","Apartment", "4 years");
        House houseTwo = new House(2,1,55,1, 5, "Shevchenka","private house", "2 years");
        House houseThree = new House(3,2,60,4, 4, "Bobenka","private house", "1 years");
        House houseFour = new House(4,10,40,6, 3, "Pavlova","Apartment", "5 years");
        House houseFive = new House(5,7,25,2, 2, "Schorsa","Apartment", "8 years");
        House houseSix = new House(6,52,60,10, 3, "Lepse","Apartment", "15years");
        House houseSeven = new House(7,126,80,8, 5, "Bobrova","Apartment", "12 years");
        House houseEight = new House(8,56,45,1, 3, "Franka","private house", "20 years");
        House houseNine= new House(9, 78,30,3, 2, "Sobka","Apartment", "18 years");


        return new House[]{house, houseTwo, houseThree, houseFour, houseFive, houseSix, houseSeven, houseEight, houseNine};


    }
}