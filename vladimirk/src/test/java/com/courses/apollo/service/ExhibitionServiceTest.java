package com.courses.apollo.service;

import com.courses.apollo.model.Exhibition;
import com.courses.apollo.model.ExhibitionTestData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ExhibitionServiceTest {

    private final static ExhibitionService EXHIBITION_SERVICE = new ExhibitionService();
    private final static List<Exhibition.Painting> paintings = ExhibitionTestData.getPaintings();
    private final static String givenAuthrSurname = "Bosch";

    @Test
    public void testfindPaintByAuthor() {
        List<Exhibition.Painting> result = EXHIBITION_SERVICE.findPaintByAuthr(givenAuthrSurname, paintings);
        List<Exhibition.Painting> expected = ExhibitionTestData.getExpectedFindedByAuthrPaintings();
        Assert.assertEquals(expected, result);
    }
}