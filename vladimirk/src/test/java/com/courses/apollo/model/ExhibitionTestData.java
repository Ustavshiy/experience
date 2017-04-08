package com.courses.apollo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ExhibitionTestData.
 */
public class ExhibitionTestData {

    public static List<Exhibition.Painting> getPaintings() {
        Exhibition.Painting painting1 = new Exhibition.Painting("The Last Judgment",
                "Hieronymus", "Bosch", 1500);
        Exhibition.Painting painting2 = new Exhibition.Painting("Death", "Giovanni",
                "Segantini", 1898);
        Exhibition.Painting painting3 = new Exhibition.Painting("Wounded angel", "Hugo",
                "Simberg", 1903);
        Exhibition.Painting painting4 = new Exhibition.Painting("Night", "Ferdinand",
                "Hodler", 1890);
        Exhibition.Painting painting5 = new Exhibition.Painting("The Swan Princess",
                "Mikhail", "Vrubel", 1900);
        Exhibition.Painting painting6 = new Exhibition.Painting("Demon Downcast", "Mikhail",
                "Vrubel", 1902);
        Exhibition.Painting painting7 = new Exhibition.Painting("The Garden of Earthly Delights",
                "Hieronymus", "Bosch", 1510);
        List<Exhibition.Painting> paintings = new ArrayList<>();
        paintings.add(painting1);
        paintings.add(painting2);
        paintings.add(painting3);
        paintings.add(painting4);
        paintings.add(painting5);
        paintings.add(painting6);
        paintings.add(painting7);
        return paintings;
    }

    public static List<Exhibition.Painting> getExpectedFindedByAuthrPaintings() {
        Exhibition.Painting painting1 = new Exhibition.Painting("The Last Judgment",
                "Hieronymus", "Bosch", 1500);
        Exhibition.Painting painting7 = new Exhibition.Painting("The Garden of Earthly Delights",
                "Hieronymus", "Bosch", 1510);
        List<Exhibition.Painting> paintings = new ArrayList<>();
        paintings.add(painting1);
        paintings.add(painting7);
        return paintings;
    }
}