package com.example.mytourguideaplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {


    private Context context;
    private ArrayList<DataClass> data = new ArrayList<>();

    //creating constructor.
    public DataAdapter(Context context, ArrayList<DataClass> data) {
        this.context = context;
        this.data = data;
    }


    //creating views and setting XML layout with adapter.
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        //set text to adapter here.
        holder.tvName.setText(data.get(position).cityName);
        holder.description.setText(data.get(position).cityDescription);
        holder.imageView.setImageResource(data.get(position).images);
    }

    //defining number of items.
    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName;
        TextView description;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            description = itemView.findViewById(R.id.description);
            parentLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
