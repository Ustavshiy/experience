package com.courses.apollo.service;

import com.courses.apollo.model.ArtExhibition;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for some logic for ArtExhibition class - to experiment with it.
 */
public class ArtExhibitionService {

    /**
     * Method that return list of paintings by given author's surname.
     * @param givenAuthorSurname to indicate needed surname.
     * @param paintings to indicate list of paintings on exhibition.
     * @return result - list of found paintings.
     */
    public List<ArtExhibition.Painting> findPaintByAuthr(String givenAuthorSurname,
                                                         List<ArtExhibition.Painting> paintings) {
        List<ArtExhibition.Painting> result = new ArrayList<>();
        for (int i = 0; i < paintings.size(); i++) {
            if (paintings.get(i).getSurname().equals(givenAuthorSurname)) {
                result.add(paintings.get(i));
            }
        }
        return result;
    }
}