package com.courses.apollo.service;

import com.courses.apollo.model.*;

import java.util.Optional;

import static java.util.Optional.ofNullable;

/**
 * Created by User on 27.04.2017.
 */
public class OptionalExamples {

    public void testOptional() {
        Country country = null;
        if(country != null && country.getCity() != null &&  country.getCity().getCompany() != null
                && country.getCity().getCompany().getDepartment() != null
                && country.getCity().getCompany().getDepartment().getEmployee() != null) {

        }
        double d = ofNullable(country)
                .filter(c -> "Ukraine".equals(c.getName()))
                .map(Country::getCity)
                .map(City::getCompany)
                .map(Company::getDepartment)
                .map(Department::getEmployee)
                .map(Employee::getSalary)
                .orElse(0.0);
        Student student = new Student();
        Optional<String> res = Optional.of(student)
                .flatMap(s -> ofNullable(student.getAddress()))
                .flatMap(s -> ofNullable(student.getBirthDay()))
                .flatMap(s -> ofNullable(student.getName()));
        System.out.println(res.isPresent());
    }

    public boolean isAllFieldsField(Student student) {
        return Optional.of(student)
                .flatMap(s -> ofNullable(student.getAddress()))
                .flatMap(s -> ofNullable(student.getBirthDay()))
                .flatMap(s -> ofNullable(student.getName()))
                .isPresent();
    }
}
