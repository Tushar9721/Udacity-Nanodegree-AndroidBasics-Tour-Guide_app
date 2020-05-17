package com.example.mytourguideaplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuebecFragment extends Fragment {

    public ArrayList<DataClass> data = new ArrayList<>();
    public DataClass dataClass;

    public int[] titleQuebec = new int[]{
            R.string.monteral_black,R.string.gatineau_park,R.string.hudson,R.string.forllion_national_park,R.string.basilica

    };

    public int[] descriptionQuebec = new int[]{

            R.string.descp_quebec_one,
            R.string.descp_quebec_two,R.string.descp_quebec_thre,
            R.string.descp_quebec_four,
            R.string.descp_quebec_five

             };

    public static int[] imagesQuebec = new int[]{
            R.drawable.botanical_garden, R.drawable.gatineau_park, R.drawable.hudson_bay, R.drawable.forllion_national_park, R.drawable.bascila
    };


    public QuebecFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quebec, container, false);
        RecyclerView quebecRecycler = view.findViewById(R.id.quebecRecycler);


        for (int i = 0; i < titleQuebec.length; i++) {
            dataClass = new DataClass(titleQuebec[i], descriptionQuebec[i], imagesQuebec[i]);
            data.add(dataClass);

        }

        DataAdapter adapter = new DataAdapter(getContext(), data);
        quebecRecycler.setAdapter(adapter);
        quebecRecycler.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}
