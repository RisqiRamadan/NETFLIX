package com.example.netflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private ImageButton ibSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        ibSignin = findViewById(R.id.ibSignin);

        ibSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input from EditTexts
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();


                Intent intent = new Intent(SigninActivity.this, AccountActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
