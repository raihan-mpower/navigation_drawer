package services;

import android.content.Context;

import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

import DAO.DatabaseHelper;
import model.Progress;

/**
 * Created by cyrus on 12/18/16.
 */
public class WeekService {

    private Context context;
    private DatabaseHelper databaseHelper;

    public WeekService(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
    }

    public Progress findProgress(int id){
        databaseHelper.openDatabase();
        Progress progress = databaseHelper.findProgress(id);
        databaseHelper.closeDatabase();
        return progress;
    }

    public String findWeekGraph(){
        databaseHelper.openDatabase();
        databaseHelper.findWeekGraphForProgress();
        databaseHelper.closeDatabase();
        return null;
    }

    public ArrayList<BarEntry> findMonthGraph(){
        databaseHelper.openDatabase();
        databaseHelper.findMonthGraphForProgress();
        databaseHelper.closeDatabase();
        return null;
    }
}
