package com.courses.apollo.model;

/**
 * Class for Hospital's Patients.
 */
public class Patient {

    /**
     * ID of hospital's Patient.
     */
    private Integer patientId;

    /**
     * link to personal information card of Patient.
     */
    private PersonalInfo personalInfo;

    /**
     * link to medical information card of Patient.
     */
    private MedicalInfo medicalInfo;

    /**
     * Creates Patient's card with full information.
     * @param patientId personal ID of Patient
     * @param personalInfo Patient's personal information
     * @param medicalInfo Patient's medical information
     */
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

    @Override
    public String toString() {
        return "Patient{"
                + "patientId="
                + patientId
                + ", personalInfo="
                + personalInfo
                + ", medicalInfo="
                + medicalInfo
                + '}';
    }
}
