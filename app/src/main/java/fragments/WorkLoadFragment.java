package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.sam.navdrawerlockedplease.R;

import services.WorkLoadService;
import model.WorkLoad;

/**
 * Created by cyrus on 12/12/16.
 */
public class WorkLoadFragment extends Fragment {

    private WorkLoadService workLoadService;
    private TextView workLoadHHVisit;
    private TextView workLoadEC;
    private TextView workLoadPregnancyRegister;
    private TextView workLoadANC;
    private TextView workLoadPNC;
    private TextView workLoadENCC;

    private TextView workLoad_number_of_days_inMonth;
    private TextView workLoad_month_name;
    private TextView workLoad_first_week;
    private TextView workLoad_second_week;
    private TextView workLoad_third_week;
    private TextView workLoad_fourth_week;

    Button btn_workLoad_HHvisit;
    Button btn_workLoad_ec;
    Button btn_workLoad_pregnancy_register;
    Button btn_workLoad_anc;
    Button btn_workLoad_pnc;
    Button btn_workLoad_encc;

    public WorkLoadFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.workload, container, false);
        init(view);
        setValue();

        return  view;
    }

    private void init(View view) {

        btn_workLoad_HHvisit = (Button) view.findViewById(R.id.btn_workLoad_HHvisit);
        btn_workLoad_ec = (Button) view.findViewById(R.id.btn_workLoad_ec);
        btn_workLoad_pregnancy_register = (Button) view.findViewById(R.id.btn_workLoad_pregnancy_register);
        btn_workLoad_anc = (Button) view.findViewById(R.id.btn_workLoad_anc);
        btn_workLoad_pnc = (Button) view.findViewById(R.id.btn_workLoad_pnc);
        btn_workLoad_encc = (Button) view.findViewById(R.id.btn_workLoad_encc);

        workLoad_number_of_days_inMonth = (TextView) view.findViewById(R.id.workLoad_number_of_days_inMonth);
        workLoad_month_name = (TextView) view.findViewById(R.id.workLoad_month_name);
        workLoad_first_week = (TextView) view.findViewById(R.id.workLoad_first_week);
        workLoad_second_week = (TextView) view.findViewById(R.id.workLoad_second_week);
        workLoad_third_week = (TextView) view.findViewById(R.id.workLoad_third_week);
        workLoad_fourth_week = (TextView) view.findViewById(R.id.workLoad_fourth_week);

        btn_workLoad_HHvisit.setOnClickListener(onRegisterStartListener);
        btn_workLoad_ec.setOnClickListener(onRegisterStartListener);
        btn_workLoad_pregnancy_register.setOnClickListener(onRegisterStartListener);
        btn_workLoad_anc.setOnClickListener(onRegisterStartListener);
        btn_workLoad_pnc.setOnClickListener(onRegisterStartListener);
        btn_workLoad_encc.setOnClickListener(onRegisterStartListener);

        workLoadService = new WorkLoadService(getActivity().getApplicationContext());

        workLoadHHVisit = (TextView) view.findViewById(R.id.workLoadHHVisit);
        workLoadEC = (TextView) view.findViewById(R.id.workLoadEC);
        workLoadPregnancyRegister = (TextView) view.findViewById(R.id.workLoadPregnancyRegister);
        workLoadANC = (TextView) view.findViewById(R.id.workLoadANC);
        workLoadPNC = (TextView) view.findViewById(R.id.workLoadPNC);
        workLoadENCC = (TextView) view.findViewById(R.id.workLoadENCC);
    }

    private void setValue(){
        reset(1);
        btn_workLoad_HHvisit.setBackground(getResources().getDrawable(R.drawable.button_background_home));
        workLoadHHVisit.setText("" + workLoadService.getHouseHoldVisit());
        workLoadEC.setText("" + workLoadService.getElegibleCouple());
        workLoadPregnancyRegister.setText("" + workLoadService.getPregnancyRegister());
        workLoadANC.setText(" " + workLoadService.getANC());
        workLoadPNC.setText("" + workLoadService.getPNC());
        workLoadENCC.setText("" + workLoadService.getENCC());
    }
    public void reset(int item){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        Fragment progressMonthGraph = new MonthGraphFragment();
        Bundle bundle = new Bundle();

        bundle.putString("parentFragment", "WorkLoadFragment");
        bundle.putInt("itemClicked", item);
        progressMonthGraph.setArguments(bundle);

        fragmentManager.beginTransaction()
                .replace(R.id.fragmentGraph, progressMonthGraph)
                .commit();
        btn_workLoad_HHvisit.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_workLoad_ec.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_workLoad_pregnancy_register.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_workLoad_anc.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_workLoad_pnc.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_workLoad_encc.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
    }


    private View.OnClickListener onRegisterStartListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_workLoad_HHvisit:
                    reset(1);
                    btn_workLoad_HHvisit.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "workLoadHold");
                    break;

                case R.id.btn_workLoad_ec:
                    reset(2);
                    btn_workLoad_ec.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "workLoadHold");
                    break;

                case R.id.btn_workLoad_pregnancy_register:
                    reset(3);
                    btn_workLoad_pregnancy_register.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "workLoadPREGNANCYREGISTER");
                    break;

                case R.id.btn_workLoad_anc:
                    reset(4);
                    btn_workLoad_anc.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "workLoadANC");
                    break;

                case R.id.btn_workLoad_pnc:
                    reset(5);
                    btn_workLoad_pnc.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "workLoadPNC");
                    break;

                case R.id.btn_workLoad_encc:
                    reset(6);
                    btn_workLoad_encc.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "workLoadENC");
                    break;
            }

        }
    };
}
