package com.udacity.gradle.flavorspecificactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.udacity.gradle.flavorspecificactivity.R;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeView = findViewById(R.id.tv_joke);
        jokeView.setText("JOKE");
    }
}
