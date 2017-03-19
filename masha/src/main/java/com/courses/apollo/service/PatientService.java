package com.courses.apollo.service;

import com.courses.apollo.model.MedicalInfo;
import com.courses.apollo.model.Patient;

import java.util.ArrayList;


/**
 * This class contains 2 methods to manipulate with objects of Patient class.
 *<p>
 * 1. getPatientDiagnosis is searching for patients with proper diagnosis
 * and prints out the list of these patients.
 *</p>
 * 2. isMedCardInBorders checks out if the Medical Card of the Patioent is in proper borders.
 */
public class PatientService {

    /**
     * Method for getting Patients with proper diagnosis data.
     * Also prints out the list of the patients with diagnosis needed.
     *
     * @param patients  is a list of all hospital's patients
     * @param diagnosis is the diagnosis we are looking for
     * @return the list of patients with diagnosis needed
     */
    public ArrayList<Patient> getPatientDiagnosis(ArrayList<Patient> patients,
                                                  String diagnosis) {

        ArrayList<Patient> patientsWithDiagnosis = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            MedicalInfo medicalInfo = patients.get(i).getMedicalInfo();

            String diag = medicalInfo.getDiagnosis();

            if (diagnosis.equals(diag)) {
                patientsWithDiagnosis.add(patients.get(i));

            }
        }
        System.out.println("Patients with " + diagnosis + ":");
        for (int i = 0; i < patientsWithDiagnosis.size(); i++) {

            System.out.println(i + 1 + "." + patientsWithDiagnosis.get(i));
        }
        if (patientsWithDiagnosis.size() == 0) {
            System.out.println("no patients with " + diagnosis + " for now");
        }
        return patientsWithDiagnosis;
    }

    /**
     * Method for getting Patients with proper numbers of medical cards.
     * Also prints out the list of such Patients.
     *
     * @param patients is a list of all hospital's patients.
     * @param inf      the lower border of medical card numbers
     * @param sup      the upper border of medical card numbers
     * @return the list of the patients which medical card numbers are between inf and sup
     */
    public ArrayList<Patient> medCardInBorders(ArrayList<Patient> patients, int inf, int sup) {

        ArrayList<Patient> patientsInBorders = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            MedicalInfo medicalInfo = patients.get(i).getMedicalInfo();
            int medCard = medicalInfo.getMedicalCardNumber();
            if ((inf <= medCard) && (sup >= medCard)) {
                patientsInBorders.add(patients.get(i));
            }
        }
        System.out.println("patients with card between [" + inf + ".." + sup + "]:");
        for (int i = 0; i < patientsInBorders.size(); i++) {
            System.out.println((i + 1) + "." + patientsInBorders.get(i));
        }
        if (patientsInBorders.size() == 0) {
            System.out.println("no patients with card between [" + inf + ".." + sup + "]");
        }
        return patientsInBorders;
    }
}
