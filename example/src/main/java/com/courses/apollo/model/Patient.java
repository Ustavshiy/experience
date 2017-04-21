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
    private PatientPersonalInfo patientPersonalInfo;

    /**
     * link to medical information card of Patient.
     */
    private PatientMedicalInfo patientMedicalInfo;

    /**
     * Creates Patient's card with full information.
     * @param patientId personal ID of Patient
     * @param patientPersonalInfo Patient's personal information
     * @param patientMedicalInfo Patient's medical information
     */
    public Patient(Integer patientId, PatientPersonalInfo patientPersonalInfo, PatientMedicalInfo patientMedicalInfo) {
        this.patientId = patientId;
        this.patientPersonalInfo = patientPersonalInfo;
        this.patientMedicalInfo = patientMedicalInfo;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public PatientPersonalInfo getPatientPersonalInfo() {
        return patientPersonalInfo;
    }

    public void setPatientPersonalInfo(PatientPersonalInfo patientPersonalInfo) {
        this.patientPersonalInfo = patientPersonalInfo;
    }

    public PatientMedicalInfo getPatientMedicalInfo() {
        return patientMedicalInfo;
    }

    public void setPatientMedicalInfo(PatientMedicalInfo patientMedicalInfo) {
        this.patientMedicalInfo = patientMedicalInfo;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", patientPersonalInfo=" + patientPersonalInfo
                + ", patientMedicalInfo=" + patientMedicalInfo + '}';
    }
}
