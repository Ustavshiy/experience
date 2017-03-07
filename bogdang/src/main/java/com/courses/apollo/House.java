package com.courses.apollo;

import org.junit.Test;

/**
 * House info
 */

public class House {

    public Integer houseId;

    public Integer nummer;

    public String area;

    public Integer floor;

    public Integer numRooms;

    public String street;

    public String bildType;

    public String lifeTime;

    public House(){

    }

    public House(Integer Id, Integer num, String area,
                 Integer floor, Integer numRooms, String street, String bildType, String lifeTime) {
        houseId = Id;
        nummer = num;
        this.area = area;
        this.floor = floor;
        this.numRooms = numRooms;
        this.street = street;
        this.bildType = bildType;
        this.lifeTime = lifeTime;
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