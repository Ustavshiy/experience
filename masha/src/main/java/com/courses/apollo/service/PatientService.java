package com.courses.apollo.service;

import com.courses.apollo.model.Patient;
import com.courses.apollo.model.PatientMedicalInfo;

import java.util.ArrayList;

/**
 * This class contains 2 methods to manipulate with objects of Patient class.
 *<p>
 * 1. getPatientDiagnosis is searching for patients with proper diagnosis
 *</p>
 * 2. isMedCardInBorders checks out if the Medical Card of the Patioent is in proper borders.
 */
public class PatientService {

    /**
     * Method for getting Patients with proper diagnosis data.
     *
     * @param patients is a list of all hospital's patients
     * @param diagnosis is the diagnosis we are looking for
     * @return the list of patients with diagnosis needed
     */
    public ArrayList<Patient> getPatientDiagnosis(ArrayList<Patient> patients,
                                                  String diagnosis) {
        ArrayList<Patient> patientsWithDiagnosis = new ArrayList<>();
        for (int i = 0; i < patients.size(); i++) {
            PatientMedicalInfo patientMedicalInfo = patients.get(i).getPatientMedicalInfo();
            String diag = patientMedicalInfo.getDiagnosis();
            if (diagnosis.equals(diag)) {
                patientsWithDiagnosis.add(patients.get(i));
            }
        }
        return patientsWithDiagnosis;
    }

    /**
     * Method for getting Patients with proper numbers of medical cards.
     *
     * @param patients is a list of all hospital's patients.
     * @param inf      the lower border of medical card numbers
     * @param sup      the upper border of medical card numbers
     * @return the list of the patients which medical card numbers are between inf and sup
     */
    public ArrayList<Patient> medCardInBorders(ArrayList<Patient> patients, int inf, int sup) {
        ArrayList<Patient> patientsInBorders = new ArrayList<>();
        for (int i = 0; i < patients.size(); i++) {
            PatientMedicalInfo patientMedicalInfo = patients.get(i).getPatientMedicalInfo();
            int medCard = patientMedicalInfo.getMedicalCardNumber();
            if (inf <= medCard && sup >= medCard) {
                patientsInBorders.add(patients.get(i));
            }
        }
        return patientsInBorders;
    }
}
