package com.courses.apollo.model;

/**
 * Created by Maria on 13.03.2017.
 */
public class Patient {

    private Integer patientId;
    private Integer MedicalCardNumber;
    private String patientFamilyName;
    private String patientName;
    private String patientPatronymicName;
    private String patientAddress;
    private String patientPhoneNumber;
    private String diagnosis;


    public Patient(Integer patientId, Integer medicalCardNumber, String patientFamilyName, String patientName, String patientPatronymicName, String patientAddress, String patientPhoneNumber, String diagnosis) {
        this.patientId = patientId;
        MedicalCardNumber = medicalCardNumber;
        this.patientFamilyName = patientFamilyName;
        this.patientName = patientName;
        this.patientPatronymicName = patientPatronymicName;
        this.patientAddress = patientAddress;
        this.patientPhoneNumber = patientPhoneNumber;
        this.diagnosis = diagnosis;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getMedicalCardNumber() {
        return MedicalCardNumber;
    }

    public void setMedicalCardNumber(Integer medicalCardNumber) {
        MedicalCardNumber = medicalCardNumber;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", MedicalCardNumber=" + MedicalCardNumber +
                ", patientFamilyName='" + patientFamilyName + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patientPatronymicName='" + patientPatronymicName + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
