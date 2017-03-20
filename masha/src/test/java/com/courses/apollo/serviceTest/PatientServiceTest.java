package com.courses.apollo.serviceTest;

import com.courses.apollo.model.Patient;
import com.courses.apollo.service.PatientService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PatientServiceTest {
    PatientTestData patientTestData = new PatientTestData();

    @Test
    public void testGetPatientDiagnosisSucceed() {
        PatientService patientService = new PatientService();
        ArrayList<Patient> patients = patientTestData.getPatientArrayList();
        Patient johnnie = patients.get(2);
        Patient ivy = patients.get(3);
        final ArrayList<Patient> expectedList = new ArrayList<>();
        expectedList.add(johnnie);
        expectedList.add(ivy);
        Assert.assertEquals(expectedList, patientService.getPatientDiagnosis(patients, "Music addiction"));
    }

    @Test
    public void testGetPatientDiagnosisUnsucceed() {
        PatientService patientService = new PatientService();
        ArrayList<Patient> patients = patientTestData.getPatientArrayList();
        final ArrayList<Patient> expectedList = new ArrayList<>();
        Assert.assertEquals(expectedList, patientService.getPatientDiagnosis(patients, "Acid poisoning"));
    }

    @Test
    public void testMedCardInBordersSucceed() {
        PatientService patientService = new PatientService();
        ArrayList<Patient> patients = patientTestData.getPatientArrayList();

        Patient andy = patients.get(1);
        Patient johnnie = patients.get(2);
        Patient ivy = patients.get(3);

        final ArrayList<Patient> expectedList = new ArrayList<>();
        expectedList.add(andy);
        expectedList.add(johnnie);
        expectedList.add(ivy);
        Assert.assertEquals(expectedList, patientService.medCardInBorders(patients, 1200, 1300));

    }

    @Test
    public void testMedCardInBordersUnsucceed() {

        PatientService patientService = new PatientService();
        ArrayList<Patient> patients = patientTestData.getPatientArrayList();

        final ArrayList<Patient> expectedList = new ArrayList<>();

        Assert.assertEquals(expectedList, patientService.medCardInBorders(patients, 1000, 1200));

    }


}
