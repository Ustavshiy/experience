package com.courses.apollo.service.date;

import com.courses.apollo.model.date.AstrologicalSign;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class IdentifyAstrologicalSignTest {

    private LocalDate testDate = LocalDate.of(1991, 6, 6);

    @Test
    public void testAstrological() {
        AstrologicalSign answer = AstrologicalSign.GEMINI;
        assertTrue(answer == IdentifyAstrologicalSign.identifySign(testDate));
    }

        @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Constructor<IdentifyAstrologicalSign> constructor = IdentifyAstrologicalSign.class.getDeclaredConstructor();
            assertTrue(Modifier.isPrivate(constructor.getModifiers()));
            constructor.setAccessible(true);
            constructor.newInstance();
    }
}