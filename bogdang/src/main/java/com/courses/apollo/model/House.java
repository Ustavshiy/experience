package com.courses.apollo.model;

import org.junit.Test;

/**
 * House info
 */

public class House {

    private Integer houseId;

    private Integer nummer;

    private String area;

    private Integer floor;

    private Integer numRooms;

    private String street;

    private String bildType;

    private String lifeTime;

    private House(){

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

    public String toString() {
        return houseId+ " "+ nummer +" "+ area+ " "+ floor +" " +numRooms+
                " "+street+" "+bildType+ " "+lifeTime;

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