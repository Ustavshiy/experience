package com.courses.apollo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Student cake.
 */
public class Student implements Serializable {
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
     * Marks list
     */
    List<Integer> marks;

    /**
     * String phone number.
     */
    private String phoneNumber;

    /**
     * University info.
     */
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

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(String name) {
        this.name = name;
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

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityInfo=" + universityInfo +
                '}';
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
                Objects.equals(marks, student.marks) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(universityInfo, student.universityInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, secondName, name, patronymicName, birthDay, address, marks, phoneNumber, universityInfo);
    }
}
