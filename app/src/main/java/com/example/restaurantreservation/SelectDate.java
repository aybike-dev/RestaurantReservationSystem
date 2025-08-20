package com.example.restaurantreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;


public class SelectDate extends AppCompatActivity {


    Button selectButton;
    Button btnDateSelect;
    EditText etDate;
    Context context = this;
    Button btnTimeSelect;
    EditText etTime;
    Context context_time = this;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_date);

        selectButton=findViewById(R.id.button_continue);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Select = new Intent(SelectDate.this,SelectTable.class);
                startActivity(Select);
            }
        });
        btnDateSelect = (Button) findViewById(R.id.button_date_select);
        etDate = (EditText) findViewById(R.id.edittext_date);

        btnDateSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar calendar_date = Calendar.getInstance();
                int year_ = calendar_date.get(Calendar.YEAR);
                int month_ = calendar_date.get(Calendar.MONTH);
                int day_ = calendar_date.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog dpd = new DatePickerDialog(context,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                month += 1;
                                etDate.setText(dayOfMonth + "/" + month + "/" + year);
                            }
                        }, year_, month_, day_);
                dpd.setButton(DatePickerDialog.BUTTON_POSITIVE, "Select", dpd);
                dpd.setButton(DatePickerDialog.BUTTON_NEGATIVE, "Cancel", dpd);
                dpd.show();

            }
        });

        btnTimeSelect = (Button) findViewById(R.id.button_time_select);
        etTime = (EditText) findViewById(R.id.edittext_time);

        btnTimeSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar_time = Calendar.getInstance();
                int time = calendar_time.get(Calendar.HOUR_OF_DAY);
                int minute = calendar_time.get(Calendar.MINUTE);

                TimePickerDialog tpd = new TimePickerDialog(context_time,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                etTime.setText(hourOfDay + ":" + minute);
                            }
                        }, time, minute, true);

                tpd.setButton(TimePickerDialog.BUTTON_POSITIVE, "Select", tpd);
                tpd.setButton(TimePickerDialog.BUTTON_NEGATIVE, "Cancel", tpd);
                tpd.show();
            }
        });


    }
}