package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sam.navdrawerlockedplease.R;

/**
 * Created by cyrus on 12/12/16.
 */
public class WorkLoadFragment extends Fragment {

    public WorkLoadFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.workload, container, false);

        return  view;
    }
}
