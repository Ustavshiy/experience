package com.courses.apollo;

import com.courses.apollo.model.Student;
import com.courses.apollo.model.University;
import com.courses.apollo.model.UniversityInfo;

import java.util.ArrayList;

public class StudentTestData {

    public static Student[] getStudents() {
        Student student = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        Student studentTwo =
                new Student("Petro","Petrenko", 2 ,"12343454667");
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
                new Student("Petro","Petrenko", 2 ,"12343454667");
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

    public static ArrayList<Student> studentsWithUniversityInfo() {
        UniversityInfo infoStudentOne = new UniversityInfo();
        infoStudentOne.setCourse("B");
        infoStudentOne.setFaculty("Faculty First");

        Student student = new Student(
                "Ivan",
                "Ivaneko",
                1);
        student.setUniversityInfo(infoStudentOne);
        UniversityInfo infoStudentTwo = new UniversityInfo();
        infoStudentOne.setCourse("A");
        infoStudentOne.setFaculty("B");

        Student studentTwo =
                new Student("Petro","Petrenko", 2 ,"12343454667");
        studentTwo.setUniversityInfo(infoStudentTwo);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(studentTwo);
        return students;
    }

    public static ArrayList<University> getUniversities() {
        University universityOne = new University();
        universityOne.setUniversityName("KPI");
        universityOne.setStudents(studentsWithUniversityInfo());

        University universityTwo = new University();
        universityTwo.setUniversityName("Shevchenko");
        universityTwo.setStudents(getStudentArrayList());
        ArrayList<University> universities = new ArrayList<>();
        universities.add(universityOne);
        universities.add(universityTwo);
        return universities;
    }

}
