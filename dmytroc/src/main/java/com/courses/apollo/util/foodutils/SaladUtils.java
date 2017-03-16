package com.courses.apollo.util.foodutils;

import com.courses.apollo.model.food.Salad;
import com.courses.apollo.model.food.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.List;

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
    public Salad mixSalad(List<Vegetable> vegetables, String fillUp, String species) {
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
    public List<Vegetable> caloriesDiapazoneFinder(Salad salad, int diapasonFrom, int diapasonTo) {
        final int toGrams = 100;
        List<Vegetable> caloriesDiapason = new ArrayList<>();
        for (Vegetable vegetable : salad.getVegetables()) {
            int calories = vegetable.getCharacteristics().getCalories();
            int weight = vegetable.getWeight();
            int totalCalories = calories * weight / toGrams;
            if (diapasonFrom <= totalCalories && totalCalories <= diapasonTo) {
                caloriesDiapason.add(vegetable);
            }
        }
        return caloriesDiapason;
    }

    /**
     * Sort ingredients by weight.
     *
     * @param salad input Salad object.
     * @return sorted ArrayList of vegetables.
     */
    public List<Vegetable> vegetablesWeightSorter(Salad salad) {
        List<Vegetable> vegetables = salad.getVegetables();
        Vegetable temp;
        for (int i = 0; i < vegetables.size(); i++) {
            for (int j = 1; j < (vegetables.size() - i); j++) {
                if (vegetables.get(j - 1).getWeight() > vegetables.get(j).getWeight()) {
                    temp = vegetables.get(j - 1);
                    vegetables.set(j - 1, vegetables.get(j));
                    vegetables.set(j, temp);
                }

            }
        }
        return vegetables;
    }
}