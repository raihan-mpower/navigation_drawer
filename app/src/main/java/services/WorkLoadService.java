package services;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

import DAO.DatabaseHelper;
import DAO.WorkLoadDao;
import model.WorkLoad;

/**
 * Created by cyrus on 12/18/16.
 */
public class WorkLoadService {

    private Context context;
    private DatabaseHelper databaseHelper;
    private WorkLoadDao workLoadDao;

    public WorkLoadService(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
        workLoadDao = new WorkLoadDao();
    }

    public ArrayList<Integer> getWorkLoadData(){
        return workLoadDao.getWorkLoadData();
    }

    public int getHouseHoldVisit(){

        return  workLoadDao.getHouseHoldVisit();
    }

    public int getElegibleCouple(){
        return workLoadDao.getElegibleCouple();
    }

    public int getPregnancyRegister(){
        return workLoadDao.getPregnancyRegister();
    }

    public int getANC(){
        return workLoadDao.getANC();
    }

    public int getPNC(){
        return workLoadDao.getPNC();
    }

    public int getENCC(){
        return workLoadDao.getENCC();
    }
}
