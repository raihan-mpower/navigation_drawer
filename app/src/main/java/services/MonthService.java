package services;

import android.content.Context;
import android.content.Intent;

import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

import DAO.DatabaseHelper;
import model.Progress;

/**
 * Created by cyrus on 12/18/16.
 */
public class MonthService {

    private Context context;
    private DatabaseHelper databaseHelper;

    public MonthService(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
    }

    public ArrayList<Integer> getWorkLoadHouseHoldVisit(){
        return null;
    }

    public ArrayList<Integer> getWorkLoadElegibleCouble(){
        return  null;
    }

    public ArrayList<Integer> getWorkLoadPregnancyWoman(){
        return null;
    }

    public ArrayList<Integer> getProgressHouseHoldVisit(){
        return null;
    }

    public ArrayList<Integer> getProgressElegibleCouble(){
        return  null;
    }

    public ArrayList<Integer> getProgressPregnancyWoman(){
        return null;
    }
}
