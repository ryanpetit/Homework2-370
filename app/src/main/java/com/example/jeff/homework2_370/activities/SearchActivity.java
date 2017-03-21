package com.example.jeff.homework2_370.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jeff.homework2_370.HomeworkApplication;
import com.example.jeff.homework2_370.R;
import com.example.jeff.homework2_370.models.RecipeModel;
import com.example.jeff.homework2_370.network.RecipeCallbackListener;
import com.example.jeff.homework2_370.network.RecipeSearchAsyncTask;

public class SearchActivity extends AppCompatActivity {

    private TextView recipeName;
    private ImageView recipeThumbnail;
    private EditText searchEditText;
    private Button searchButton;
    private RecipeCallbackListener recipeCallbackListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        recipeName = (TextView)findViewById(R.id.recipe_name);
        recipeThumbnail = (ImageView)findViewById(R.id.recipe_thumbnail);
        searchEditText = (EditText)findViewById(R.id.search_edit_text);
        searchButton = (Button)findViewById(R.id.my_search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeCallbackListener = new RecipeCallbackListener() {
                    @Override
                    public void onRecipeCallback(RecipeModel recipeModel) {
                        recipeName.setText(recipeModel.getRecipeName());
                    }
                };
                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                task.setRecipeCallbackListener(recipeCallbackListener);
                task.execute(searchEditText.getText().toString());
            }
        });
    }
}