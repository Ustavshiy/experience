package com.courses.apollo;

import com.courses.apollo.model.Student;
import com.courses.apollo.model.University;
import com.courses.apollo.model.UniversityInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentTestData {

    public static Student[] getStudents() {
        Student student = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        Student studentTwo =
                new Student("Petro", "Petrenko", 2, "12343454667");
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
        student.setMarks(randomMarks());
        Student studentTwo =
                new Student("Petro", "Petrenko", 2, "12343454667");
        studentTwo.setMarks(randomMarks());
        Student studentThree = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        studentThree.setMarks(randomMarks());
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
        student.setMarks(randomMarks());
        UniversityInfo infoStudentTwo = new UniversityInfo();
        infoStudentOne.setCourse("A");
        infoStudentOne.setFaculty("B");

        Student studentTwo =
                new Student("Petro", "Petrenko", 2, "12343454667");
        studentTwo.setUniversityInfo(infoStudentTwo);
        studentTwo.setMarks(randomMarks());
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(studentTwo);
        return students;
    }

    public static List<University> getUniversities() {
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

    public static List<Integer> randomMarks() {
        List<Integer> arrayRandom = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Integer r = rand.nextInt(100);
            arrayRandom.add(r);
        }
        return arrayRandom;
    }

}
