package com.dannextech.apps.insuranceconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BritamMedical extends AppCompatActivity {

    Button btApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_britam_medical);

        btApply = findViewById(R.id.btApplyMedical);

        btApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BritamApplyMedical.class));
            }
        });
    }
}
