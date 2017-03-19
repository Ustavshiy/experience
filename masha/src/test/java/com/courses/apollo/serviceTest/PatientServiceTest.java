package com.courses.apollo.serviceTest;
import com.courses.apollo.model.Patient;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class PatientServiceTest {
    PatientTestData patientTestData = new PatientTestData();

    @Test
    public void testGetPatientDiagnosis() {

        ArrayList<Patient> patients =  patientTestData.getPatientArrayList();


    }


}
