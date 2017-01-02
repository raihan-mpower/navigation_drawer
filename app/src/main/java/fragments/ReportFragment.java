package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sam.navdrawerlockedplease.R;

import services.ReportService;
import model.Report;

/**
 * Created by cyrus on 12/12/16.
 */
public class ReportFragment extends Fragment {

    private ReportService reportService;

    private TextView familyPlanning;
    private TextView child;
    private TextView liveBirth;
    private TextView stillBirth;
    private TextView abortionORmiscarrige;
    private TextView atBirth;
    private TextView atDelivery;

    public ReportFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.report, container, false);
        init(view);
        setValue();
        return  view;
    }

    private void init(View view){
        reportService = new ReportService(getActivity().getApplicationContext());
        familyPlanning = (TextView) view.findViewById(R.id.familyPlanning);
        child = (TextView) view.findViewById(R.id.child);
        liveBirth = (TextView) view.findViewById(R.id.liveBirth);
        stillBirth = (TextView) view.findViewById(R.id.stillBirth);
        abortionORmiscarrige = (TextView) view.findViewById(R.id.abortionORmiscarrige);
        atBirth = (TextView) view.findViewById(R.id.atBirth);
        atDelivery = (TextView) view.findViewById(R.id.atDelivery);
    }

    private void setValue(){
        familyPlanning.setText("" + reportService.getFamilyPlanning());
        child.setText("" + reportService.getNewBorn());
        liveBirth.setText("" + reportService.getLiveBirth());
        stillBirth.setText("" + reportService.getStillBirth());
        abortionORmiscarrige.setText("" + reportService.getMisCarriageOrAbortion());
        atBirth.setText("" + reportService.getAtBirth());
        atDelivery.setText("" + reportService.getAtDelivery());
    }
}
