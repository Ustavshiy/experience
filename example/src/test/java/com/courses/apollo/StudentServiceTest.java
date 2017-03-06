package com.courses.apollo;


import com.courses.apollo.model.Student;
import org.junit.Test;

public class StudentServiceTest {
    private StudentService studentServiceTest = new StudentService();

    @Test
    public void testPrintStudentFields() {
        Student[] students = StudentTestData.getStudents();
        studentServiceTest.printStudentFields(students[0]);
    }
}
