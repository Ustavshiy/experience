package com.courses.apollo.io;

import com.courses.apollo.StudentTestData;
import com.courses.apollo.model.Student;
import org.junit.Test;

import java.io.*;

/**
 * Created by User on 13.04.2017.
 */
public class SerializationTest {

    @Test
    public void saveOneStudent() {
        Student student = new Student();
        student.setName("Ivan");
        try(OutputStream stream = new FileOutputStream("student.dat");
            ObjectOutputStream objectStream = new ObjectOutputStream(stream)) {
            objectStream.writeObject(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readOneStudent() {
        try(InputStream stream = new FileInputStream("student.dat");
            ObjectInputStream objectStream = new ObjectInputStream(stream)) {
            Student student = (Student) objectStream.readObject();
            System.out.println(student.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void saveManyStudent() {
        Student[] students = StudentTestData.getStudents();
        try(OutputStream stream = new FileOutputStream("students.dat");
            ObjectOutputStream objectStream = new ObjectOutputStream(stream)) {
            objectStream.writeObject(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readManyStudents() {
        try(InputStream stream = new FileInputStream("students.dat");
            ObjectInputStream objectStream = new ObjectInputStream(stream)) {
            Student[] students = (Student[]) objectStream.readObject();
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
