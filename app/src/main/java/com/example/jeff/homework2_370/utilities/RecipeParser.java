package com.example.jeff.homework2_370.utilities;


import com.example.jeff.homework2_370.models.RecipeModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecipeParser {
    public static final RecipeModel recipeFromJson(String jsonString) {
        RecipeModel model = null;
        try {
            JSONObject response = new JSONObject(jsonString);
            JSONArray matches = response.getJSONArray("matches");
            JSONObject recipe = matches.getJSONObject(0);
            JSONArray smallImagesUrls = recipe.getJSONArray("smallImageUrls");
            String recipeImageUrl = smallImagesUrls.toString(0);

            model = new RecipeModel();
            model.setRecipeName(recipe.getString("recipeName"));
        } catch (JSONException e) {
            // do something useful with exception
        }
        return model;
    }
}
