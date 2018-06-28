package com.dannextech.apps.insuranceconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BritamApplyMedical extends AppCompatActivity {

    EditText etSurname, etFname, etLname, etGender, etDOB, etOccupation, etEmployer, etIdNo, etNationality, etMaritalStatus,etTitle;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_britam_apply_medical);

        etSurname = findViewById(R.id.etSurname);
        etFname = findViewById(R.id.etFName);
        etLname = findViewById(R.id.etLName);
        etTitle = findViewById(R.id.etTitle);
        etGender = findViewById(R.id.etGender);
        etDOB = findViewById(R.id.etDOB);
        etOccupation = findViewById(R.id.etOccupation);
        etEmployer = findViewById(R.id.etEmpName);
        etIdNo = findViewById(R.id.etIdNo);
        etNationality = findViewById(R.id.etNationality);
        etMaritalStatus = findViewById(R.id.etMaritalStatus);
        btSubmit = findViewById(R.id.btSubmitMember);



        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BritamQueries query = new BritamQueries(getApplicationContext());
                if (query.addMedicalMember(etFname.getText().toString(),etLname.getText().toString(),etSurname.getText().toString(),etDOB.getText().toString(),etTitle.getText().toString(),etGender.getText().toString(),etIdNo.getText().toString(),etMaritalStatus.getText().toString(),etOccupation.getText().toString(),etEmployer.getText().toString(),etNationality.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Member Registered Successfully",Toast.LENGTH_SHORT).show();
                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor edit = preferences.edit();

                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_FNAME,etFname.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_LNAME,etLname.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_SURNAME,etSurname.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_GENDER,etGender.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_DOB,etDOB.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_IDNO,etIdNo.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_OCCUPATION,etOccupation.getText().toString());
                    edit.putString(BritamContractor.BritamMedicalDb.COL_APP_MARITAL_STATUS,etMaritalStatus.getText().toString());

                    edit.apply();


                    startActivity(new Intent(getApplicationContext(), BritamMedicalRegistrationFee.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Something went wrong. Please Try again",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
