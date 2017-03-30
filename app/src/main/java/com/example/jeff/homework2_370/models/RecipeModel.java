package com.example.jeff.homework2_370.models;


public class RecipeModel {
    private String recipeName;

    public String getRecipeImageURL() {
        return RecipeImageURL;
    }

    public void setRecipeImageURL(String recipeImageURL) {
        RecipeImageURL = recipeImageURL;
    }

    private String RecipeImageURL;

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    private String recipeDescription;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
}
