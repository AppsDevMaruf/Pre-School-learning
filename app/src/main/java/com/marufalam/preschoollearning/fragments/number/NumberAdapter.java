package com.marufalam.preschoollearning.fragments.number;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterface;


import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {
        List<NumberModel> NummodelList;

    public NumberAdapter(List<NumberModel> modelList) {
        this.NummodelList = modelList;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.number_item,parent,false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.num.setImageResource(NummodelList.get(position).getNumber());
        holder.img.setImageResource(NummodelList.get(position).getImg());
        holder.num.setOnClickListener(view -> {
            SoundInterface.playSound(NummodelList.get(position).getNumSound(), view.getContext());
        });
        holder.img.setOnClickListener(view -> {
            SoundInterface.playSound(NummodelList.get(position).getNumSound(), view.getContext());
        });
    }

    @Override
    public int getItemCount() {
        return NummodelList.size() ;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {
        ImageView img,num;
        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.objectImg);
            num = itemView.findViewById(R.id.objectName);
        }
    }
}
