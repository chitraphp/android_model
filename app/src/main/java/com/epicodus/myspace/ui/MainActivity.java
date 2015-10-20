package com.epicodus.myspace.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.epicodus.myspace.R;

public class MainActivity extends AppCompatActivity {

    private Button mEnrollButton;
    private Button mSponsorsButton;
    private Button mNonProfitPartnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mSponsorsButton = (Button) findViewById(R.id.sponsorsButton);
        mNonProfitPartnerButton = (Button) findViewById(R.id.nonProfitButtton);


        mNonProfitPartnerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NonProfitActivity.class);
                startActivity(intent);

            }
        });

        mSponsorsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(intent);

            }
        });

        mEnrollButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(intent);

            }
        });


    }

}
