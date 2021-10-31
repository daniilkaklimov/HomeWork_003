package ru.klimov.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_dark);

        findViewById(R.id.settings_dark).setOnClickListener(v -> {
            Intent intent = new Intent(this, settings_dark.class);
            startActivity(intent);
        });
    }
}