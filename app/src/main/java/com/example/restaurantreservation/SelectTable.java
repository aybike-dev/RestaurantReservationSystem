package com.example.restaurantreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class SelectTable extends AppCompatActivity {

    TextView SelectTable;
    Button Table;
    ImageButton imageTable1;
    ImageButton imageTable2;
    ImageButton imageTable3;
    ImageButton imageTable4;
    ImageButton imageTable5;
    ImageButton imageTable6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_table);

        SelectTable = findViewById(R.id.txt_table);
        Table = findViewById(R.id.button_table);
        imageTable1 = (ImageButton) findViewById(R.id.image_table1);
        imageTable2 = (ImageButton) findViewById(R.id.image_table2);
        imageTable3 = (ImageButton) findViewById(R.id.image_table3);
        imageTable4 = (ImageButton) findViewById(R.id.image_table4);
        imageTable5 = (ImageButton) findViewById(R.id.image_table5);
        imageTable6 = (ImageButton) findViewById(R.id.image_table6);


        Table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Select = new Intent(SelectTable.this,EnterName.class);
                startActivity(Select);

            }
        });

        imageTable1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Table 1 Selected!",Toast.LENGTH_LONG).show();
            }
        });

        imageTable2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Table 2 Selected!",Toast.LENGTH_LONG).show();
            }
        });

        imageTable3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Table 3 Selected!",Toast.LENGTH_LONG).show();
            }
        });

        imageTable4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Table 4 Selected!",Toast.LENGTH_LONG).show();
            }
        });

        imageTable5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Table 5 Selected!",Toast.LENGTH_LONG).show();
            }
        });

        imageTable6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Table 6 Selected!",Toast.LENGTH_LONG).show();
            }
        });




    }
}