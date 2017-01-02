package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sam.navdrawerlockedplease.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgressFragment extends Fragment {




    //https://github.com/PhilJay/MPAndroidChart/wiki/Getting-Started
    public ProgressFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.progress, container, false);
        // Inflate the layout for this fragment
        return view;
    }

}
