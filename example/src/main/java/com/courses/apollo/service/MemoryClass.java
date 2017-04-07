package com.courses.apollo.service;

import com.courses.apollo.model.Student;

/**
 * Created by User on 06.04.2017.
 */
public class MemoryClass {
    int i = 0;

    public void changePrimitiveValue(int i) {
        i = 10;
    }

    public int changePrimitiveValueWithReturn(int i) {
        i = 10;
        return i;
    }

    public void changeStudentData(Student student) {
        student = new Student();
        student.setName("Ivan");
    }

    public void testChangePrimitiveInArray(int[] array) {
        array[0] = 10;
    }

    public void changeWrapValueWithReturn(Integer i) {
        i = 10;
    }

    public int performErrorStack() {
        System.out.println(i++);
        return 1 + performErrorStack();
    }

    public void performOutOfMemory() {
        int[] array = new int[Integer.MAX_VALUE];
    }
}
