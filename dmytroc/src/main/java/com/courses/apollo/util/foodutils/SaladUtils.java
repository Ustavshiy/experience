package com.courses.apollo.util.foodutils;

import com.courses.apollo.model.food.Salad;
import com.courses.apollo.model.food.vegetable.Vegetable;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class made for mixing a Salad from list of Vegetables.
 * It can Find an ingredients in some calories diapason.
 * It can sort ingredients by weight.
 */
public class SaladUtils {
    /**
     * Constant Vegetable parameter / TO_GRAMS.
     */
    static final int TO_GRAMS = 100;

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
    public List<Vegetable> caloriesDiapasonFinder(Salad salad, int diapasonFrom, int diapasonTo) {
        return salad.getVegetables().stream()
                .filter(vegetable -> diapasonFrom <= getTotalCalories(vegetable))
                .filter(vegetable -> getTotalCalories(vegetable) <= diapasonTo).collect(Collectors.toList());
    }

    private int getTotalCalories(Vegetable vegetable) {
        return vegetable.getCharacteristics().getCalories() * vegetable.getWeight() / TO_GRAMS;
    }

    /**
     * Sort ingredients by weight.
     *
     * @param salad input Salad object.
     * @return sorted ArrayList of vegetables.
     */
    public List<Vegetable> vegetablesWeightSorter(Salad salad) {
        salad.getVegetables().sort(Comparator.comparing(Vegetable::getWeight));
        return salad.getVegetables();
    }
}