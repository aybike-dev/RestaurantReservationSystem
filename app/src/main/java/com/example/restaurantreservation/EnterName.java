package com.example.restaurantreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnterName extends AppCompatActivity {

    TextView nameText;
    TextView phoneText;
    Button cancelButton;
    Button reserveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_name);

        nameText = findViewById(R.id.txt_name);
        phoneText = findViewById(R.id.txt_phone);
        cancelButton = findViewById(R.id.button_cancel);
        reserveButton = findViewById(R.id.button_reserve);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel = new Intent(EnterName.this,SelectTable.class);
                startActivity(cancel);
            }
        });


        reserveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent Reserve = new Intent(EnterName.this,LastActivity.class);
        startActivity(Reserve);

        }
        });

            }
}