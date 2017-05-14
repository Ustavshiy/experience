package com.courses.apollo.util.state;

import com.courses.apollo.CountryUtilTestData;
import com.courses.apollo.exception.CountryIOException;
import com.courses.apollo.model.state.Country;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class IOCountryUtilTest {

    Country country;
    CountrySaverLoader countrySaverLoader = new CountrySaverLoader();
    static String folderPath = "./src/main/resources/country";
    File dir = new File(folderPath);
    String filename = folderPath + "/country.dat";

    @Before
    public void Before() {
        country = CountryUtilTestData.getState();
        dir.mkdir();
    }

    @Test
    public void getCountryTest() throws CountryIOException {
        countrySaverLoader.saveCountry(country, filename);
        Country testCountry = countrySaverLoader.loadCountry(filename);
        Assert.assertEquals(country, testCountry);
    }

    @Test(expected = CountryIOException.class)
    public void getCountryExceptionTest() throws CountryIOException {
        Country testCountry = countrySaverLoader.loadCountry("");
    }

    @Test(expected = CountryIOException.class)
    public void saveCountryExceptionTest() throws CountryIOException {
        countrySaverLoader.saveCountry(country, "./src/main/resources/");
    }

    @AfterClass
    public static void clean() {
        File dir = new File(folderPath);
        for (File file : dir.listFiles()) {
            file.delete();
        }
        dir.delete();
    }
}