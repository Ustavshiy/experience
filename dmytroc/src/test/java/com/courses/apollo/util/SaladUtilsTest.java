package com.courses.apollo.util;

import com.courses.apollo.SaladUtilsTestData;
import com.courses.apollo.model.food.Salad;
import com.courses.apollo.model.food.vegetable.Vegetable;
import com.courses.apollo.util.foodutils.SaladUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SaladUtilsTest {
    SaladUtils saladUtils = new SaladUtils();
    ArrayList<Vegetable> testVegetables = SaladUtilsTestData.getVegetables();
    Salad testSalad = saladUtils.mixSalad(testVegetables, "olive oil", "basil");

    @Test
    public void mixSaladTest() {
        Salad expectedResult = new Salad();
        expectedResult.setVegetables(testVegetables);
        expectedResult.setSpecies("basil");
        expectedResult.setFillUp("olive oil");
        Assert.assertEquals(expectedResult, testSalad);
    }

    @Test
    public void vegetablesWeightSorterTest() {
        ArrayList<Vegetable> sortedVegetablesTest = saladUtils.vegetablesWeightSorter(testSalad);
        ArrayList<Vegetable> expectedresult = SaladUtilsTestData.getSortedByWeightVegetables();
        Assert.assertEquals(expectedresult, sortedVegetablesTest);
    }

    @Test
    public void caloriesDiapasonFinderTest() {
        ArrayList<Vegetable> sortedVegetablesTest = saladUtils.caloriesDiapazoneFinder(testSalad, 16, 22);
        ArrayList<Vegetable> expectedresult = SaladUtilsTestData.getCaloriesDiapasonFinderVegetables();
        Assert.assertEquals(expectedresult, sortedVegetablesTest);
    }
}
