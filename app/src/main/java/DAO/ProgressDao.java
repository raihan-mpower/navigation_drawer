package DAO;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cyrus on 1/1/17.
 */
public class ProgressDao {


    public ArrayList<Integer> getProgressData(){
        return null;
    }

    public int getHouseHoldVisit(){
        return new Random().nextInt(50);
    }

    public int getElegibleCouple(){
        return new Random().nextInt(50);
    }

    public int getPregnancyRegister(){
        return new Random().nextInt(50);
    }

    public int getANC(){
        return new Random().nextInt(50);
    }

    public int getPNC(){
        return new Random().nextInt(50);
    }

    public int getENCC(){
        return new Random().nextInt(50);
    }

}
