package com.courses.apollo;

import com.courses.apollo.model.food.vegetable.*;

import java.util.ArrayList;
import java.util.List;

public class SaladUtilsTestData {

    public static List<Vegetable> getVegetables() {
        Cabbage cabbage = new Cabbage();
        cabbage.setWeight(100);
        cabbage.setCharacteristics(new FoodInfo(0.11, 4.97, 1.28, 21));
        Cucumber cucumber = new Cucumber();
        cucumber.setWeight(120);
        cucumber.setCharacteristics(new FoodInfo(0.06, 1.89, 0.34, 8));
        Carrot carrot = new Carrot();
        carrot.setWeight(40);
        carrot.setCharacteristics(new FoodInfo(0.24, 9.58, 0.93, 41));
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(cabbage);
        vegetables.add(cucumber);
        vegetables.add(carrot);
        return vegetables;
    }

    public static List<Vegetable> getSortedByWeightVegetables() {
        Cabbage cabbage = new Cabbage();
        cabbage.setWeight(100);
        cabbage.setCharacteristics(new FoodInfo(0.11, 4.97, 1.28, 21));
        Cucumber cucumber = new Cucumber();
        cucumber.setWeight(120);
        cucumber.setCharacteristics(new FoodInfo(0.06, 1.89, 0.34, 8));
        Carrot carrot = new Carrot();
        carrot.setWeight(40);
        carrot.setCharacteristics(new FoodInfo(0.24, 9.58, 0.93, 41));
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(carrot);
        vegetables.add(cabbage);
        vegetables.add(cucumber);
        return vegetables;
    }

    public static List<Vegetable> getCaloriesDiapasonFinderVegetables() {
        Cabbage cabbage = new Cabbage();
        cabbage.setWeight(100);
        cabbage.setCharacteristics(new FoodInfo(0.11, 4.97, 1.28, 21));
        Carrot carrot = new Carrot();
        carrot.setWeight(40);
        carrot.setCharacteristics(new FoodInfo(0.24, 9.58, 0.93, 41));
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(cabbage);
        vegetables.add(carrot);
        return vegetables;
    }
}