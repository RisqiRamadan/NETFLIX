package com.example.netflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    private ImageButton ibAcc1, ibAcc2, ibAcc3, ibAcc4, ibAcc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ibAcc1 = findViewById(R.id.ibAcc1);
        ibAcc2 = findViewById(R.id.ibAcc2);
        ibAcc3 = findViewById(R.id.ibAcc3);
        ibAcc4 = findViewById(R.id.ibAcc4);
        ibAcc5 = findViewById(R.id.ibAcc5);

        View.OnClickListener accountClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity
                Intent intent = new Intent(AccountActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        ibAcc1.setOnClickListener(accountClickListener);
        ibAcc2.setOnClickListener(accountClickListener);
        ibAcc3.setOnClickListener(accountClickListener);
        ibAcc4.setOnClickListener(accountClickListener);
        ibAcc5.setOnClickListener(accountClickListener);
    }
}
