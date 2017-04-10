package com.courses.apollo.service;

import com.courses.apollo.model.Exhibition;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for some logic for Exhibition class - to experiment with it.
 */
public class ExhibitionService {

    /**
     * Method that return list of paintings by given author's surname.
     * @param givenAuthorSurname to indicate needed surname.
     * @param paintings to indicate list of paintings on exhibition.
     * @return result - list of found paintings.
     */
    public List<Exhibition.Painting> findPaintByAuthr(String givenAuthorSurname,
                                                      List<Exhibition.Painting> paintings) {
        List<Exhibition.Painting> result = new ArrayList<>();
        for (int i = 0; i < paintings.size(); i++) {
            if (paintings.get(i).getSurname().equals(givenAuthorSurname)) {
                result.add(paintings.get(i));
            }
        }
        return result;
    }
}