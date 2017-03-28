
package com.courses.apollo.servicetest;

import com.courses.apollo.model.PatientMedicalInfo;
import com.courses.apollo.model.Patient;
import com.courses.apollo.model.PatientPersonalInfo;

import java.util.ArrayList;

public class PatientTestData {
    public ArrayList<Patient> getPatientArrayList() {

        PatientPersonalInfo patientPersonalInfo1 = new PatientPersonalInfo("McLean", "James", "Paul", "Liverpool", "3809877212");
        PatientMedicalInfo patientMedicalInfo1 = new PatientMedicalInfo(1501, "Poisoning by unknown substances");
        Patient patient1 = new Patient(1, patientPersonalInfo1, patientMedicalInfo1);

        PatientPersonalInfo patientPersonalInfo2 = new PatientPersonalInfo("Williams", "Andrew", "M", "Leeds", "0102030405");
        PatientMedicalInfo patientMedicalInfo2 = new PatientMedicalInfo(1203, "Euphoria");
        Patient patient2 = new Patient(2, patientPersonalInfo2, patientMedicalInfo2);

        PatientPersonalInfo patientPersonalInfo3 = new PatientPersonalInfo("Walker", "John", "Wins", "Liverpool", "0102030407");
        PatientMedicalInfo patientMedicalInfo3 = new PatientMedicalInfo(1205, "Music addiction");
        Patient patient3 = new Patient(3, patientPersonalInfo3, patientMedicalInfo3);

        PatientPersonalInfo patientPersonalInfo4 = new PatientPersonalInfo("Briggs", "Ivy", "Esq", "Liverpool", "0102030408");
        PatientMedicalInfo patientMedicalInfo4 = new PatientMedicalInfo(1207, "Music addiction");
        Patient patient4 = new Patient(4, patientPersonalInfo4, patientMedicalInfo4);

        PatientPersonalInfo patientPersonalInfo5 = new PatientPersonalInfo("Rattfinger", "Hans", "Peter", "Vienna", "01233");
        PatientMedicalInfo patientMedicalInfo5 = new PatientMedicalInfo(1507, "Poisoning by unknown substances");
        Patient patient5 = new Patient(5, patientPersonalInfo5, patientMedicalInfo5);

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        return patients;
    }
}