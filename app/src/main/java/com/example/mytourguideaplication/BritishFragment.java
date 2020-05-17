package com.example.mytourguideaplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BritishFragment extends Fragment {


    public ArrayList<DataClass> data = new ArrayList<>();
    public DataClass dataClass;

    //setting data
    public int[] titleBc = new int[]{
            R.string.yoho_park, R.string.vancouver_island, R.string.butchar, R.string.haida, R.string.glacier


    };

    public int[] descriptionBc = new int[]{

            R.string.descp_british_one, R.string.descp_british_two, R.string.descp_british_three,
            R.string.descp_british_four, R.string.descp_ontario_five

    };

    public static int[] imagesBc = new int[]{
            R.drawable.yoyo_national_park, R.drawable.vancover, R.drawable.butchart_gardens, R.drawable.haida_gawai, R.drawable.glacier_national_park
    };


    public BritishFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //setting views
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_british, container, false);
        RecyclerView recycler = view.findViewById(R.id.bcRecycler);

        for (int i = 0; i < titleBc.length; i++) {
            dataClass = new DataClass(titleBc[i], descriptionBc[i], imagesBc[i]);
            data.add(dataClass);

        }

        DataAdapter adapter = new DataAdapter(getContext(), data);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}
