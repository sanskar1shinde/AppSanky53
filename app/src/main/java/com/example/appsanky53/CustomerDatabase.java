package com.example.appsanky53;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CustomerDatabase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Customer.db";
    public static final String TABLE_NAME = "customertb";
    public static final String COL_1 = "id";
    public static final String COL_2 = "name";
    public static final String COL_3 = "address";
    public CustomerDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"("+COL_1+" int primary key ,"+COL_2+" text,"+COL_3+" int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(int id,String name,String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,address);
        long result = db.insert(TABLE_NAME,null,contentValues);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

}
