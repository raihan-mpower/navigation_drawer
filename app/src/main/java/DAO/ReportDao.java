package DAO;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cyrus on 1/1/17.
 */
public class ReportDao {

    public ArrayList<Integer> getReportData(){
        return null;
    }

    public int getFamilyPlanning(){
        return new Random().nextInt(50);
    }

    public int getNewBorn(){
        return new Random().nextInt(50);
    }

    public int getLiveBirth(){
        return new Random().nextInt(50);
    }

    public int getStillBirth(){
        return new Random().nextInt(50);
    }

    public int getMisCarriageOrAbortion(){
        return new Random().nextInt(50);
    }

    public int getAtBirth(){
        return new Random().nextInt(50);
    }

    public int getAtDelivery(){
        return new Random().nextInt(50);
    }
}
