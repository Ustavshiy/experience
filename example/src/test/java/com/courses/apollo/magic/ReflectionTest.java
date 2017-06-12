package com.courses.apollo.magic;

import com.courses.apollo.model.Student;
import com.courses.apollo.model.annotation.MyOwnJunitTest;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.stream.Stream;

/**
 * Created by User on 29.05.2017.
 */
public class ReflectionTest {
    private String test;
    private String testTwo;

//    public ReflectionTest(String test, String testTwo) {
//        this.test = test;
//        this.testTwo = testTwo;
//    }
//
//    public ReflectionTest() {
//    }

    @Test
    public void getClassParameters() throws Exception {
        ReflectionTest reflectionTest = new ReflectionTest();//1
        Class reflectionTestClass = reflectionTest.getClass();
        System.out.println(reflectionTestClass.getClassLoader());
        ReflectionTest reflectionTest2 = (ReflectionTest) Class.forName("com.courses.apollo.magic.ReflectionTest")
                .newInstance();
        reflectionTest2.printSomething();
        ReflectionTest emp2 = ReflectionTest.class.newInstance();

        Constructor<ReflectionTest> constructor = ReflectionTest.class.getConstructor();
        ReflectionTest reflectionTest3 = constructor.newInstance();
        reflectionTest3.printSomething();
        ReflectionTest.class.getConstructors();
    }

    @Test
    public void testFieldsAndMethods() throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            ClassNotFoundException,
            InstantiationException,
            NoSuchFieldException {
        ReflectionTest reflectionTest = new ReflectionTest();//1
        Class reflectionTestClass = reflectionTest.getClass();
        Method method = reflectionTestClass.getMethod("printSomething");
        method.invoke(reflectionTest);
        Method methodPrivate = reflectionTestClass.getDeclaredMethod("printPrivateSomething");
        methodPrivate.setAccessible(true);
        methodPrivate.invoke(reflectionTest);
        Student student = (Student) Class.forName("com.courses.apollo.model.Student").newInstance();
        Class studentClass = student.getClass();
        Field fieldStudentId = studentClass.getDeclaredField("studentId");
        fieldStudentId.setAccessible(true);
        fieldStudentId.set(student, 100);

        System.out.println(student.getStudentId());
//        Stream.of(new A(),new B(),new C())
//                .forEach(instance -> {
//                    try {
//                        instance.getClass().getMethod("printSomething").invoke(instance);
//                    } catch (Exception e) {}
//                });
    }

    @Test
    public void testArrayReflection() {
        int[] array = new int[10];
        int[] ids = (int[]) Array.newInstance(int.class, 5);
    }

    @Test
    public void executeWithAnnotationValue() throws Exception{
        ReflectionTest intStreamTest = new ReflectionTest();
        Class clazz = intStreamTest.getClass();
        Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Annotation[] annotations = methods[i].getAnnotations();
            for (int j = 0; j < annotations.length; j++) {
                if(annotations[j] instanceof MyOwnJunitTest) {
                    MyOwnJunitTest annotation = (MyOwnJunitTest)annotations[j];
                    String value = annotation.s();
                    methods[i].invoke(intStreamTest, value);
                }
            }
        }
    }

    public void printSomething() {
        System.out.println("Hello Bogdan");
    }

    private void printPrivateSomething() {
        System.out.println("Hello Bogdan from private bank");
    }

    @MyOwnJunitTest(s = "Hello World!")
    public void myOwnJunitTest(String argument) {
        System.out.println(argument);
    }

}
