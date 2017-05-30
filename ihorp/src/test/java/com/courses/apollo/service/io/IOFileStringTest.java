package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class IOFileStringTest {

    private static String fileWithText = "src\\test\\resources\\IOFileStringTest\\NewFile.txt";
    private static String testedText = "tested text";

    @Test
    public void writeToFileTest() throws IOException{
        IOFileString.writeToFile(fileWithText, testedText, false);
        Assert.assertEquals(testedText, IOFileString.readFromFile(fileWithText));
    }

    @Test(expected = IOException.class)
    public void testReadFromIOException() throws IOException {
        String notExistFile = "\\src\\test\\resources\\FileNotExists";
        IOFileString.readFromFile(notExistFile);
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<IOFileString> constructor = IOFileString.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @AfterClass
    public static void deleteFiles() {
        new File(fileWithText).delete();
        new File(fileWithText.replaceAll("[\\\\][^\\\\]+$", "")).delete();
    }
}
