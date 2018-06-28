package com.dannextech.apps.insuranceconnect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BritamMedicalRegistrationFee extends AppCompatActivity {

    Button btMakePayment;

    TextView tvNames, tvDob, tvStatus, tvOcc, tvGender, tvId,tvInsurance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_britam_medical_registration_fee);

        btMakePayment = findViewById(R.id.btMakeMedicalPayment);
        tvNames = findViewById(R.id.tvInsureeName);
        tvDob = findViewById(R.id.tvInsureeDOB);
        tvStatus = findViewById(R.id.tvInsureeMarital);
        tvOcc = findViewById(R.id.tvInsureeOccupation);
        tvGender = findViewById(R.id.tvInsureeGender);
        tvId = findViewById(R.id.tvInsureeID);
        tvInsurance = findViewById(R.id.tvCompany);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

        tvNames.setText(preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_FNAME,"null") + " " + preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_LNAME,"null") + " " + preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_SURNAME,"null"));
        tvDob.setText(preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_DOB,"nul"));
        tvStatus.setText(preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_MARITAL_STATUS,"nul"));
        tvOcc.setText(preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_OCCUPATION,"nul"));
        tvGender.setText(preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_GENDER,"nul"));
        tvId.setText(preferences.getString(BritamContractor.BritamMedicalDb.COL_APP_IDNO,"nul"));
        tvInsurance.setText(preferences.getString("insurance","null"));

        btMakePayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Still to be Implemented",Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
