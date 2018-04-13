package io.github.andyradionov.exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.github.andyradionov.joker.Joker;
import io.github.andyradionov.jokesandroid.JokesActivity;

public class MainActivity extends AppCompatActivity {

    private Joker mJoker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJoker = new Joker();
    }

    public void showJoke(View view) {
        String joke = mJoker.getJoke();
        Intent startJokeActivity = new Intent(this, JokesActivity.class);
        startJokeActivity.putExtra(JokesActivity.JOKE_EXTRA, joke);
        startActivity(startJokeActivity);
    }
}
