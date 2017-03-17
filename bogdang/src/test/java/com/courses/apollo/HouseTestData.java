package com.courses.apollo;

import com.courses.apollo.model.House;

import java.util.ArrayList;

public class HouseTestData {

    public static ArrayList<House> getHouses() {
        House house = new House(1, 4, 35, 5, 2, "Borshagovskaya", "Apartment", "4 years");
        House houseTwo = new House(2, 1, 55, 1, 5, "Shevchenka", "private house", "2 years");
        House houseThree = new House(3, 2, 60, 4, 4, "Bobenka", "private house", "1 years");
        House houseFour = new House(4, 10, 40, 6, 3, "Pavlova", "Apartment", "5 years");
        House houseFive = new House(5, 7, 25, 2, 2, "Schorsa", "Apartment", "8 years");
        House houseSix = new House(6, 52, 60, 10, 3, "Lepse", "Apartment", "15years");
        House houseSeven = new House(7, 126, 80, 8, 5, "Bobrova", "Apartment", "12 years");
        House houseEight = new House(8, 56, 45, 1, 3, "Franka", "private house", "20 years");
        House houseNine = new House(9, 78, 30, 3, 2, "Sobka", "Apartment", "18 years");

        ArrayList<House> houses = new ArrayList<>();
        houses.add(house);
        houses.add(houseTwo);
        houses.add(houseThree);
        houses.add(houseFour);
        houses.add(houseFive);
        houses.add(houseSix);
        houses.add(houseSeven);
        houses.add(houseEight);
        houses.add(houseNine);

        return houses;
    }

    public static ArrayList<House> getHousesRooms() {
        House house = new House(1, 4, 35, 5, 2, "Borshagovskaya", "Apartment", "4 years");
        House houseFive = new House(5, 7, 25, 2, 2, "Schorsa", "Apartment", "8 years");
        House houseNine = new House(9, 78, 30, 3, 2, "Sobka", "Apartment", "18 years");

        ArrayList<House> houses = new ArrayList<>();
        houses.add(house);
        houses.add(houseFive);
        houses.add(houseNine);
        return houses;

    }

    public static ArrayList<House> getHousesArea() {
        House houseSeven = new House(7, 126, 80, 8, 5, "Bobrova", "Apartment", "12 years");

        ArrayList<House> houses = new ArrayList<>();
        houses.add(houseSeven);
        return houses;

    }

    public static ArrayList<House> getQtyRooms_IntervalFloor() {
        House houseNine = new House(9, 78, 30, 3, 2, "Sobka", "Apartment", "18 years");

        ArrayList<House> houses = new ArrayList<>();
        houses.add(houseNine);
        return houses;
    }

    public static ArrayList<House> IntFlo_FirstCond() {
        House houseFour = new House(4, 10, 40, 6, 3, "Pavlova", "Apartment", "5 years");
        House houseSix = new House(6, 52, 60, 10, 3, "Lepse", "Apartment", "15years");
        House houseSeven = new House(7, 126, 80, 8, 5, "Bobrova", "Apartment", "12 years");

        ArrayList<House> houses = new ArrayList<>();
        houses.add(houseFour);
        houses.add(houseSix);
        houses.add(houseSeven);
        return houses;
    }

    public static ArrayList<House> IntFlo_SecondCond() {
        House houseTwo = new House(2, 1, 55, 1, 5, "Shevchenka", "private house", "2 years");
        House houseEight = new House(8, 56, 45, 1, 3, "Franka", "private house", "20 years");

        ArrayList<House> houses = new ArrayList<>();
        houses.add(houseTwo);
        houses.add(houseEight);
        return houses;
    }

    public static ArrayList<House> getIntFlo_Cond() {

        ArrayList<House> houses = new ArrayList<>();
        return houses;
    }





    /*public static ArrayList<House> getHouses2() {
        House house = new House(1,4, 35,1, 2, "Borshagovskaya","Apartment", "4 years");
        House houseTwo = new House(2,1,55,1, 5, "Shevchenka","private house", "2 years");
        House houseThree = new House(3,2,60,2, 4, "Bobenka","private house", "1 years");

        return new House[]{house, houseTwo, houseThree};

    }
    public static House[] getHouses3() {

        return new House[]{};

    }

    public static House[] getHouses4() {

        House houseThree = new House(3, 2, 60, 4, 4, "Bobenka", "private house", "1 years");
        House houseNine = new House(9, 78, 30, 3, 2, "Sobka", "Apartment", "18 years");

        return new House[]{ houseThree,houseNine};*/

    }

/*House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации.
Создать массив объектов.
Вывести:
a) список квартир, имеющих заданное число комнат;
b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.
**/

