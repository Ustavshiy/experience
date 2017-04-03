package com.courses.apollo.service;

import com.courses.apollo.model.europe.Europe;
import com.sun.tools.javac.util.List;

import java.util.ArrayList;

/**
 * Created by Богдан on 03.04.2017.
 */
public class EuropeService {
    public List<Europe> territorialDivision( Integer year, List<Europe> europeList) {
        //Europe.Country result = new Europe().new Country();
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
