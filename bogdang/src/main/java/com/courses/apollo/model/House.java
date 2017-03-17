package com.courses.apollo.model;

import java.util.Objects;

/**
 * This class - molds for baking houses.
 */
public class House {

    /**
     * Here is stored the house ID.
     */
    private Integer houseId;

    /**
     * Here is stored the house number.
     */
    private Integer number;

    /**
     * Here is stored the house area.
     */
    private Integer area;

    /**
     * Here is stored the house floor.
     */
    private Integer floor;

    /**
     * Here is the quantity of rooms in the house.
     */
    private Integer roomsQuantity;

    /**
     * Here is the street on which stands the house.
     */
    private String street;

    /**
     * Here is the type of house.
     */
    private String bildType;

    /**
     * Here is the age of the house.
     */
    private String lifeTime;

    public House(){

    }

    public House(Integer houseId,
                 Integer num,
                 Integer area,
                 Integer floor,
                 Integer roomsQuantity,
                 String street,
                 String buildType,
                 String lifeTime) {
        this.houseId = houseId;
        number = num;
        this.area = area;
        this.floor = floor;
        this.roomsQuantity = roomsQuantity;
        this.street = street;
        this.bildType = buildType;
        this.lifeTime = lifeTime;
    }


    public Integer getArea() {
        return area;
    }

    public Integer getFloor() {
        return floor;
    }

    public Integer getRoomsQuantity() {
        return roomsQuantity;
    }


    @Override
    public String toString() {
        return houseId + " " + number + " " + area + " " + floor + " " + roomsQuantity + " " + street + " " + bildType
                + " " + lifeTime;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof House)) {
            return false;
        }
        House house = (House) o;
        return Objects.equals(houseId, house.houseId)
                && Objects.equals(number, house.number)
                && Objects.equals(area, house.area)
                && Objects.equals(floor, house.floor)
                && Objects.equals(roomsQuantity, house.roomsQuantity)
                && Objects.equals(street, house.street)
                && Objects.equals(bildType, house.bildType)
                && Objects.equals(lifeTime, house.lifeTime);

    }

    @Override
    public int hashCode() {
       return Objects.hash(houseId, number, area, floor, roomsQuantity, street, bildType,lifeTime);
    }
}
