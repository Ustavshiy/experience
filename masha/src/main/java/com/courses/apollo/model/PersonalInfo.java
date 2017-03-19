package com.courses.apollo.model;

/**
 * This classes fields contain personal information for Patient class.
 */
public class PersonalInfo {
    private String patientFamilyName;
    private String patientName;
    private String patientPatronymicName;
    private String patientAddress;
    private String patientPhoneNumber;

    /**
     * Constructor by default.
     */
    public PersonalInfo() {
    }

    /**
     * Constructor.
     * @param patientFamilyName
     * @param patientName
     * @param patientPatronymicName
     * @param patientAddress
     * @param patientPhoneNumber
     */
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

    @Override
    public String toString() {
        return "PersonalInfo{"
                +
                "patientFamilyName='"
                + patientFamilyName
                + '\''
                +
                ", patientName='" + patientName
                + '\''
                +
                ", patientPatronymicName='"
                + patientPatronymicName
                + '\''
                +
                ", patientAddress='"
                + patientAddress
                + '\''
                +
                ", patientPhoneNumber='"
                + patientPhoneNumber
                + '\''
                + '}';
    }
}




