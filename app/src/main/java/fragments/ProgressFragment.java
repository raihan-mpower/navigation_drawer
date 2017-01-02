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
import services.ProgressService;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgressFragment extends Fragment {

    private ProgressService progressService;

    private TextView progressHHVisit;
    private TextView progressEC;
    private TextView progressPregnancyRegister;
    private TextView progressANC;
    private TextView progressPNC;
    private TextView progressENCC;

    private TextView progress_number_of_days_inMonth;
    private TextView progress_month_name;
    private TextView progress_first_week;
    private TextView progress_second_week;
    private TextView progress_third_week;
    private TextView progress_fourth_week;


    private Button btn_progress_household;
    private Button btn_progress_ec;
    private Button btn_progress_pregnancy_register;
    private Button btn_progress_anc;
    private Button btn_progress_pnc;
    private Button btn_progress_encc;

    //https://github.com/PhilJay/MPAndroidChart/wiki/Getting-Started
    public ProgressFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.progress, container, false);
        // Inflate the layout for this fragment

        init(view);
        setValue();

        return view;
    }

    private void init(View view) {

        btn_progress_household = (Button) view.findViewById(R.id.btn_progress_household);
        btn_progress_ec = (Button) view.findViewById(R.id.btn_progress_ec);
        btn_progress_pregnancy_register = (Button) view.findViewById(R.id.btn_progress_pregnancy_register);
        btn_progress_anc = (Button) view.findViewById(R.id.btn_progress_anc);
        btn_progress_pnc = (Button) view.findViewById(R.id.btn_progress_pnc);
        btn_progress_encc = (Button) view.findViewById(R.id.btn_progress_encc);

        progress_number_of_days_inMonth = (TextView) view.findViewById(R.id.progress_number_of_days_inMonth);
        progress_month_name = (TextView) view.findViewById(R.id.progress_month_name);
        progress_first_week = (TextView) view.findViewById(R.id.progress_first_week);
        progress_second_week = (TextView) view.findViewById(R.id.progress_second_week);
        progress_third_week = (TextView) view.findViewById(R.id.progress_third_week);
        progress_fourth_week = (TextView) view.findViewById(R.id.progress_fourth_week);

        btn_progress_household.setOnClickListener(onRegisterStartListener);
        btn_progress_ec.setOnClickListener(onRegisterStartListener);
        btn_progress_pregnancy_register.setOnClickListener(onRegisterStartListener);
        btn_progress_anc.setOnClickListener(onRegisterStartListener);
        btn_progress_pnc.setOnClickListener(onRegisterStartListener);
        btn_progress_encc.setOnClickListener(onRegisterStartListener);

        progressService = new ProgressService(getActivity().getApplicationContext());
        
        progressHHVisit = (TextView) view.findViewById(R.id.progressHHVisit);
        progressEC = (TextView) view.findViewById(R.id.progressEC);
        progressPregnancyRegister = (TextView) view.findViewById(R.id.progressPregnancyRegister);
        progressANC = (TextView) view.findViewById(R.id.progressANC);
        progressPNC = (TextView) view.findViewById(R.id.progressPNC);
        progressENCC = (TextView) view.findViewById(R.id.progressENCC);

    }

    private void setValue(){
        reset(1);
        btn_progress_household.setBackground(getResources().getDrawable(R.drawable.button_background_home));
        progressHHVisit.setText("" + progressService.getHouseHoldVisit());
        progressEC.setText("" + progressService.getElegibleCouple());
        progressPregnancyRegister.setText("" + progressService.getPregnancyRegister());
        progressANC.setText("" + progressService.getANC());
        progressPNC.setText("" + progressService.getPNC());
        progressENCC.setText("" + progressService.getENCC());

    }

    private void reset(int item){

        Log.d("itemClicked", ""+item);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        Fragment progressMonthGraph = new MonthGraphFragment();
        Bundle bundle = new Bundle();

        bundle.putString("parentFragment", "ProgressFragment");
        bundle.putInt("itemClicked", item);
        progressMonthGraph.setArguments(bundle);

        fragmentManager.beginTransaction()
                .replace(R.id.fragmentGraph, progressMonthGraph)
                .commit();
        btn_progress_household.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_progress_ec.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_progress_pregnancy_register.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_progress_anc.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_progress_pnc.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
        btn_progress_encc.setBackground(getResources().getDrawable(R.drawable.deselected_background_home));
    }


    private View.OnClickListener onRegisterStartListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.btn_progress_household:
                    reset(1);
                    btn_progress_household.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "progressHold");
                    break;

                case R.id.btn_progress_ec:
                    reset(2);
                    btn_progress_ec.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    Log.d("clicked", "progressHold");
                    break;

                case R.id.btn_progress_pregnancy_register:
                    reset(3);
                    btn_progress_pregnancy_register.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    break;

                case R.id.btn_progress_anc:
                    reset(4);
                    btn_progress_anc.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    break;

                case R.id.btn_progress_pnc:
                    reset(5);
                    btn_progress_pnc.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    break;

                case R.id.btn_progress_encc:
                    reset(6);
                    btn_progress_encc.setBackground(getResources().getDrawable(R.drawable.button_background_home));
                    break;
            }
        }

    };


}
