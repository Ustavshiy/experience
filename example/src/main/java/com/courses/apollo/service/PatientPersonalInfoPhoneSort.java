package com.courses.apollo.service;

import com.courses.apollo.model.Patient;

import java.util.Comparator;

/**
 * Created by User on 24.04.2017.
 */
public class PatientPersonalInfoPhoneSort implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getPatientPersonalInfo()
                .getPhoneNumber()
                .compareTo(o2.getPatientPersonalInfo().getPhoneNumber());
    }
}
