package com.courses.apollo.model;

/**
 * Student cake.
 */
public class Student {

    private Integer studentId;

    private String secondName;

    private String name;

    private boolean isMarried;

    private String patronymicName;

    //TODO Date, Calendar, DateTimeZone
    private String birthDay;

    //TODO maybe should be split by city,street,house, postal code
    private String address;
    //TODO it could be plus at start,brackets,hyphen
    private String phoneNumber;
    //TODO it could have number, code, abbreviation
    private String faculty;

    private String course;

    private String group;

    public Student(String name,
                   String studentSecondName,
                   Integer studId,
                   String courseName) {
        this.name = name;
        secondName = studentSecondName;
        studentId = studId;
        course = courseName;
    }

    public Student(String studentName,
                   String studentSecondName,
                   Integer studId,
                   String courseName,
                   String studentPhoneNumber) {
        name = studentName;
        secondName = studentSecondName;
        studentId = studId;
        course = courseName;
        phoneNumber = studentPhoneNumber;
    }

    public Student() {

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public String toString() {
        return studentId + " " + name + " " + secondName + " " + course + " " + phoneNumber;
    }

}
