package com.courses.apollo;

import com.courses.apollo.model.House;

/**
 * Contains methods that provides some logic working with House
 * @see House
 */
public class HouseService {

    public void printHouseFields(House house) {
        System.out.println(house);
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
