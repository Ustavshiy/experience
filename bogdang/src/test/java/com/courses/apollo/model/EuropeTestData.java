package com.courses.apollo.model;

import com.courses.apollo.model.europe.Europe;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.04.2017.
 */
public class EuropeTestData {

    public static List<Europe> getEurope() {
        List<Europe> europeHistory = new ArrayList<>();
        List<Europe.Country> europeList = new ArrayList<>();
        Europe europe = new Europe(1994, europeList);
        europe.addCountry("Ukraine");
        europe.addCountry("Poland");
        europe.addCountry("Spain");
        europe.addCountry("Portugal");
        europe.addCountry("Italy");
        europeHistory.add(europe);
        List<Europe.Country> europeListOne = new ArrayList<>();
        Europe europeOne = new Europe(1954, europeListOne);
        europeOne.addCountry("Sweden");
        europeOne.addCountry("Lithuania");
        europeOne.addCountry("Austria");
       europeHistory.add(europeOne);
        List<Europe.Country> europeListTwo = new ArrayList<>();
        Europe europeTwo = new Europe(1837, europeListTwo);
        europeTwo.addCountry("Spain");
        europeTwo.addCountry("Italy");
        europeTwo.addCountry("France");
        europeTwo.addCountry("Germany");
        europeTwo.addCountry("Norway");
        europeHistory.add(europeTwo);
        return europeHistory;
    }

    public static List<Europe.Country> getCountry() {
        List<Europe.Country> europeList = new ArrayList<>();
        Europe europeOne = new Europe(1954, europeList);
        europeOne.addCountry("Sweden");
        europeOne.addCountry("Lithuania");
        europeOne.addCountry("Austria");
        return  europeList;
    }
}
