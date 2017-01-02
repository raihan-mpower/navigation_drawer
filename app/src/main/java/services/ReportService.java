package services;

import android.content.Context;

import java.util.ArrayList;

import DAO.DatabaseHelper;
import DAO.ReportDao;
import model.Report;

/**
 * Created by cyrus on 12/18/16.
 */
public class ReportService {

    private Context context;
    private DatabaseHelper databaseHelper;
    private ReportDao reportDao;

    public ReportService(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
        reportDao = new ReportDao();
    }

    public ArrayList<Integer> getReportData(){
        return reportDao.getReportData();
    }

    public int getFamilyPlanning(){
        return reportDao.getFamilyPlanning();
    }

    public int getNewBorn(){
        return reportDao.getNewBorn();
    }

    public int getLiveBirth(){
        return reportDao.getLiveBirth();
    }

    public int getStillBirth(){
        return reportDao.getStillBirth();
    }

    public int getMisCarriageOrAbortion(){
        return reportDao.getMisCarriageOrAbortion();
    }

    public int getAtBirth(){
        return reportDao.getAtBirth();
    }

    public int getAtDelivery(){
        return reportDao.getAtDelivery();
    }

}
