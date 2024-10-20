package com.tweak.toasts;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button byDef, simGrav, nesGrav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byDef = findViewById(R.id.Default);
        simGrav = findViewById(R.id.Simple);
        nesGrav = findViewById(R.id.Nested);

        // Default Toast
        byDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "By Default Toast", Toast.LENGTH_SHORT).show();
            }
        });

        // Toast with center gravity
        simGrav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Simple Gravity Toast", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);  // Center the Toast
                toast.show();
            }
        });

        // Toast with bottom-end gravity
        nesGrav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Nested Gravity", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.END, 0, 0);  // Bottom-End gravity
                toast.show();
            }
        });

    }
}
