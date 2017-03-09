package com.courses.apollo;

import com.courses.apollo.model.House;

/**
 * Contains methods that provides some logic working with House
 *
 * @see House
 */
public class HouseService {

    public House[] printHouseFields(House[] houses, Integer roomsQty) {
        House[] houseQuantity = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getRoomsQuantity().equals(roomsQty)) {
                houseQuantity[i] = houses[i];
            }
        }
        return houseQuantity;
    }

    public House[] printHouseFieldsFloor(House[] houses, Integer roomsQty, Integer floorMin, Integer floorMax) {
        House[] houseFieldsFloor = new House[houses.length];
        House[] houseFields = printHouseFields(houses, roomsQty);
        for (int i = 0; i <  houseFields.length; i++) {
            if((houseFields[i].getFloor() >= floorMin) && (houseFields[i].getFloor() <= floorMax))  {
                houseFieldsFloor[i] = houseFields[i];
            }
        }
        return houseFieldsFloor;
    }



    public House[] printHouseArea(House[] houses, Integer areaHouse){
        House[] houseArea = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getArea() > areaHouse) {
                houseArea[i] = houses[i];
            }
        }
        return houseArea;
    }



}
/*House: id, Номер квартиры, Площадь, Этаж, Количество комнат,
Улица, Тип здания, Срок эксплуатации.
Создать массив объектов. Вывести:
a) список квартир, имеющих заданное число комнат;
b) список квартир, имеющих заданное число комнат и расположенных
 на этаже, который находится в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.
*/