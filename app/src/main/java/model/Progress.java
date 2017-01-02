package model;

import android.widget.TextView;

/**
 * Created by cyrus on 12/14/16.
 */
public class Progress {

    private int HH_visit;
    private int eligible_couple;
    private int pregenancy_register;
    private int anc_visit;
    private int pnc_visit;
    private int encc_visit;

    public Progress() {
    }

    public Progress(int encc_visit, int HH_visit, int eligible_couple, int pregenancy_register, int anc_visit, int pnc_visit) {
        this.encc_visit = encc_visit;
        this.HH_visit = HH_visit;
        this.eligible_couple = eligible_couple;
        this.pregenancy_register = pregenancy_register;
        this.anc_visit = anc_visit;
        this.pnc_visit = pnc_visit;
    }

    public int getHH_visit() {
        return HH_visit;
    }

    public void setHH_visit(int HH_visit) {
        this.HH_visit = HH_visit;
    }

    public int getEligible_couple() {
        return eligible_couple;
    }

    public void setEligible_couple(int eligible_couple) {
        this.eligible_couple = eligible_couple;
    }

    public int getPregenancy_register() {
        return pregenancy_register;
    }

    public void setPregenancy_register(int pregenancy_register) {
        this.pregenancy_register = pregenancy_register;
    }

    public int getAnc_visit() {
        return anc_visit;
    }

    public void setAnc_visit(int anc_visit) {
        this.anc_visit = anc_visit;
    }

    public int getPnc_visit() {
        return pnc_visit;
    }

    public void setPnc_visit(int pnc_visit) {
        this.pnc_visit = pnc_visit;
    }

    public int getEncc_visit() {
        return encc_visit;
    }

    public void setEncc_visit(int encc_visit) {
        this.encc_visit = encc_visit;
    }
}
