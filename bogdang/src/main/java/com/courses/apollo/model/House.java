package com.courses.apollo.model;

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

    public House(Integer houseId, Integer num, Integer area,
                 Integer floor, Integer numRooms, String street, String bildType, String lifeTime) {
        this.houseId = houseId;
        number = num;
        this.area = area;
        this.floor = floor;
        this.roomsQuantity = numRooms;
        this.street = street;
        this.bildType = bildType;
        this.lifeTime = lifeTime;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(Integer roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBildType() {
        return bildType;
    }

    public void setBildType(String bildType) {
        this.bildType = bildType;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return houseId + " " + number + " " + area + " " + floor + " " + roomsQuantity + " " + street + " " + bildType
                + " " + lifeTime;
    }
}
