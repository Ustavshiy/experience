package com.courses.apollo;

import com.courses.apollo.model.House;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * Contains methods that provides some logic working with House
 *
 * @see House
 */
public class HouseService {

    public void printHouse(House house) {
        System.out.println(house);
    }

    public House[] printHouseFields(House[] houses, Integer roomsQty) {
        House[] houseQuantity = new House[houses.length];
        int count = 0;
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getRoomsQuantity().equals(roomsQty)) {
                houseQuantity[count] = houses[i];
                count++;
            }
        }
        House[] result = new House[count];
        System.arraycopy(houseQuantity, 0, result, 0, count);
        return result;
    }

    public House[] printHouseFieldsFloor(House[] houses, Integer roomsQty, Integer floorMin, Integer floorMax) {
        House[] houseFieldsFloor = new House[houses.length];
        House[] houseFields = printHouseFields(houses, roomsQty);
        int count = 0;
        for (int i = 0; i <  houseFields.length; i++) {
            if((houseFields[i].getFloor() >= floorMin) && (houseFields[i].getFloor() <= floorMax))  {
                houseFieldsFloor[count] = houseFields[i];
                count++;
            }
        }
        House[] result = new House[count];
        System.arraycopy(houseFields, 0, result, 0, count);
        return result;
    }


    public House[] printHouseArea(House[] houses, Integer areaHouse){
        House[] houseArea = new House[houses.length];
        int count = 0;
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getArea() > areaHouse) {
                houseArea[count] = houses[i];
                count++;
            }
        }
        House[] result = new House[count];
        System.arraycopy(houseArea, 0, result, 0, count);
        return result;
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
