package com.courses.apollo.service;

import com.courses.apollo.model.europe.Europe;

import java.util.ArrayList;
import java.util.List;

/**
 * Europe service class.
 */
public final class EuropeService {

    private EuropeService() {

    }
    /**
     * Territorial division of Europe in the required year.
     * @param year required year.
     * @param europeList history of division of Europe.
     * @return result - desired division.
     */

    public static List<Europe.Country> territorialDivision(Integer year, List<Europe> europeList) {
        List<Europe.Country> result = new ArrayList<>();
        for (int i = 0; i < europeList.size(); i++) {
            Integer findYear = europeList.get(i).getYear();
            if (year.equals(findYear)) {
                result = europeList.get(i).getCountries();
            }
        }
        return result;
    }
}
