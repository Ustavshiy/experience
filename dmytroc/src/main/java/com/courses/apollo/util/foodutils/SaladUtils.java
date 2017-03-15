package com.courses.apollo.util.foodutils;

import com.courses.apollo.model.food.Salad;
import com.courses.apollo.model.food.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class made for mixing a Salad from list of Vegetables.
 * It can Find an ingredients in some calories diapason.
 * It can sort ingredients by weight.
 */
public class SaladUtils {

    /**
     * Mixing new salad and add specie and fill-up.
     *
     * @param vegetables list of vegetable ingredients.
     * @param fillUp     String fill-up.
     * @param species    String specie.
     * @return Whole salad.
     */
    public Salad mixSalad(ArrayList<Vegetable> vegetables, String fillUp, String species) {
        Salad salad = new Salad();
        salad.setVegetables(vegetables);
        salad.setFillUp(fillUp);
        salad.setSpecies(species);
        return salad;
    }

    /**
     * Find ingredients that compares to input diapason.
     * by multiplying weight value and calories characteristic of Ingredient
     *
     * @param salad        input Salad object.
     * @param diapasonFrom minimum calories.
     * @param diapasonTo   maximum calories.
     * @return ArrayList of approved ingredients.
     */
    public ArrayList<Vegetable> caloriesDiapazoneFinder(Salad salad, int diapasonFrom, int diapasonTo) {
        final int toGrams = 100;
        ArrayList<Vegetable> caloriesDiapazone = new ArrayList<>();
        for (Vegetable vegetable : salad.getVegetables()) {
            int calories = vegetable.getCharacteristics().getCalories();
            int weight = vegetable.getWeight();
            int totalCalories = calories * weight / toGrams;
            if (diapasonFrom <= totalCalories && totalCalories <= diapasonTo) {
                caloriesDiapazone.add(vegetable);
            }
        }
        return caloriesDiapazone;
    }

    /**
     * Sort ingredients by weight.
     *
     * @param salad input Salad object.
     * @return sorted ArrayList of vegetables.
     */
    public ArrayList<Vegetable> vegetablesWeightSorter(Salad salad) {
        Vegetable[] vegetables = new Vegetable[salad.getVegetables().size()];
        salad.getVegetables().toArray(vegetables);
        Vegetable temp;
        for (int i = 0; i < vegetables.length; i++) {
            for (int j = 1; j < (vegetables.length - i); j++) {
                if (vegetables[j - 1].getWeight() > vegetables[j].getWeight()) {
                    temp = vegetables[j - 1];
                    vegetables[j - 1] = vegetables[j];
                    vegetables[j] = temp;
                }

            }
        }
        ArrayList<Vegetable> vegs = new ArrayList<>(Arrays.asList(vegetables));
        return vegs;
    }
}