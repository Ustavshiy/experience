package com.courses.apollo.service;

import com.courses.apollo.model.Student;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 06.04.2017.
 */
public class MemoryClassTest {

    public MemoryClass memoryClass;


    @Before
    public void before() {
        memoryClass = new MemoryClass();
    }

    @Test
    public void testChangePrimitiveValue() {
        int toChange = 100;
        memoryClass.changePrimitiveValue(toChange);
        System.out.println(toChange);
    }

    @Test
    public void testChangePrimitiveValueWithReturn() {
        int toChange = 100;
        memoryClass.changePrimitiveValueWithReturn(toChange);
        System.out.println(toChange);
    }

    @Test
    public void testChangeStudent() {
        Student student = new Student();
        student.setName("Petro");
        memoryClass.changeStudentData(student);
        System.out.println(student.getName());
    }

    @Test
    public void testChangePrimitiveInArray() {
        int[] toChange = new int[]{100};
        memoryClass.testChangePrimitiveInArray(toChange);
        System.out.println(toChange[0]);
    }

    @Test
    public void testIfVariablesReferToTheSameObject() {
        Integer i = new Integer(10);
        Integer b = i;
        i = 20;
        System.out.println(b);
    }

    @Test
    public void testChangeWrapValueWithReturn() {
        Integer toChange = 100;
        memoryClass.changeWrapValueWithReturn(toChange);
        System.out.println(toChange);
    }

    public void performErrorStackTest() {
        memoryClass.performErrorStack();
    }

    public void performErrorHeapTest() {
        memoryClass.performOutOfMemory();
    }



}
