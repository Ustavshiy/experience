package com.courses.apollo.service;

import com.courses.apollo.model.Patient;

import java.util.Comparator;

/**
 * Created by User on 24.04.2017.
 */
public class PatientPersonalInfoPhoneSort implements Comparator<Patient> {
    @Override
    public int compare(Patient objectOne, Patient objectTwo) {
        return objectOne.getPatientPersonalInfo()
                .getPhoneNumber()
                .compareTo(objectTwo.getPatientPersonalInfo().getPhoneNumber());
    }
}
