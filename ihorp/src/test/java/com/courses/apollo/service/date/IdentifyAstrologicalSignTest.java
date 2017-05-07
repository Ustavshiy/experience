package com.courses.apollo.service.date;

import com.courses.apollo.model.date.AstrologicalSign;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class IdentifyAstrologicalSignTest {

    LocalDate testDate = LocalDate.of(1991, 6, 6);

    @Test
    public void testAstrological() {
        AstrologicalSign answer = AstrologicalSign.GEMINI;
        Assert.assertTrue(answer == IdentifyAstrologicalSign.identifySign(testDate));
    }
}