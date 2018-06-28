package com.dannextech.apps.insuranceconnect;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BritamHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "insurance_connect";
    public static final int DATABASE_VERSION = 1;

    public static final String CREATE_TABLE_MEMBER = "CREATE TABLE " +
            BritamContractor.BritamMedicalDb.TABLE_MEMBER + " ( " +
            BritamContractor.BritamMedicalDb.COL_APP_FNAME + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_DOB + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_EMPLOYER + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_GENDER + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_IDNO + " TEXT PRIMARY KEY, " +
            BritamContractor.BritamMedicalDb.COL_APP_LNAME + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_MARITAL_STATUS + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_NATIONALITY + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_OCCUPATION + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_SURNAME + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APP_TITLE + " TEXT)";

    public static final String CREATE_TABLE_CONTANCT_INFO = "CREATE TABLE " +
            BritamContractor.BritamMedicalDb.TABLE_CONTACT_INFO + " ( " +
            BritamContractor.BritamMedicalDb.COL_POSTAL_ADDRESS + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_MOBILE_PHONE + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_HOME_ADDRESS + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_HOME_TELEPHONE + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_OFFICE_TELEPHONE + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_EMAIL + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_APPLICANT + " TEXT PRIMARY KEY, " +
            "FOREIGN KEY (" + BritamContractor.BritamMedicalDb.COL_APPLICANT + ") REFERENCES "+
            BritamContractor.BritamMedicalDb.TABLE_MEMBER+"("+BritamContractor.BritamMedicalDb.COL_APP_IDNO+"))";

    public static final String CREATE_TABLE_NEXT_OF_KIN = "CREATE TABLE " +
            BritamContractor.BritamMedicalDb.TABLE_NEXT_OF_KIN + " ( " +
            BritamContractor.BritamMedicalDb.COL_KIN_APPLICANT + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_KIN_EMAIL + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_KIN_FULL_NAMES + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_KIN_IDNO + " TEXT PRIMARY KEY, " +
            BritamContractor.BritamMedicalDb.COL_KIN_POSTAL_ADDRESS + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_KIN_RELATIONSHIP + " TEXT, " +
            BritamContractor.BritamMedicalDb.COL_KIN_TELEPHONE + " TEXT, " +
            "FOREIGN KEY (" + BritamContractor.BritamMedicalDb.COL_KIN_APPLICANT + ") REFERENCES "+
            BritamContractor.BritamMedicalDb.TABLE_MEMBER+"("+BritamContractor.BritamMedicalDb.COL_APP_IDNO+"))";


    public static final String DROP_TABLE_MEMBER = "DROP TABLE IF EXISTS " + BritamContractor.BritamMedicalDb.TABLE_MEMBER;
    public static final String DROP_TABLE_CONTACT_INFO = "DROP TABLE IF EXISTS " + BritamContractor.BritamMedicalDb.TABLE_CONTACT_INFO;
    public static final String DROP_TABLE_NEXT_OF_KIN = "DROP TABLE IF EXISTS " + BritamContractor.BritamMedicalDb.TABLE_NEXT_OF_KIN;

    public BritamHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_MEMBER);
        db.execSQL(CREATE_TABLE_CONTANCT_INFO);
        db.execSQL(CREATE_TABLE_NEXT_OF_KIN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE_NEXT_OF_KIN);
        db.execSQL(DROP_TABLE_CONTACT_INFO);
        db.execSQL(DROP_TABLE_MEMBER);

        onCreate(db);
    }
}
