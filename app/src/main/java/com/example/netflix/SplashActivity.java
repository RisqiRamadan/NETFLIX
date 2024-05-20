package com.example.netflix;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Pastikan layout ini sesuai dengan file XML yang telah dibuat

        // Menunggu selama 3 detik sebelum memulai SigninActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, SigninActivity.class);
                startActivity(intent);
                finish(); // Menutup SplashActivity agar tidak kembali saat menekan tombol back
            }
        }, 2000); // 3000 milidetik = 3 detik
    }
}
