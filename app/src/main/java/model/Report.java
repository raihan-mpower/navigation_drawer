package model;

/**
 * Created by cyrus on 12/14/16.
 */
public class Report {
    //services
    private int family_planning;
    private int new_born;

    //pregnancy outcome
    private int live_birth;
    private int still_birth;
    private int misCarriageOrAbortion;

    //Mortality
    private int at_birth;
    private int at_delivery;

    public Report() {
    }

    public Report(int family_planning, int new_born, int live_birth, int still_birth, int misCarriageOrAbortion, int at_birth, int at_delivery) {
        this.family_planning = family_planning;
        this.new_born = new_born;
        this.live_birth = live_birth;
        this.still_birth = still_birth;
        this.misCarriageOrAbortion = misCarriageOrAbortion;
        this.at_birth = at_birth;
        this.at_delivery = at_delivery;
    }

    public int getFamily_planning() {
        return family_planning;
    }

    public void setFamily_planning(int family_planning) {
        this.family_planning = family_planning;
    }

    public int getAt_delivery() {
        return at_delivery;
    }

    public void setAt_delivery(int at_delivery) {
        this.at_delivery = at_delivery;
    }

    public int getAt_birth() {
        return at_birth;
    }

    public void setAt_birth(int at_birth) {
        this.at_birth = at_birth;
    }

    public int getStill_birth() {
        return still_birth;
    }

    public void setStill_birth(int still_birth) {
        this.still_birth = still_birth;
    }

    public int getNew_born() {
        return new_born;
    }

    public void setNew_born(int new_born) {
        this.new_born = new_born;
    }

    public int getLive_birth() {
        return live_birth;
    }

    public void setLive_birth(int live_birth) {
        this.live_birth = live_birth;
    }

    public int getMisCarriageOrAbortion() {
        return misCarriageOrAbortion;
    }

    public void setMisCarriageOrAbortion(int misCarriageOrAbortion) {
        this.misCarriageOrAbortion = misCarriageOrAbortion;
    }
}
