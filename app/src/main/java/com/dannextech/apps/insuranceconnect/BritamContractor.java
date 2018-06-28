package com.dannextech.apps.insuranceconnect;

import android.provider.BaseColumns;

public class BritamContractor {
    public BritamContractor() {
    }

    public static class BritamMedicalDb implements BaseColumns{
        //applicants information
        public static final String TABLE_MEMBER = "applicant";

        public static final String COL_APP_SURNAME = "surname";
        public static final String COL_APP_FNAME = "first_name";
        public static final String COL_APP_LNAME = "last_name";
        public static final String COL_APP_TITLE = "title";
        public static final String COL_APP_IDNO = "id_passport";
        public static final String COL_APP_GENDER = "gender";
        public static final String COL_APP_DOB = "dob";
        public static final String COL_APP_MARITAL_STATUS = "marital_status";
        public static final String COL_APP_OCCUPATION = "occupation";
        public static final String COL_APP_EMPLOYER = "employer";
        public static final String COL_APP_NATIONALITY = "nationality";

        //applicants contact information
        public static final String TABLE_CONTACT_INFO = "contacts";

        public static final String COL_POSTAL_ADDRESS = "post_address";
        public static final String COL_HOME_ADDRESS = "home_address";
        public static final String COL_HOME_TELEPHONE = "home_telephone";
        public static final String COL_OFFICE_TELEPHONE = "office_telephone";
        public static final String COL_MOBILE_PHONE = "mobile_number";
        public static final String COL_EMAIL = "email_address";
        public static final String COL_APPLICANT = "applicant";

        //applicants next of kin details
        public static final String TABLE_NEXT_OF_KIN = "next_of_kin";

        public static final String COL_KIN_FULL_NAMES = "full_name";
        public static final String COL_KIN_RELATIONSHIP = "relationship";
        public static final String COL_KIN_IDNO = "id_passport";
        public static final String COL_KIN_TELEPHONE = "telephone_number";
        public static final String COL_KIN_POSTAL_ADDRESS = "postal_address";
        public static final String COL_KIN_EMAIL = "email_address";
        public static final String COL_KIN_APPLICANT = "applicant";

        //applicants beneficiary of personal accident cover and/or last expense cover
        public static final String TABLE_BENEFICIARY = "beneficiary";

        public static final String COL_BEN_FULL_NAMES = "full_name";
        public static final String COL_BEN_RELATIONSHIP = "relationship";
        public static final String COL_BEN_IDNO = "id_passport";
        public static final String COL_BEN_TELEPHONE = "telephone_number";
        public static final String COL_BEN_POSTAL_ADDRESS = "postal_address";
        public static final String COL_BEN_EMAIL = "email_address";
        public static final String COL_BEN_APPLICANT = "applicant";

        //applicants Dependant Details
        public static final String TABLE_DEPENDANT= "dependant";

        public static final String COL_DEP_SURNAME = "surname";
        public static final String COL_DEP_FNAME = "first_name";
        public static final String COL_DEP_LNAME = "last_name";
        public static final String COL_DEP_TITLE = "title";
        public static final String COL_DEP_IDNO = "id_passport";
        public static final String COL_DEP_GENDER = "gender";
        public static final String COL_DEP_DOB = "dob";
        public static final String COL_DEP_MARITAL_STATUS = "marital_status";
        public static final String COL_DEP_OCCUPATION = "occupation";
        public static final String COL_DEP_RELATIONSHIP = "relationship";
        public static final String COL_DEP_APPLICANT = "applicant";
    }
}
