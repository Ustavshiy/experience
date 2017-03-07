package com.courses.apollo;

import com.courses.apollo.model.Student;

public class StudentTestData {

    public static Student[] getStudents() {
        Student student = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        Student studentTwo =
                new Student("Petro","Petrenko", 2 ,"B", "12343454667");
        return new Student[]{student, studentTwo};
    }

}
