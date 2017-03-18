package com.courses.apollo.model;

/**
 * Created by Maria on 13.03.2017.
 */
public class Patient {

    private Integer patientId;
    private PersonalInfo personalInfo;
    private MedicalInfo medicalInfo;

    public Patient(Integer patientId, PersonalInfo personalInfo, MedicalInfo medicalInfo) {
        this.patientId = patientId;
        this.personalInfo = personalInfo;
        this.medicalInfo = medicalInfo;
    }



    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public MedicalInfo getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(MedicalInfo medicalInfo) {
        this.medicalInfo = medicalInfo;
    }
}
