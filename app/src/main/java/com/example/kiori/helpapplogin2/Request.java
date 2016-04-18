package com.example.kiori.helpapplogin2;


import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;

public class Request extends AppCompatActivity implements View.OnClickListener{
    Button Sendrequest;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9A29AF")));
        setContentView(R.layout.activity_request);
        Sendrequest = (Button) findViewById(R.id.SendRequest);
        Sendrequest.setOnClickListener(this);

        ColorStateList colorStateList = new ColorStateList(
                new int[][]{

                        new int[]{-android.R.attr.state_enabled}, //disabled
                        new int[]{android.R.attr.state_enabled} //enabled
                },
                new int[] {

                        Color.BLACK //disabled
                        ,Color.BLUE //enabled

                }
        );

        //RadioButton radio = (RadioButton) findViewById(R.id.radio_red);

//        radio.setButtonTintList(colorStateList);//set the color tint list
//        radio.invalidate(); //could not be necessary
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.SendRequest:
                startActivity(new Intent("MAIN3"));
                break;
        }
    }
}
