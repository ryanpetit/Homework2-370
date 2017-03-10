package com.example.jeff.homework2_370.network;

import android.os.AsyncTask;

import com.example.jeff.homework2_370.HomeworkApplication;
import com.example.jeff.homework2_370.models.RecipeModel;
import com.example.jeff.homework2_370.utilities.RecipeParser;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class RecipeSearchAsyncTask extends AsyncTask<String, String, RecipeModel> {
    private RecipeCallbackListener recipeCallbackListener;

    @Override
    protected RecipeModel doInBackground(String... params) {

        return null;
    }

    @Override
    protected void onPostExecute(RecipeModel recipeModel) {
        super.onPostExecute(recipeModel);

    }

    public void setRecipeCallbackListener(RecipeCallbackListener recipeCallbackListener) {
        this.recipeCallbackListener = recipeCallbackListener;
    }
}
