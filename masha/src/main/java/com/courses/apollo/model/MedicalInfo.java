package com.courses.apollo.model;

/**
 * Class with medical information for Patient class
 */
public class MedicalInfo {
    private Integer medicalCardNumber;
    private String diagnosis;

    public MedicalInfo(Integer medicalCardNumber, String diagnosis) {
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public Integer getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(Integer medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "MedicalInfo{" +
                "medicalCardNumber=" + medicalCardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}

