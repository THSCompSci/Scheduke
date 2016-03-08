package com.example.green1.pleasedontbreaktest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseTHing extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Debbie.db";
    public static final String TABLE_NAME = "classes";
    public static final String COL_1 ="Classes";
    public static final String COL_2 = "AssignementLists";
    public DatabaseTHing(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + COL_1 + "TEXT,"
                + COL_2 + "TEXT"+ ")";
        db.execSQL(CREATE_USER_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        // Create tables again
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertValues(SQLiteDatabase db, String classses, ArrayList<String> Assignments)
    {
        String ROW1 = "INSERT INTO " + TABLE_NAME + " ("
                + COL_1 + ", " + COL_2 + ") Values ("+classses+","+ Assignments+ ")";
        db.execSQL(ROW1);
    }
}