package com.courses.apollo.magic;


import java.io.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;

public class TestJavaRuntimeCompaling {


    public static void main(String[] args) throws Exception {
        File source = new File("C:\\Users\\User\\Desktop\\Test.java");
        File dest = new File(".\\Test.java");
        Files.copy(source.toPath(), dest.toPath());
        File file = new File(".\\Test.class");
        try {
            // Convert File to a URL
            URL url = file.toURL();          // file:/c:/myclasses/
            URL[] urls = new URL[]{url};

            // Create a new class loader with the directory
            ClassLoader cl = new URLClassLoader(urls);

            // Load in the class; MyClass.class should be located in
            // the directory file:/c:/myclasses/com/mycompany
            Class cls = cl.loadClass("Test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

