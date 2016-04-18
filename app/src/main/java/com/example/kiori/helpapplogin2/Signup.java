package com.example.kiori.helpapplogin2;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Signup extends AppCompatActivity implements View.OnClickListener {
    Button date;
    Button signup1;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);
        showDialogonbuttonclick();


        //getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        signup1 = (Button) findViewById(R.id.signup1);
        signup1.setOnClickListener(this);


//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9A29AF")));
    }

    public void showDialogonbuttonclick() {
        date = (Button) findViewById(R.id.date);
        date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showDialog(DIALOG_ID);

                    }
                });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID)
            return new DatePickerDialog(this, dpickerListener, year_x, month_x, day_x);
        return null;

    }

    private DatePickerDialog.OnDateSetListener dpickerListener
            = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthofYear, int dayofMonth) {
            year_x = year;
            month_x = monthofYear + 1;
            day_x = dayofMonth;
            Button date = (Button) findViewById(R.id.date);
            date.setText(year_x + "/" + month_x + "/" + day_x);
        }
    };

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signup1:
                startActivity(new Intent("MAIN3"));
                break;
        }
    }
};
