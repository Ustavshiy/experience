package com.courses.apollo.model.figure;

import com.courses.apollo.PatientTestData;
import com.courses.apollo.model.Patient;
import com.courses.apollo.service.PatientPersonalInfoPhoneSort;
import org.junit.Test;

import java.util.*;

/**
 * Created by User on 24.04.2017.
 */
public class ComparatorPatientsExample {

    @Test
    public void sortPatients() {
        List<Patient> patientList = PatientTestData.getPatientArrayList();
        patientList.forEach(System.out::println);

        Collections.sort(patientList);
        System.out.println("After Sort");
        patientList.forEach(System.out::println);

        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getPatientPersonalInfo()
                        .getPhoneNumber()
                        .compareTo(o2.getPatientPersonalInfo().getPhoneNumber());
            }
        });
        System.out.println("After Sort");
        patientList.forEach(System.out::println);

        Patient patient = max(patientList);
        System.out.println(patient.getPatientId());

    }

    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }

}
