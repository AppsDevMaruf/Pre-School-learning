package com.marufalam.preschoollearning.fragments.color;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterfare;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {
    List<ColorModel> colorModelList;

    public ColorAdapter(List<ColorModel> colorModelList) {
        this.colorModelList = colorModelList;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_item,parent,false);
        return new ColorViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        holder.colorText.setImageResource(colorModelList.get(position).getColorText());
        holder.color.setImageResource(colorModelList.get(position).getColor());
        holder.color.setOnClickListener(view -> {
            SoundInterfare.playSound(colorModelList.get(position).getColorSound(), view.getContext());
        });

    }

    @Override
    public int getItemCount() {
        return colorModelList.size();
    }

    class ColorViewHolder extends RecyclerView.ViewHolder {
        ImageView color,colorText;
        public ColorViewHolder(@NonNull View itemView) {
            super(itemView);

            colorText =itemView.findViewById(R.id.objectName);
            color =itemView.findViewById(R.id.objectImg);
        }
    }
}
