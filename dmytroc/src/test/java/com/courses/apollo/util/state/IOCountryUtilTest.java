package com.courses.apollo.util.state;

import com.courses.apollo.CountryUtilTestData;
import com.courses.apollo.model.state.Country;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class IOCountryUtilTest {

    Country country;
    CountrySaverLoader countrySaverLoader = new CountrySaverLoader();
    String filename = "./src/main/resources/country/country.dat";

    @Before
    public void Before() {
        country = CountryUtilTestData.getState();
    }

    @Test
    public void getCountryTest() throws ClassNotFoundException, IOException {
        countrySaverLoader.saveCountry(country,filename);
        Country testCountry = countrySaverLoader.loadCountry(filename);
        Assert.assertEquals(country, testCountry);
    }

    @Test(expected = IOException.class)
    public void getCountryExceptionTest() throws ClassNotFoundException, IOException {
        Country testCountry = countrySaverLoader.loadCountry("");
    }

    @Test(expected = IOException.class)
    public void saveCountryExceptionTest() throws IOException {
        countrySaverLoader.saveCountry(country, " ");
    }
}