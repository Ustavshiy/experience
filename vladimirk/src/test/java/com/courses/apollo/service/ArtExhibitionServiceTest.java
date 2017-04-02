package com.courses.apollo.service;

import com.courses.apollo.model.ArtExhibition;
import com.courses.apollo.model.ArtExhibitionTestData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArtExhibitionServiceTest {

    private final static ArtExhibitionService artExhibitionService = new ArtExhibitionService();
    private final static List<ArtExhibition.Painting> paintings = ArtExhibitionTestData.getPaintings();
    private final static String givenAuthrSurname = "Bosch";

    @Test
    public void testfindPaintByAuthor() {
        List<ArtExhibition.Painting> result = artExhibitionService.findPaintByAuthr(givenAuthrSurname, paintings);
        List<ArtExhibition.Painting> expected = ArtExhibitionTestData.getExpectedFindedByAuthrPaintings();
        Assert.assertEquals(expected, result);
    }
}