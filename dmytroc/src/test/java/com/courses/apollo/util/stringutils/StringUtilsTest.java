package com.courses.apollo.util.stringutils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dell on 23.03.2017.
 */
public class StringUtilsTest {

    @Test
    public void stringUtilsTest(){

        StringUtils stringUtils = new StringUtils();
        Assert.assertEquals("Thr", stringUtils.maxSubstringDelete("The time is over"));
    }
}
