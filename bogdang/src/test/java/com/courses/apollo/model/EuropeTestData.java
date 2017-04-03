package com.courses.apollo.model;

import com.courses.apollo.model.europe.Europe;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.04.2017.
 */
public class EuropeTestData {

    @Test
    public void getEuropeOne() {
        List<Europe.Country> europeList = new ArrayList<>();
        Europe europe = new Europe(1994, europeList);
        europe.addCountry("Ukrain");
        System.out.println(europe);
    }
}
