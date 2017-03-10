package com.courses.apollo.model;

/**
 * House info
 */

public class House {

    private Integer houseId;

    private Integer number;

    private Integer area;

    private Integer floor;

    private Integer roomsQuantity;

    private String street;

    private String bildType;

    private String lifeTime;

    public House(){

    }





    public House(Integer Id, Integer num, Integer area,
                 Integer floor, Integer numRooms, String street, String bildType, String lifeTime) {
        houseId = Id;
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

    public String toString() {
        return houseId+ " "+ number +" "+ area+ " "+ floor +" " + roomsQuantity +
                " "+street+" "+bildType+ " "+lifeTime;

    }
}
