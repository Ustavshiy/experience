package com.courses.apollo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ArtExhibitionTestData.
 */
public class ArtExhibitionTestData {

    public static List<ArtExhibition.Painting> getPaintings() {
        ArtExhibition.Painting painting1 = new ArtExhibition.Painting("The Last Judgment",
                "Hieronymus", "Bosch", 1500);
        ArtExhibition.Painting painting2 = new ArtExhibition.Painting("Death", "Giovanni",
                "Segantini", 1898);
        ArtExhibition.Painting painting3 = new ArtExhibition.Painting("Wounded angel", "Hugo",
                "Simberg", 1903);
        ArtExhibition.Painting painting4 = new ArtExhibition.Painting("Night", "Ferdinand",
                "Hodler", 1890);
        ArtExhibition.Painting painting5 = new ArtExhibition.Painting("The Swan Princess",
                "Mikhail", "Vrubel", 1900);
        ArtExhibition.Painting painting6 = new ArtExhibition.Painting("Demon Downcast", "Mikhail",
                "Vrubel", 1902);
        ArtExhibition.Painting painting7 = new ArtExhibition.Painting("The Garden of Earthly Delights",
                "Hieronymus", "Bosch", 1510);
        List<ArtExhibition.Painting> paintings = new ArrayList<>();
        paintings.add(painting1);
        paintings.add(painting2);
        paintings.add(painting3);
        paintings.add(painting4);
        paintings.add(painting5);
        paintings.add(painting6);
        paintings.add(painting7);
        return paintings;
    }

    public static List<ArtExhibition.Painting> getExpectedFindedByAuthrPaintings() {
        ArtExhibition.Painting painting1 = new ArtExhibition.Painting("The Last Judgment",
                "Hieronymus", "Bosch", 1500);
        ArtExhibition.Painting painting7 = new ArtExhibition.Painting("The Garden of Earthly Delights",
                "Hieronymus", "Bosch", 1510);
        List<ArtExhibition.Painting> paintings = new ArrayList<>();
        paintings.add(painting1);
        paintings.add(painting7);
        return paintings;
    }
}