package com.courses.apollo.service;

import com.courses.apollo.model.Student;

/**
 * Created by User.
 */
public class MemoryClass {

    /**
     * Change a primitive int in method.
     * @param i primitive variable.
     */
    public void changePrimitiveValue(int i) {
        final int tmp = 10;
        i = tmp;
    }

    /**
     * Change a primitive int in method with return.
     * @param i primitive variable.
     * @return i
     */
    public int changePrimitiveValueWithReturn(int i) {
        final int tmp = 10;
        i = tmp;
        return i;
    }

    /**
     * Change field of student in method to check is it change in original object.
     * @param student is an instance of object Student.
     */
    public void changeStudentData(Student student) {
        student = new Student();
        student.setName("Ivan");
    }

    /**
     * Check whether the original array of primitive variables changes.
     * @param array array of a primitive variables.
     */
    public void testChangePrimitiveInArray(int[] array) {
        final int[] arrayTwo = {10};
        array[0] = arrayTwo[0];
    }

    /**
     * Check whether the original wrap value variable changes.
     * @param i is Integer.
     */
    public void changeWrapValueWithReturn(Integer i) {
        final Integer tmp = 10;
        i = tmp;
    }
}
