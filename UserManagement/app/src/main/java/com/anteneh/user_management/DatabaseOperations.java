package com.anteneh.user_management;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;


public  class DatabaseOperations extends SQLiteOpenHelper {
    public static final int database_version=1;
    public String CREATE_QUERY=" CREATE TABLE "+ TableData.TableInfo.TABLE_NAME +
            "("+TableData.TableInfo.FIRST_NAME+" TEXT,"+

            TableData.TableInfo.SECOND_NAME+" TEXT,"+

            TableData.TableInfo.LAST_NAME +" TEXT,"+

            TableData.TableInfo.MOBILE+" TEXT,"+

            TableData.TableInfo.GENDER+" TEXT,"+

            TableData.TableInfo.USER_NAME+" TEXT,"+

            TableData.TableInfo.EMAIL+" TEXT,"+

            TableData.TableInfo.USER_PASS+" TEXT);";


    public DatabaseOperations(Context context) {
        super(context, TableData.TableInfo.DATABASE_NAME,
                null,database_version);
        Log.d("Database operations","Database created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb) {
             sdb.execSQL(CREATE_QUERY);
             Log.d("Database operations", "Table created ");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
    public void putInformation(DatabaseOperations dop,String fn,String sn,
                               String ln,String pn,String gender,
                               String username,String email,String pass)

    {
        SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(TableData.TableInfo.FIRST_NAME,fn);
        cv.put(TableData.TableInfo.SECOND_NAME,sn);
        cv.put(TableData.TableInfo.LAST_NAME,ln);
        cv.put(TableData.TableInfo.MOBILE,pn);
        cv.put(TableData.TableInfo.GENDER,gender);
        cv.put(TableData.TableInfo.USER_NAME,username);
        cv.put(TableData.TableInfo.EMAIL,email);
        cv.put(TableData.TableInfo.USER_PASS,pass);

        long k = SQ.insert(TableData.TableInfo.TABLE_NAME,null,cv);
        System.out.println("yes it works"+k);
        Log.d("Database operation","one raw inserted");
    }

    public List   getAllUsers() {
          List users = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TableData.TableInfo.TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

            while (cursor.moveToNext()) {
                TableModel u = new TableModel(cursor.getString(0),cursor.getString(1),
                        cursor.getString(2), cursor.getString(3), cursor.getString(4),
                        cursor.getString(5), cursor.getString(6), cursor.getString(7));

                users.add(u);
            }
            cursor.close();



        return users ;
    }
}


