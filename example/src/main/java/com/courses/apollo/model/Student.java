package com.courses.apollo.model;

import java.util.Objects;

/**
 * Student cake.
 */
public class Student {
    /**
     * Student id.
     */
    private Integer studentId;

    /**
     * Student second name.
     */
    private String secondName;

    /**
     * Student name.
     */
    private String name;

    /**
     * Student patronymic name.
     */
    private String patronymicName;

    /**
     * Student birth day.
     */
    private String birthDay;

    /**
     * Student address.
     */
    private String address;

    /**
     * String phone number.
     */
    private String phoneNumber;

    private UniversityInfo universityInfo;

    public Student(String name,
                   String studentSecondName,
                   Integer studId) {
        this.name = name;
        secondName = studentSecondName;
        studentId = studId;
    }

    public Student(String studentName,
                   String studentSecondName,
                   Integer studId,
                   String studentPhoneNumber) {
        name = studentName;
        secondName = studentSecondName;
        studentId = studId;
        phoneNumber = studentPhoneNumber;
    }

    public Student() {

    }

    public UniversityInfo getUniversityInfo() {
        return universityInfo;
    }

    public void setUniversityInfo(UniversityInfo universityInfo) {
        this.universityInfo = universityInfo;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return studentId + " " + name + " " + secondName + " " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) &&
                Objects.equals(secondName, student.secondName) &&
                Objects.equals(name, student.name) &&
                Objects.equals(patronymicName, student.patronymicName) &&
                Objects.equals(birthDay, student.birthDay) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(universityInfo, student.universityInfo);
    }

}
