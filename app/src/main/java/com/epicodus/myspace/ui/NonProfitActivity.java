package com.epicodus.myspace.ui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.epicodus.myspace.R;

public class NonProfitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        TextView nameLabel = (TextView) findViewById(R.id.nameLabel);
        Typeface fontSparkly = Typeface.createFromAsset(getAssets(), "fonts/sparkly.ttf");
        nameLabel.setTypeface(fontSparkly);
    }




}
