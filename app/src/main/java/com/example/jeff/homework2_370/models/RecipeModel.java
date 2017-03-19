package com.example.jeff.homework2_370.models;


public class RecipeModel
{
    private String recipeName;
    private String recipeImageUrl;
    private String recipeDescription;

    //Getter and setter functions for the recipe name
    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    //Getter and setter functions for the recipie image URL
    public String getRecipeImageUrl() { return recipeImageUrl; }
    public void setRecipeImageUrl(String recipeImageUrl) { this.recipeImageUrl = recipeImageUrl;}

    //Getters and Setters for the Recipe Description
    public String getRecipeDescription() { return recipeDescription; }
    public void setRecipeDescription(String recipeDescription) { this.recipeDescription = recipeDescription; }
}
