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

        String searchParams = params[0];
        OkHttpClient client = new OkHttpClient();
        HttpUrl.Builder urlBuilder =
                HttpUrl.parse(HomeworkApplication.getInstance().getBaseApiUrl()).newBuilder();

        urlBuilder.addQueryParameter("_app_key", HomeworkApplication.getInstance().getApiKey());

        urlBuilder.addQueryParameter("_app_id", HomeworkApplication.getInstance().getAppId());

        urlBuilder.addQueryParameter("your_search_parameters", searchParams);

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder().url(url).build();

        Response response = null;

        try {
            response = client.newCall(request).execute();
            if (response != null){
                return RecipeParser.recipeFromJson(response.body().string());
            }
        }catch (IOException e){
            // do something with exception
        }

        return null;
    }

    @Override
    protected void onPostExecute(RecipeModel recipeModel) {
        super.onPostExecute(recipeModel);
            recipeCallbackListener.onRecipeCallback(recipeModel);
    }

    public void setRecipeCallbackListener(RecipeCallbackListener recipeCallbackListener) {
        this.recipeCallbackListener = recipeCallbackListener;
    }
}
