package com.courses.apollo.exceptions;

import com.courses.apollo.service.MemoryClass;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by User on 03.04.2017.
 */
public class ExceptionTest {

    public MemoryClass memoryClass;


    @Before
    public void before() {
        memoryClass = new MemoryClass();
    }

    @Test
    public void testArray() {
        System.out.println("Test Array start");
        doSomethingOne();
    }

    @Test
    public void testReadFromUrl() {
        URL url = null;
        try {
            url = new URL("http://www.facebook.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection connection = null;
        try {
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream stream = null;
        try {
            stream = connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] result = new byte[128];
        try {
            while (stream.read(result) != -1) {
                System.out.println(new String(result));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void independentMethod() {
        System.out.println("From independent Method");
    }

    public void doSomethingOne() {
        System.out.println("From one");
        doSomethingTwo();
    }

    public void doSomethingTwo() {

        System.out.println("From Two");
        doSomethingThree();
    }

    public void doSomethingThree() {
        System.out.println("From three");
        doSomethingFour();
    }

    public void doSomethingFour() {
        System.out.println("From Four");
        try {
            doSomethingFive();
        } catch (NullPointerException e) {
            independentMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("From Four in catch");
        }
    }

    public void doSomethingFive() {
        int[] array = new int[]{1, 3, 2, 56, 4, 7, 9};
        System.out.println("From Five");
        for (int i = 0; i < 8; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void throwTest() {
        try {
            if (true) {
                throw new Exception();
            }
            int[] array = new int[]{};
            System.out.println(array[1]);
            System.out.println(10 / 0);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("In Exception");
        }
    }

    @Test(expected = MalformedURLException.class)
    public void throwsTest() throws Exception {
        performException("sdafdsfsdf");
    }

    public void performException(String url) throws MalformedURLException {
        URL ur = new URL(url);
    }

    public void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void methodB() throws Exception {
        methodC();
    }

    public void methodC() throws IOException {
        throw new IOException();
    }

    public int getInt(int i) {
        if (i > 10) {
            return i;
        }
        throw new RuntimeException();
    }

    @Test
    public void nestedTry() {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Nested try");
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("In general try");
        }
    }

    @Test
    public void testFinally() {
        try {
            memoryClass.performErrorStack();
        } catch (Error error) {
            memoryClass.performOutOfMemory();
        } finally {
            System.out.println("Hello World!");
        }
    }

    @Test
    public void testReturn() {
        System.out.println(returnSomething());
        System.out.println(returnException());
    }

    public int returnSomething() {
        try {
            return 10;
        } finally {
            return 42;
        }
    }

    public int returnException() {
        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            throw new Error();
        } finally {
            return 42;
        }
    }
}
