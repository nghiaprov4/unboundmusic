package com.example.unboundmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView btnplay;
    private ImageView btnpause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnplay = findViewById(R.id.imagePlay);
        btnpause = findViewById(R.id.imagePause);

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isStrartService = new Intent(MainActivity.this,ServiceMyClass.class);
                startService(isStrartService);
            }

        });
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isStopService = new Intent(MainActivity.this,ServiceMyClass.class);
                stopService(isStopService);
            }
        });
    }
}