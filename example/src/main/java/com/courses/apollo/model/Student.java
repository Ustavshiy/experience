package com.courses.apollo.model;

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

    /**
     * String faculty.
     */
    private String faculty;

    /**
     * String course.
     */
    private String course;

    /**
     * String group.
     */
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString() {
        return studentId + " " + name + " " + secondName + " " + course + " " + phoneNumber;
    }

}
