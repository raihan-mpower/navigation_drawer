package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sam.navdrawerlockedplease.R;

import services.ProgressService;
import services.WorkLoadService;

/**
 * Created by cyrus on 12/11/16.
 */
public class HomeFragment extends Fragment {


    private WorkLoadService workLoadService;
    private ProgressService progressService;
    //workload
    private TextView workLoadHHVisit;
    private TextView workLoadEC;
    private TextView workLoadPregnancyRegister;
    private TextView workLoadANC;
    private TextView workLoadPNC;
    private TextView workLoadENCC;

    //progress
    private TextView progressHHVisit;
    private TextView progressEC;
    private TextView progressPregnancyRegister;
    private TextView progressANC;
    private TextView progressPNC;
    private TextView progressENCC;


    public HomeFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        init(view);
        setValue();
        return  view;
    }

    private void init(View view) {



        workLoadHHVisit = (TextView) view.findViewById(R.id.workLoadHHVisit);
        workLoadEC = (TextView) view.findViewById(R.id.workLoadEC);
        workLoadPregnancyRegister = (TextView) view.findViewById(R.id.workLoadPregnancyRegister);
        workLoadANC = (TextView) view.findViewById(R.id.workLoadANC);
        workLoadPNC = (TextView) view.findViewById(R.id.workLoadPNC);
        workLoadENCC = (TextView) view.findViewById(R.id.workLoadENCC);

        workLoadService = new WorkLoadService(getActivity().getApplicationContext());
        progressService = new ProgressService(getActivity().getApplicationContext());

        progressHHVisit = (TextView) view.findViewById(R.id.progressHHVisit);
        progressEC = (TextView) view.findViewById(R.id.progressEC);
        progressPregnancyRegister = (TextView) view.findViewById(R.id.progressPregnancyRegister);
        progressANC = (TextView) view.findViewById(R.id.progressANC);
        progressPNC = (TextView) view.findViewById(R.id.progressPNC);
        progressENCC = (TextView) view.findViewById(R.id.progressENCC);
    }

    private void setValue(){

        workLoadHHVisit.setText("" + workLoadService.getHouseHoldVisit());
        workLoadEC.setText("" + workLoadService.getElegibleCouple());
        workLoadPregnancyRegister.setText("" + workLoadService.getPregnancyRegister());
        workLoadANC.setText("" + workLoadService.getANC());
        workLoadPNC.setText("" + workLoadService.getPNC());
        workLoadENCC.setText("" + workLoadService.getENCC());


        progressHHVisit.setText("" + progressService.getHouseHoldVisit());
        progressEC.setText("" + progressService.getElegibleCouple());
        progressPregnancyRegister.setText("" + progressService.getPregnancyRegister());
        progressANC.setText("" + progressService.getANC());
        progressPNC.setText("" + progressService.getPNC());
        progressENCC.setText("" + progressService.getENCC());
    }
}
