package com.courses.apollo.service;

import com.courses.apollo.model.europe.Europe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public List<Europe.Country> territorialDivision(Integer year, List<Europe> europeList) {
        LocalDate resultYaer = LocalDate.of(year, 01, 01);
        List<Europe.Country> result = new ArrayList<>();
        for (int i = 0; i < europeList.size(); i++) {
            LocalDate findYear = europeList.get(i).getYear();
            if (resultYaer.equals(findYear)) {
                result = europeList.get(i).getCountries();
            }
        }
        return result;
    }
}
