package com.courses.apollo;

import com.courses.apollo.model.food.vegetable.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Dell on 15.03.2017.
 */
public class SaladUtilsTestData {

    @Test
    public static ArrayList<Vegetable> getVegetables() {
        Cabbage cabbage = new Cabbage();
        cabbage.setWeight(100);
        cabbage.setCharacteristics(new VegetableCharacteristics(0.11, 4.97, 1.28, 21));
        Broccoli broccoli = new Broccoli();
        broccoli.setWeight(80);
        broccoli.setCharacteristics(new VegetableCharacteristics(0.34, 6.04, 2.57, 31));
        Onion onion = new Onion();
        onion.setWeight(40);
        onion.setCharacteristics(new VegetableCharacteristics(0.13, 16.18, 1.47, 67));
        Tomato tomato = new Tomato();
        tomato.setWeight(85);
        tomato.setCharacteristics(new VegetableCharacteristics(0.25, 4.82, 1.08, 22));
        Cucumber cucumber = new Cucumber();
        cucumber.setWeight(120);
        cucumber.setCharacteristics(new VegetableCharacteristics(0.06, 1.89, 0.34, 8));
        Carrot carrot = new Carrot();
        carrot.setWeight(40);
        carrot.setCharacteristics(new VegetableCharacteristics(0.24, 9.58, 0.93, 41));
        Pepper pepper = new Pepper();
        pepper.setWeight(40);
        pepper.setCharacteristics(new VegetableCharacteristics(0.45, 8.98, 1.48, 39));
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(cabbage);
        vegetables.add(broccoli);
        vegetables.add(onion);
        vegetables.add(tomato);
        vegetables.add(cucumber);
        vegetables.add(carrot);
        vegetables.add(pepper);
        return vegetables;
    }

    @Test
    public static ArrayList<Vegetable> getSortedByWeightVegetables() {
        Cabbage cabbage = new Cabbage();
        cabbage.setWeight(100);
        cabbage.setCharacteristics(new VegetableCharacteristics(0.11, 4.97, 1.28, 21));
        Broccoli broccoli = new Broccoli();
        broccoli.setWeight(80);
        broccoli.setCharacteristics(new VegetableCharacteristics(0.34, 6.04, 2.57, 31));
        Onion onion = new Onion();
        onion.setWeight(40);
        onion.setCharacteristics(new VegetableCharacteristics(0.13, 16.18, 1.47, 67));
        Tomato tomato = new Tomato();
        tomato.setWeight(85);
        tomato.setCharacteristics(new VegetableCharacteristics(0.25, 4.82, 1.08, 22));
        Cucumber cucumber = new Cucumber();
        cucumber.setWeight(120);
        cucumber.setCharacteristics(new VegetableCharacteristics(0.06, 1.89, 0.34, 8));
        Carrot carrot = new Carrot();
        carrot.setWeight(40);
        carrot.setCharacteristics(new VegetableCharacteristics(0.24, 9.58, 0.93, 41));
        Pepper pepper = new Pepper();
        pepper.setWeight(40);
        pepper.setCharacteristics(new VegetableCharacteristics(0.45, 8.98, 1.48, 39));
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(onion);
        vegetables.add(carrot);
        vegetables.add(pepper);
        vegetables.add(broccoli);
        vegetables.add(tomato);
        vegetables.add(cabbage);
        vegetables.add(cucumber);
        return vegetables;
    }

    @Test
    public static ArrayList<Vegetable> getCaloriesDiapasonFinderVegetables() {
        Cabbage cabbage = new Cabbage();
        cabbage.setWeight(100);
        cabbage.setCharacteristics(new VegetableCharacteristics(0.11, 4.97, 1.28, 21));
        Tomato tomato = new Tomato();
        tomato.setWeight(85);
        tomato.setCharacteristics(new VegetableCharacteristics(0.25, 4.82, 1.08, 22));
        Carrot carrot = new Carrot();
        carrot.setWeight(40);
        carrot.setCharacteristics(new VegetableCharacteristics(0.24, 9.58, 0.93, 41));
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(cabbage);
        vegetables.add(tomato);
        vegetables.add(carrot);
        return vegetables;
    }
}