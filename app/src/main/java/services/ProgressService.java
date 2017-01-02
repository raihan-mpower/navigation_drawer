package services;

import android.content.Context;
import android.content.Intent;

import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

import DAO.DatabaseHelper;
import DAO.ProgressDao;
import model.Progress;

/**
 * Created by cyrus on 12/18/16.
 */
public class ProgressService {

    private Context context;
    private DatabaseHelper databaseHelper;
    private ProgressDao progressDao;

    public ProgressService(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
        progressDao = new ProgressDao();
    }

    public ArrayList<Integer> getProgressData(){
        return progressDao.getProgressData();
    }

    public int getHouseHoldVisit(){
        return  progressDao.getHouseHoldVisit();
    }

    public int getElegibleCouple(){
        return progressDao.getElegibleCouple();
    }

    public int getPregnancyRegister(){
        return progressDao.getPregnancyRegister();
    }

    public int getANC(){
        return progressDao.getANC();
    }

    public int getPNC(){
        return progressDao.getPNC();
    }

    public int getENCC(){
        return progressDao.getENCC();
    }
}
