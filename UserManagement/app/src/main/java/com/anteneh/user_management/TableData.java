package com.anteneh.user_management;

import android.provider.BaseColumns;

public class TableData extends Object {

    public TableData()
    {
    }



    public  static abstract class TableInfo implements BaseColumns
{
    public static final String FIRST_NAME="first_name";
    public static final String SECOND_NAME="second_name";
    public static final String LAST_NAME="last_name";
    public static final String MOBILE="mobile";
    public static final String GENDER="gender";
    public static final String USER_NAME="user_name";
    public static final String EMAIL="email";
    public static final String USER_PASS="user_pass";
    public static final String DATABASE_NAME ="user_info";
    public static final String TABLE_NAME ="reg_info";






}


}