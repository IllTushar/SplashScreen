package com.example.splashscreen;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Intent intent = new Intent(screen.this,MainActivity.class);
                    startActivity(intent);
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });
        thread.start();
    }
}