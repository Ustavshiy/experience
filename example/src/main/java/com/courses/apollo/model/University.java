package com.courses.apollo.model;

import java.util.ArrayList;

/**
 * Created by User on 13.03.2017.
 */
public class University {
    private String universityName;

    private ArrayList<String> faculties;

    private ArrayList<Student> students;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<String> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<String> faculties) {
        this.faculties = faculties;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
