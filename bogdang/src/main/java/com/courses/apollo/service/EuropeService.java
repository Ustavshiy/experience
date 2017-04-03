package com.courses.apollo.service;

import com.courses.apollo.model.europe.Europe;
import import java.util.List;

import java.util.ArrayList;

/**
 * Europe service class.
 */
public class EuropeService {

    /**
     * Territorial division of Europe in the required year.
     * @param year required year.
     * @param europeList history of division of Europe.
     * @return result - desired division.
     */
    public List<Europe.Country> territorialDivision( Integer year, List<Europe> europeList) {
        List<Europe.Country> result = new ArrayList<>();
        for (int i = 0; i < europeList.size() ; i++) {
            Integer findYear = europeList.get(i).getYear();
            if (year == findYear) {
                result = europeList.get(i).getCountries();
            }
        }
        return result;
    }
}
