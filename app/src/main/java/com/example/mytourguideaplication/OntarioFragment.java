package com.example.mytourguideaplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OntarioFragment extends Fragment {

    public ArrayList<DataClass> data = new ArrayList<>();
    public DataClass dataClass;
    //data for Ontario
    public int[] titleOntario = new int[]{
            R.string.cn_tower,R.string.niagara_falls,R.string.ottawa,R.string.royal_ontario,R.string.lake_woods
            /*"CN Tower", "Niagara Falls",
            "Ottawa", "Royal Ontario Museum", "Lake of the Woods"*/
    };

    public int[] descriptionOntario = new int[]{
          R.string.descp_ontario_one,
            R.string.descp_ontario_two,
            R.string.descp_ontario_three,
            R.string.descp_ontario_for,
            R.string.descp_ontario_five
    };

    public static int[] imagesOntario = new int[]{
            R.drawable.cn_tower, R.drawable.niagara_falls, R.drawable.ottawa, R.drawable.royal_museun, R.drawable.lake_of_woods
    };

    public OntarioFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ontario, container, false);
        RecyclerView recycler = view.findViewById(R.id.ontarioRecycler);


        for (int i = 0; i < titleOntario.length; i++) {
            dataClass = new DataClass(titleOntario[i], descriptionOntario[i], imagesOntario[i]);
            data.add(dataClass);

        }

        DataAdapter adapter = new DataAdapter(getContext(), data);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}
