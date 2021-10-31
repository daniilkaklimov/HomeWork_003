package ru.klimov.homework3;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private CalculatorModel calculator;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_light);

        findViewById(R.id.settings_light).setOnClickListener(v -> {
            Intent intent = new Intent(this, settings_light.class);
            startActivity(intent);
        });

        int[] numberIds = new int[] {
                R.id.button_0,
                R.id.button_1,
                R.id.button_2,
                R.id.button_3,
                R.id.button_4,
                R.id.button_5,
                R.id.button_6,
                R.id.button_7,
                R.id.button_8,
                R.id.button_9
        };

        int[] actionIds = new int[] {
                R.id.button_13, //+
                R.id.button_12, //-
                R.id.button_11, //*
                R.id.button_10, //:
                R.id.button_14
        };

        textView = findViewById(R.id.textView);

        calculator = new CalculatorModel();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    calculator.NumPressed(view.getId());
                    textView.setText(calculator.getText());
            }
        };
        View.OnClickListener actionButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.ActionPressed(view.getId());
                textView.setText(calculator.getText());
            }
        };

        for (int i = 0; i < numberIds.length; i++) {
            findViewById(numberIds[i]).setOnClickListener(numberButtonClickListener);
        }
        for (int i = 0; i < actionIds.length; i++) {
            findViewById(actionIds[i]).setOnClickListener(actionButtonOnClickListener);
        }
    }

    private void startActivity(MainActivity mainActivity, Intent intent) {
    }
}