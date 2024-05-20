package com.example.netflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referensi ke ImageButton
        ImageButton ibFilmDune = findViewById(R.id.ibFilmDune);

        // Set onClick listener
        ibFilmDune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke DetailMovieActivity
                Intent intent = new Intent(MainActivity.this, DetailMovieActivity.class);
                startActivity(intent);
            }
        });
    }
}
