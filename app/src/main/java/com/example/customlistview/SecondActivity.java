package com.example.customlistview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        flag = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("CountryName"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("Australia")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_australia));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Brazil")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_brazil));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("China")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_china));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("France")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_france));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Germany")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_germany));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("India")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_india));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Ireland")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_ireland));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Italy")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_italy));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Mexico")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_maxico));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Poland")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_poland));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Russia")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_russia));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Spain")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_spain));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("US")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_us));
            }
        }
    }
}
