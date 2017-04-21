package com.courses.apollo.model;

/**
 * This classes fields contain personal information for Patient class.
 */
public class PatientPersonalInfo {

    /**
     * Surname of Patient.
     */
    private String familyName;

    /**
     * First name of Patient.
     */
    private String name;

    /**
     * Name of Patient's father.
     */
    private String patronymicName;

    /**
     * String of Patient's home address.
     */
    private String address;

    /**
     * Patient's private cellphone.
     */
    private String phoneNumber;

    /**
     * Constructor by default.
     */
    public PatientPersonalInfo() {
    }

    /**
     * Constructor.
     * @param familyName Surname of Patient
     * @param name First name of Patient
     * @param patronymicName Name of Patient's father
     * @param address Home address of Patient
     * @param phoneNumber Patient's cellphone
     */
    public PatientPersonalInfo(String familyName, String name, String patronymicName,
                               String address, String phoneNumber) {
        this.familyName = familyName;
        this.name = name;
        this.patronymicName = patronymicName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PatientPersonalInfo{" + "familyName='" + familyName + '\'' + ", name='" + name
                + '\'' + ", patronymicName='" + patronymicName + '\'' + ", address='"
                + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }
}




