package com.courses.apollo.model;

/**
 * Class with medical information for Patient class.
 */
public class PatientMedicalInfo {

    /**
     * ID of Patient's medical Card.
     */
    private Integer medicalCardNumber;

    /**
     * Patient's diagnosis name.
     */
    private String diagnosis;

    /**
     * Creates Medical information for Patient.
     * @param medicalCardNumber Patient's medical card ID
     * @param diagnosis the problem of Patient.
     */
    public PatientMedicalInfo(Integer medicalCardNumber, String diagnosis) {
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
        return "PatientMedicalInfo{" + "medicalCardNumber=" + medicalCardNumber + ", diagnosis='" + diagnosis + '\'' + '}';
    }
}


