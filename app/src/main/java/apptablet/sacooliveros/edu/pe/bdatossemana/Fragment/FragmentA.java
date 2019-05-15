package apptablet.sacooliveros.edu.pe.bdatossemana.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apptablet.sacooliveros.edu.pe.bdatossemana.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    View  rootview;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview= inflater.inflate(R.layout.fragment_a, container, false);


        return rootview;
    }

}
