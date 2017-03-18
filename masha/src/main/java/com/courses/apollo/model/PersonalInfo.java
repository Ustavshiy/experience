package com.courses.apollo.model;

/**
 * Created by MashaJM on 17.03.2017.
 */
public class PersonalInfo {

    private String patientFamilyName;
    private String patientName;
    private String patientPatronymicName;
    private String patientAddress;
    private String patientPhoneNumber;




    public PersonalInfo() {
    }

    public PersonalInfo(String patientFamilyName, String patientName, String patientPatronymicName, String patientAddress, String patientPhoneNumber) {
        this.patientFamilyName = patientFamilyName;
        this.patientName = patientName;
        this.patientPatronymicName = patientPatronymicName;
        this.patientAddress = patientAddress;
        this.patientPhoneNumber = patientPhoneNumber;
    }



    public String getPatientFamilyName() {
        return patientFamilyName;
    }

    public void setPatientFamilyName(String patientFamilyName) {
        this.patientFamilyName = patientFamilyName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPatronymicName() {
        return patientPatronymicName;
    }

    public void setPatientPatronymicName(String patientPatronymicName) {
        this.patientPatronymicName = patientPatronymicName;
    }

    public PersonalInfo(String patientFamilyName, String patientName) {
        this.patientFamilyName = patientFamilyName;
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }
}




