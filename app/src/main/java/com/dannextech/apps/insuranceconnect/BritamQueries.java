package com.dannextech.apps.insuranceconnect;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BritamQueries {
    Context context;
    BritamHelper helper;
    SQLiteDatabase database;

    public BritamQueries(Context context) {
        this.context = context;
        helper = new BritamHelper(context);
    }

    public boolean addMedicalMember(String fname, String lname, String surname, String dob, String title, String gender,String idNo, String marital_status, String occupation,String employer, String nationality){
        database = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(BritamContractor.BritamMedicalDb.COL_APP_FNAME,fname);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_LNAME,lname);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_SURNAME,surname);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_DOB,dob);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_GENDER,gender);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_TITLE,title);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_IDNO,idNo);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_EMPLOYER,employer);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_MARITAL_STATUS,marital_status);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_OCCUPATION,occupation);
        values.put(BritamContractor.BritamMedicalDb.COL_APP_NATIONALITY,nationality);

        long result = database.insert(BritamContractor.BritamMedicalDb.TABLE_MEMBER,null,values);

        return result==-1?false:true;
    }



}
