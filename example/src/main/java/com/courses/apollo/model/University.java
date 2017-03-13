package com.courses.apollo.model;

import java.util.ArrayList;

/**
 * Student information model.
 */
public class University {
    /**
     * University name.
     */
    private String universityName;
    /**
     * List of faculties.
     */
    private ArrayList<String> faculties;
    /**
     * Students list.
     */
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
