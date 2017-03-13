package com.courses.apollo;

import com.courses.apollo.model.Student;

import java.util.ArrayList;

public class StudentTestData {

    public static Student[] getStudents() {
        Student student = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        Student studentTwo =
                new Student("Petro","Petrenko", 2 ,"B", "12343454667");
        Student studentThree = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        return new Student[]{student, studentTwo, studentThree};
    }

    public static ArrayList<Student> getStudentArrayList() {
        Student student = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        Student studentTwo =
                new Student("Petro","Petrenko", 2 ,"B", "12343454667");
        Student studentThree = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(studentTwo);
        students.add(studentThree);
        return students;
    }

}
