
package com.example.recetteappdave;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "SqliteDB";
    private static final int DB_VERSION = 1;

    //var table et params
    public static final String TABLE_NAME = "the_table";
    public static final String COLUMN_ID = "_id";
    public static final String RECETTE_NAME = "";
    public static final String USER_SEARCH = "";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +
            "(" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
            RECETTE_NAME + "TEXT," +
            USER_SEARCH + "TEXT)";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //pas encore data update
    }
}