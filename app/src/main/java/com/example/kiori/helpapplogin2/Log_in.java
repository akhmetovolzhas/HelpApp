package com.example.kiori.helpapplogin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;

public class Log_in extends AppCompatActivity implements View.OnClickListener
{

    Button login;
    Button signup;
    Button aboutus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
//        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_log_in);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(this);
        aboutus = (Button) findViewById(R.id.aboutus);
        aboutus.setOnClickListener(this);

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signup:
                startActivity(new Intent("MAIN2"));
                break;
        }


        switch (v.getId()) {
            case R.id.login:
                startActivity(new Intent("MAIN3"));
                break;
        }
        switch (v.getId()) {
            case R.id.aboutus:
                startActivity(new Intent("AboutusActivity"));
                break;
        }
    }
}




