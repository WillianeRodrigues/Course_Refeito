package br.com.usp.willianerodrigues.course.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DbCore extends SQLiteOpenHelper {

    private static final String DB_NAME = "courseDB";
    private static final int DB_VERSION = 1;

    private DbCode dbCode;

    DbCore(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        dbCode = new DbCode();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        for (String s : dbCode.createTables()) {
            db.execSQL("CREATE TABLE " + s);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE usuario");
        db.execSQL("DROP TABLE ranking");
        db.execSQL("DROP TABLE pergunta");
        db.execSQL("DROP TABLE resposta");
        onCreate(db);
    }
}
