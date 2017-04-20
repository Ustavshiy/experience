package com.courses.apollo.util.state;

import com.courses.apollo.CountryUtilTestData;
import com.courses.apollo.model.state.Country;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class IOCountryUtilTest {

    Country country = CountryUtilTestData.getState();
    CountrySaverLoader countrySaverLoader = new CountrySaverLoader();
    String filename = "./src/main/resources/country/country.dat";

    @Before
    public void Before() throws Exception {
        countrySaverLoader.saveCountry(country, filename);
    }

    @Test
    public void getCountryObjectTest() throws Exception{
        Country testCountry = countrySaverLoader.loadCountry(filename);
        Assert.assertEquals(country, testCountry);
    }

    @Test(expected = Exception.class)
    public void getCountryObjectExceptionTest() throws Exception{
        Country testCountry = countrySaverLoader.loadCountry("");
    }

    @Test(expected = Exception.class)
    public void saveCountryExceptionTest() throws Exception {
        countrySaverLoader.saveCountry(country, "");
    }
}