
package com.courses.apollo.serviceTest;

import com.courses.apollo.model.MedicalInfo;
import com.courses.apollo.model.Patient;
import com.courses.apollo.model.PersonalInfo;

import java.util.ArrayList;

public class PatientTestData {


    //public ArrayList<Patient> patients;

    public ArrayList<Patient> getPatientArrayList() {

        PersonalInfo personalInfo1 = new PersonalInfo(
                "McLean",
                "James",
                "Paul",
                "Liverpool",
                "3809877212");

        MedicalInfo medicalInfo1 = new MedicalInfo(
                1501,
                "Poisoning by unknown substances");


        Patient patient1 = new Patient(
                1,
                personalInfo1,
                medicalInfo1);

        PersonalInfo personalInfo2 = new PersonalInfo(
                "Williams",
                "Andrew",
                "M",
                "Leeds",
                "0102030405");

        MedicalInfo medicalInfo2 = new MedicalInfo(
                1203,
                "Euphoria");


        Patient patient2 = new Patient(
                2,
                personalInfo2,
                medicalInfo2);

        PersonalInfo personalInfo3 = new PersonalInfo(
                "Walker",
                "John",
                "Wins",
                "Liverpool",
                "0102030407");

        MedicalInfo medicalInfo3 = new MedicalInfo(
                1205,
                "Music addiction");


        Patient patient3 = new Patient(
                3,
                personalInfo3,
                medicalInfo3);


        PersonalInfo personalInfo4 = new PersonalInfo(
                "Briggs",
                "Ivy",
                "Esq",
                "Liverpool",
                "0102030408");

        MedicalInfo medicalInfo4 = new MedicalInfo(
                1207,
                "Music addiction");


        Patient patient4 = new Patient(
                4,
                personalInfo4,
                medicalInfo4);

        PersonalInfo personalInfo5 = new PersonalInfo(
                "Rattfinger",
                "Hans",
                "Peter",
                "Vienna",
                "01233");

        MedicalInfo medicalInfo5 = new MedicalInfo(
                1507,
                "Poisoning by unknown substances");


        Patient patient5 = new Patient(
                5,
                personalInfo5,
                medicalInfo5);

        // final MedicalInfo medicalInfo = patient5.getMedicalInfo();
        //String diag = medicalInfo.getDiagnosis();

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        return patients;
    }
}