package com.courses.apollo.model;

/**
 * Created by MashaJM on 17.03.2017.
 */
public class MedicalInfo {
    private Integer MedicalCardNumber;
    private String diagnosis;

    public MedicalInfo(Integer medicalCardNumber, String diagnosis) {
        MedicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public Integer getMedicalCardNumber() {
        return MedicalCardNumber;
    }

    public void setMedicalCardNumber(Integer medicalCardNumber) {
        MedicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
