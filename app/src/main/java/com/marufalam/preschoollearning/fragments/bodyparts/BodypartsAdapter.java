package com.marufalam.preschoollearning.fragments.bodyparts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterfare;
import com.marufalam.preschoollearning.fragments.color.ColorAdapter;
import com.marufalam.preschoollearning.fragments.color.ColorModel;

import java.util.List;

public class BodypartsAdapter extends RecyclerView.Adapter<BodypartsAdapter.BodyPartsViewHolder> {
    List<BodyPartsModel> bodyPartsModels;

    public BodypartsAdapter(List<BodyPartsModel> bodyPartsModels) {
        this.bodyPartsModels = bodyPartsModels;
    }

    @NonNull
    @Override
    public BodyPartsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bodyparts_item,parent,false);
        return new BodyPartsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BodyPartsViewHolder holder, int position) {
        holder.bodyName.setImageResource(bodyPartsModels.get(position).getBodyName());
        holder.bodyImg.setImageResource(bodyPartsModels.get(position).getBodyImg());
        holder.bodyImg.setOnClickListener(view -> {
            SoundInterfare.playSound(bodyPartsModels.get(position).getBodySound(), view.getContext());
        });
    }


    @Override
    public int getItemCount() {
        return bodyPartsModels.size();
    }

    class BodyPartsViewHolder extends RecyclerView.ViewHolder {
        ImageView bodyName,bodyImg;
        public BodyPartsViewHolder(@NonNull View itemView) {
            super(itemView);

            bodyName =itemView.findViewById(R.id.objectName);
            bodyImg =itemView.findViewById(R.id.objectImg);
        }
    }
}
