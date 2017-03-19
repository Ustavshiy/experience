package com.courses.apollo.model;

/**
 * This classes fields contain personal information for Patient class.
 */
public class PersonalInfo {

    /**
     * Surname of Patient.
     */
    private String patientFamilyName;

    /**
     * First name of Patient.
     */
    private String patientName;

    /**
     * Name of Patient's father.
     */
    private String patientPatronymicName;

    /**
     * String of Patient's home address.
     */
    private String patientAddress;

    /**
     * Patient's private cellphone.
     */
    private String patientPhoneNumber;

    /**
     * Constructor by default.
     */
    public PersonalInfo() {
    }

    /**
     * Constructor.
     * @param patientFamilyName Surname of Patient
     * @param patientName First name of Patient
     * @param patientPatronymicName Name of Patient's father
     * @param patientAddress Home address of Patient
     * @param patientPhoneNumber Patient's cellphone
     */
    public PersonalInfo(String patientFamilyName,
                        String patientName,
                        String patientPatronymicName,
                        String patientAddress,
                        String patientPhoneNumber) {
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




