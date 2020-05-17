package com.example.mytourguideaplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AlbertaFragment extends Fragment {

    public ArrayList<DataClass> data = new ArrayList<>();
    public DataClass dataClass;

    //data for alberta province
    public int[] titleAlberta = new int[]{
            R.string.banff_national, R.string.lake_louise, R.string.west_edmenton, R.string.calgary_tower, R.string.canmore
    };

    public int[] descriptionAlberta = new int[]{
            R.string.data_alberta_one,
            R.string.data_alberta_two,
            R.string.data_alberta_three,
            R.string.data_alberta_four,
            R.string.data_alberta_five

    };

    public static int[] imagesAlberta = new int[]{
            R.drawable.banff_national_park, R.drawable.lake_lousie,
            R.drawable.west_edmenton_mall, R.drawable.calgary_tower, R.drawable.canmore
    };

    public AlbertaFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //setting the view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alberta, container, false);
        RecyclerView recycler = view.findViewById(R.id.albertaRecycler);

        for (int i = 0; i < titleAlberta.length; i++) {
            dataClass = new DataClass(titleAlberta[i], descriptionAlberta[i], imagesAlberta[i]);
            data.add(dataClass);

        }

        DataAdapter adapter = new DataAdapter(getContext(), data);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}
