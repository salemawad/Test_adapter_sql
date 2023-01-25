package com.salem.myapplication.satabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.salem.myapplication.model.Student;

public class DatabaseAdapter extends SQLiteOpenHelper {

    SQLiteDatabase database;

    public DatabaseAdapter(@Nullable Context context) {
        super(context, "name", null, 1);
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Student.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + Student.NAME);
        onCreate(db);
    }

    public boolean insertStudent(String name , String image) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Student.NAME, name);
        contentValues.put(Student.IMAGE , image);
        return database.insert(Student.NAME, null, contentValues) > 0;
    }


}
