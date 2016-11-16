package com.sam.navdrawerlockedplease;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;


/**
 * A simple {@link Fragment} subclass.
 */
public class graphFragment extends Fragment {

    //https://github.com/PhilJay/MPAndroidChart/wiki/Getting-Started
    public graphFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bargraph, container, false);
        LineChart chart = (LineChart) view.findViewById(R.id.chart);

        // Inflate the layout for this fragment
        return view;
    }

}
