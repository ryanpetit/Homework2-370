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
            // convert json string to a new JSON object.
            JSONArray matches = response.getJSONArray("matches");
            JSONObject recipe = matches.getJSONObject(0);

            JSONArray images = response.getJSONArray("smallImageUrls");
            JSONObject imageUrl = images.getJSONObject(0);

            model = new RecipeModel();
            model.setRecipeName(recipe.getString("recipeName"));
            model.setRecipeImageURL(imageUrl.getString("smallImageUrls"));

        } catch (JSONException e) {
            System.out.println(e);
        }
        return model;
    }
}
