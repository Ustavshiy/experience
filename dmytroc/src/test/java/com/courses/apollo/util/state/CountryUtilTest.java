package com.courses.apollo.util.state;

import com.courses.apollo.CountryUtilTestData;
import com.courses.apollo.model.state.City;
import com.courses.apollo.model.state.Country;
import com.courses.apollo.util.state.CountryUtils;
import org.junit.Assert;
import org.junit.Test;

public class CountryUtilTest {
    CountryUtils countryUtil = new CountryUtils();
    Country liechtenstein = CountryUtilTestData.getState();

    @Test
    public void getCountryAreaTest() {
        Integer expectedResult = 160474;
        Integer countryArea = countryUtil.getCountryArea(liechtenstein);
        Assert.assertEquals(expectedResult, countryArea);
    }

    @Test
    public void getProvinceAreaTest() {
        Integer expectedResult = 34996;
        Integer provinceAreaTest = countryUtil.getProvinceArea(liechtenstein.getProvinces().get(1));
        Assert.assertEquals(expectedResult, provinceAreaTest);
    }

    @Test
    public void provincesCounterTest() {
        Integer expectedResult = 2;
        Integer provincesCount = countryUtil.provincesCounter(liechtenstein);
        Assert.assertEquals(expectedResult, provincesCount);
    }

    @Test
    public void provinceCenterTest() {
        City expectedResult = CountryUtilTestData.getProvinces().get(1).getProvinceCities().get(3);
        City provinceCenterTest = countryUtil.provinceCenterFinder(CountryUtilTestData.getProvinces().get(1));
        Assert.assertEquals(expectedResult, provinceCenterTest);
    }

    @Test
    public void StateCapital() {
        City expectedResult = liechtenstein.getProvinces().get(0).getProvinceCities().get(1);
        City countryCapitalTest = countryUtil.capitalFinder(liechtenstein);
        Assert.assertEquals(expectedResult, countryCapitalTest);
    }
}