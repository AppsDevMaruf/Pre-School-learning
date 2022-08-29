package com.marufalam.preschoollearning.fragments.week;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterfare;


import java.util.List;

public class WeekAdapter extends RecyclerView.Adapter<WeekAdapter.WeekViewHolder> {
    private final List<WeekModel> weekList;

    public WeekAdapter(List<WeekModel> weekList) {
        this.weekList = weekList;
    }

    @NonNull
    @Override
    public WeekViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.week_item,parent,false);
        return new WeekViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WeekViewHolder holder, int position) {
        holder.weekImg.setImageResource(weekList.get(position).getImg());
        holder.weekImg.setOnClickListener(view -> {
            SoundInterfare.playSound(weekList.get(position).getWeekSound(), view.getContext());
        });

    }

    @Override
    public int getItemCount() {
        return weekList.size();
    }


    class WeekViewHolder extends RecyclerView.ViewHolder {
        ImageView weekImg;
        public WeekViewHolder(@NonNull View itemView) {
            super(itemView);
            weekImg = itemView.findViewById(R.id.weekImg);
        }

    }

}
