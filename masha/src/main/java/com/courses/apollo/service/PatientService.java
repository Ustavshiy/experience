package com.courses.apollo.service;

import com.courses.apollo.model.Patient;
import com.courses.apollo.model.MedicalInfo;
import com.courses.apollo.model.PersonalInfo;

import java.util.ArrayList;


/**
 * This class contains 2 methods to manipulate with objects of Patient class.
 *
 * 1. getPatientDiagnosis is searching for patients with proper diagnosis
 * and prints out the list of these patients.
 *
 * 2. isMedCardInBorders checks out if the Medical Card of the Patioent is in proper borders.
 */
public class PatientService {

    /**
     *
     * @param patients is a list of all hospital's patients
     * @param diagnosis is the diagnosis we are looking for
     * @return the list of patients with diagnosis needed
     * also the method prints out the list of the patients with diagnosis needed
     */
    public ArrayList<Patient> getPatientDiagnosis(ArrayList<Patient> patients, String diagnosis) {

        /**
         * list of the patient with the diagnosis needed
         */
        ArrayList<Patient> patientsWithDiagnosis = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            MedicalInfo medicalInfo = patients.get(i).getMedicalInfo();

            /**
             * diag is a field for
             */
            String diag = medicalInfo.getDiagnosis();

            if (diagnosis.equals(diag)) {
                patientsWithDiagnosis.add(patients.get(i));

            }
        }
        System.out.println("patients with " + diagnosis);
            for (int i = 0; i < patientsWithDiagnosis.size(); i++ ) {

            System.out.println(i+1 + "." + patientsWithDiagnosis.get(i));
                System.out.println(" ");

            }
            return patientsWithDiagnosis;
        }


    /**
     *
     * @param patients is a list of all hospital's patients
     * @param inf the lower border of medical card numbers
     * @param sup the upper border of medical card numbers
     * @return the list of the patients which medical card numbers are between inf and sup
     * also the method prints out the list of such patients
     */

    public ArrayList<Patient> isMedCardInBorders(ArrayList<Patient> patients, int inf, int sup) {

        ArrayList<Patient> patientsInBorders = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            MedicalInfo medicalInfo = patients.get(i).getMedicalInfo();
            int medCard = medicalInfo.getMedicalCardNumber();

            if ( (inf <= medCard)&&(sup >= medCard)) {
            patientsInBorders.add(patients.get(i));

            }
        }

        System.out.println("patients with card between [" + inf + ".." + sup + "]");
        for (int i = 0; i < patientsInBorders.size(); i++ ) {
            System.out.println(i+1 + "." + patientsInBorders.get(i));
            System.out.println(" ");
        }
        return patientsInBorders;
    }

    }
