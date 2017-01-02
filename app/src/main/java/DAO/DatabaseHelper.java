package DAO;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

import model.Progress;
import model.Report;
import model.WorkLoad;

/**
 * Created by cyrus on 12/14/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    SQLiteDatabase db = null;

    private static int DATABASE_VERSION = 1;
    private static String DB_PATH = "";
    private static String DB_NAME = "plaintext1.db";



    private static String TABLE_NAME = "student";
    private static String KEY_ID = "id";
    private static String KEY_NAME = "name";
    private  static String KEY_CGPA = "cgpa";


    private final Context context;

    public DatabaseHelper(Context context){
        super(context, DB_NAME, null, DATABASE_VERSION);
        this.context = context;
        if(!isDatabaseExists()){
            try {
                copyDatabase();
            } catch (IOException e) {
                Log.d("database", "unable to copy Database");
            }
        }
    }

    // copy your assets db
    private void copyDatabase() throws IOException {
        InputStream is = context.getAssets().open(DatabaseHelper.DB_NAME);
        File databasePath = context.getDatabasePath(DatabaseHelper.DB_NAME);
        if (!databasePath.exists()){
            databasePath.getParentFile().mkdirs();
            databasePath.createNewFile();
        }
        OutputStream os = new FileOutputStream(databasePath);

        byte[] buffer = new byte[1024];
        int sz;
        while ((sz = is.read(buffer)) > 0) {
            os.write(buffer,0,sz);
        }
        os.flush();
        os.close();
        is.close();
    }

    private boolean isDatabaseExists(){
        File databasePath = context.getDatabasePath(DatabaseHelper.DB_NAME);
        return databasePath.exists();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    public WorkLoad findWorkLoad(int id){

        Cursor cursor = db.rawQuery("select * from report where indicator='john'",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        Log.d("cursor",""+ cursor.getString(1));

        return new WorkLoad(new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100);

    }
    public Progress findProgress(int id){

        Cursor cursor = db.rawQuery("select * from household",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        Log.d("cursor",""+cursor.getString(1));

        return new Progress(new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100);
    }
    public Report findReport(int id){

        Cursor cursor = db.rawQuery("select * from household",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        return new Report(new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100,
                new Random().nextInt(200) + 100);
    }

    public String findMonthGraphForWorkLoad(){

        Cursor cursor = db.rawQuery("select * from household",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        return null;
    }

    public String findWeekGraphForWorkLoad(){

        Cursor cursor = db.rawQuery("select * from household",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        return null;
    }

    public String findMonthGraphForProgress(){

        Cursor cursor = db.rawQuery("select * from household",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        return null;
    }

    public String findWeekGraphForProgress(){

        Cursor cursor = db.rawQuery("select * from household",null);
        if(cursor!=null){
            cursor.moveToFirst();
        }

        return null;
    }

    public void openDatabase(){db = this.getReadableDatabase();}
    public void closeDatabase(){
        db.close();
    }
}
