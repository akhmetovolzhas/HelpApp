package com.example.kiori.helpapplogin2;


import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPageActivity extends AppCompatActivity {

    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail_page);
        com.example.kiori.helpapplogin2.HelpRequest hr = (com.example.kiori.helpapplogin2.HelpRequest)getIntent().getSerializableExtra("HelpRequest");
        final TextView tvTitle = (TextView) findViewById(R.id.Title);
        final TextView tvDesc = (TextView) findViewById(R.id.Desc);
        if(im != null){
            ((BitmapDrawable) im.getDrawable()).getBitmap().recycle();
        }
        im = (ImageView) findViewById(R.id.imageView);

        tvTitle.setText(hr.Title);
        tvDesc.setText(hr.Desc);
        im.setImageResource(hr.image);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9A29AF")));

    }

}
