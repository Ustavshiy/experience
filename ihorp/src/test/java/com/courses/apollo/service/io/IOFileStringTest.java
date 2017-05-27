package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class IOFileStringTest {

    private static String fileWithText = "src\\test\\resources\\TestIO.txt";
    private static String testedText = "tested text";

    @Test
    public void writeToFileTest() throws IOException {
        IOFileString.writeToFile(fileWithText, testedText, false);
        Assert.assertEquals(testedText, IOFileString.readFromFile(fileWithText));
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
    }
}
