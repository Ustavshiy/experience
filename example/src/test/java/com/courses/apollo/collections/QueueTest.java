package com.courses.apollo.collections;

import com.courses.apollo.model.Student;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Function;

/**
 * Created by User on 11.05.2017.
 */
public class QueueTest {

    @Test
    public void testQueue() {
        Student student = new Student();
        ArrayDeque<String> strings = new ArrayDeque<>();
        strings.add("Test");
        strings.add("Test");
        strings.add("Test");
        strings.add("Test");
        strings.add("Test");
        String s = strings.pop();
        System.out.println(strings.size());

    }

    @Test
    public void testPriorityDeq() {
        PriorityQueue<Student> students = new PriorityQueue<>(Comparator.comparing(Student::getStudentId));
        students.add(new Student("Tolik", "Anatolenko", 10));
        students.add(new Student("Valik", "Krivoruchko", 35));
        students.add(new Student("Petya", "Krivozhopenko", 4));
        students.add(new Student("Shura", "Shurupenko", 12));
        students.add(new Student("Kesha", "Papuga", 2));
        System.out.println(students.peek());
    }
}
