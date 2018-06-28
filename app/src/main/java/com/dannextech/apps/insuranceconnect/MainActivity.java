package com.dannextech.apps.insuranceconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cvBritam, cvCIC, cvJubillee, cvAPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvBritam = findViewById(R.id.cvBritam);
        cvCIC = findViewById(R.id.cvCIC);
        cvJubillee = findViewById(R.id.cvJubillee);
        cvAPA = findViewById(R.id.cvAPA);

        cvAPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor edit = preferences.edit();

                edit.putString("insurance","APA");
                edit.apply();
                startActivity(new Intent(getApplicationContext(),ApaHome.class));
            }
        });

        cvBritam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor edit = preferences.edit();

                edit.putString("insurance","Britam");
                edit.apply();
                startActivity(new Intent(getApplicationContext(),BritamHome.class));
            }
        });

        cvJubillee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor edit = preferences.edit();

                edit.putString("insurance","Jubillee");
                edit.apply();
                startActivity(new Intent(getApplicationContext(),JubilleeHome.class));
            }
        });

        cvCIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor edit = preferences.edit();

                edit.putString("insurance","CIC");
                edit.apply();
                startActivity(new Intent(getApplicationContext(),CicHome.class));
            }
        });
    }
}
