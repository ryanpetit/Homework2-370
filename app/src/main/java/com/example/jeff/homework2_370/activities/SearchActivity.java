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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }
}
