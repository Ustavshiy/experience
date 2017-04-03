package com.courses.apollo.model;

import com.courses.apollo.model.europe.Europe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.04.2017.
 */
public class EuropeTestData {

    public static List<Europe> getEuropeOne() {
        List<Europe> europeList = new ArrayList<>();
        europeList.add(new Europe(1991, new Europe.Country("Urkaine", "Polsha")));
        return europeList;
    }
}
