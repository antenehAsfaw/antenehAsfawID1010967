package com.anteneh.user_management;



public class TableModel  {
    public TableModel(String FIRST_NAME, String SECOND_NAME, String LAST_NAME, String MOBILE, String GENDER, String USER_NAME, String EMAIL, String USER_PASS) {
        this.FIRST_NAME = FIRST_NAME;
        this.SECOND_NAME = SECOND_NAME;
        this.LAST_NAME = LAST_NAME;
        this.MOBILE = MOBILE;
        this.GENDER = GENDER;
        this.USER_NAME = USER_NAME;
        this.EMAIL = EMAIL;
        this.USER_PASS = USER_PASS;
    }

    private String FIRST_NAME;
    private String SECOND_NAME;
    private String LAST_NAME;
    private String MOBILE;

    private String GENDER;
    private String USER_NAME;
    private String EMAIL;
    private String USER_PASS;

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getUSER_PASS() {
        return USER_PASS;
    }

    public void setUSER_PASS(String USER_PASS) {
        this.USER_PASS = USER_PASS;
    }





    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getSECOND_NAME() {
        return SECOND_NAME;
    }

    public void setSECOND_NAME(String SECOND_NAME) {
        this.SECOND_NAME = SECOND_NAME;
    }
}
