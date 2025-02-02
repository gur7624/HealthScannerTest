package com.cookandroid.healthscanner.ui.food.datatable;

public class Food {

    private String foodName;
    private float protein, carb, fat, kcal;

    public Food() {
    }

    public Food(String foodName, float protein, float carb, float fat, float kcal) {
        this.foodName = foodName;
        this.protein = protein;
        this.carb = carb;
        this.fat = fat;
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", protein=" + protein +
                ", carb=" + carb +
                ", fat=" + fat +
                ", kcal=" + kcal +
                '}';
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getCarb() {
        return carb;
    }

    public void setCarb(float carb) {
        this.carb = carb;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getKcal() {
        return kcal;
    }

    public void setKcal(float kcal) {
        this.kcal = kcal;
    }
}
