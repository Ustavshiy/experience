package com.courses.apollo.util.stringutils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();

    @Test
    public void maxSubstringDelete(){
        Assert.assertEquals("Thr", stringUtils.maxSubstringDelete("The time is over"));
    }

    @Test
    public void sentencesWithoutSameWordsDeleteTest(){
        Assert.assertEquals("The time. Is over. Time is over.",
                stringUtils.sentencesWithoutSameWordsDelete("The time. Is over. Time is over. By now."));
    }


}
