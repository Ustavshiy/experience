package com.courses.apollo.model.department;

import java.time.LocalDate;

/**
 * Class Employee.
 */
public class Employee {
    /**
     * Employee name.
     */
    private String employeeName;
    /**
     * Employee accession date.
     */
    private LocalDate accessionDate;

    public Employee(String employeeName, int year, int month, int day) {
        this.employeeName = employeeName;
        this.accessionDate = LocalDate.of(year, month, day);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getAccessionDate() {
        return accessionDate.toString();
    }
}
