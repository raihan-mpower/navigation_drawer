package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.sam.navdrawerlockedplease.R;

import java.util.ArrayList;

import services.MonthService;
import services.ProgressService;
import services.WorkLoadService;

/**
 * Created by cyrus on 12/11/16.
 */
public class MonthGraphFragment extends Fragment{

    private String parentFragmentName;
    private int item;
    private WorkLoadService workLoadService;
    private ProgressService progressService;

    public MonthGraphFragment(){
    }

    public void setMonthWorkLoadHHVisit(){}
    public void setMonthWorkLoadEC(){}
    public void setMonthWorkLoadPregnancyRegister(){}
    public void setMonthWorkLoadANC(){}
    public void setMonthWorkLoadPNC(){}
    public void setMonthWorkLoadENCC(){}

    public void setMonthProgressHHVisit(){}
    public void setMonthProgressEC(){}
    public void setMonthProgressPregnancyRegister(){}
    public void setMonthProgressANC(){}
    public void setMonthProgressPNC(){}
    public void setMonthProgressENCC(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bargraph, container, false);

        parentFragmentName = this.getArguments().getString("parentFragment");
        item = getArguments().getInt("itemClicked");

        Log.d("fragment",parentFragmentName + " " + item);

        BarChart barChart = (BarChart) view.findViewById(R.id.chart);

        ArrayList<BarEntry> entries = new ArrayList<>();

        /*if(type.equals("workLoad")){
            entries = workLoadService.findMonthGraph();
        }
        if(type.equals("progress")){
            entries = progressService.findMonthGraph();
        }*/

        init();
        entries.add(new BarEntry(10, 0));
        entries.add(new BarEntry(20, 1));
        entries.add(new BarEntry(10, 2));
        entries.add(new BarEntry(20, 3));


        ArrayList<BarEntry> entries1 = new ArrayList<>();
        entries1.add(new BarEntry(10, 0));
        entries1.add(new BarEntry(20, 1));
        entries1.add(new BarEntry(10, 2));
        entries1.add(new BarEntry(20, 3));


        ArrayList<BarEntry> entries2 = new ArrayList<>();
        entries2.add(new BarEntry(10, 0));
        entries2.add(new BarEntry(20, 1));

        entries2.add(new BarEntry(10, 2));
        entries2.add(new BarEntry(20, 3));


        ArrayList<String> labels = new ArrayList<>();
        labels.add("sss");
        labels.add("fff");
        labels.add("sss");
        labels.add("fff");

        BarDataSet dataset1 = new BarDataSet(entries, "খানা পরিদর্শন ");
        BarDataSet dataSet2 = new BarDataSet(entries1, "সক্ষম দম্পত্তি");
        BarDataSet dataSet3 = new BarDataSet(entries2, "গর্ভবতী মা");

        ArrayList<BarDataSet> dataSets = new ArrayList<>();

        dataSets.add(dataset1);
        dataSets.add(dataSet2);
        dataSets.add(dataSet3);

        BarData data = new BarData(labels,dataSets);
        //dataset1.setColors();
        barChart.setData(data);
        barChart.animateY(1000);
        barChart.setGridBackgroundColor(getResources().getColor(R.color.grid_background_color));
        return view;
    }

    private void init(){

        if(parentFragmentName.equals("ProgressFragment")){
            switch (item){
                case 1:
                    setMonthProgressHHVisit();
                    break;
                case 2:
                    setMonthProgressEC();
                    break;
                case 3:
                    setMonthProgressPregnancyRegister();
                    break;
                case 4:
                    setMonthProgressANC();
                    break;
                case 5:
                    setMonthProgressPNC();
                    break;
                case 6:
                    setMonthProgressENCC();
                    break;
            }
        }
        else {
            switch (item){
                
                case 1:
                    setMonthWorkLoadHHVisit();
                    break;
                case 2:
                    setMonthWorkLoadEC();
                    break;
                case 3:
                    setMonthWorkLoadPregnancyRegister();
                    break;
                case 4:
                    setMonthWorkLoadANC();
                    break;
                case 5:
                    setMonthWorkLoadPNC();
                    break;
                case 6:
                    setMonthWorkLoadENCC();
                    break;
            }
        }
    }
}
