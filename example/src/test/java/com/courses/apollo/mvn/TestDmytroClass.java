package com.courses.apollo.mvn;

import com.courses.apollo.util.stringutils.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 12.06.2017.
 */
public class TestDmytroClass {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void sentencesWithoutSameWordsDeleteTest() throws Exception {
        Assert.assertEquals("The time. Is over. Time is over.",
                stringUtils.sentencesWithoutSameWordsDelete("The time. Is over. Time is over. By now."));
    }}
