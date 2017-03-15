package com.courses.apollo.model.food.vegetable;

import java.util.Objects;

/**
 * Class Vegetable Characteristics
 * for characteristics about amount of fat, carbohydrate, protein and calories in 100 grams.
 */
public class VegetableCharacteristics {

    /**
     * fat value.
     */
    private Double fat;
    /**
     * carbohydrate value.
     */
    private Double carbs;
    /**
     * protein value.
     */
    private Double protein;
    /**
     * calories value.
     */
    private Integer calories;

    public VegetableCharacteristics() {
    }

    public VegetableCharacteristics(Double fat, Double carbs, Double protein, Integer calories) {
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
        this.calories = calories;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VegetableCharacteristics that = (VegetableCharacteristics) o;
        return Objects.equals(fat, that.fat)
                && Objects.equals(carbs, that.carbs)
                && Objects.equals(protein, that.protein)
                && Objects.equals(calories, that.calories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fat, carbs, protein, calories);
    }
}