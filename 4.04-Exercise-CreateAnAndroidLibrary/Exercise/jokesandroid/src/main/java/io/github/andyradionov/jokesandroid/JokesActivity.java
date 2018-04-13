package io.github.andyradionov.jokesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent startIntent = getIntent();
        String joke = startIntent.getStringExtra(JOKE_EXTRA);
        if (joke == null) {
            Toast.makeText(this, R.string.no_joke_error, Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        TextView jokeDisplay = findViewById(R.id.tv_joke_view);
        jokeDisplay.setText(joke);
    }
}
