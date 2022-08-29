package com.marufalam.preschoollearning.fragments.dashboard;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.marufalam.preschoollearning.R;

import java.util.List;

public class DashboardAdapter  extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {
    private final List<DashBordModel> categoryList;

    public DashboardAdapter(List<DashBordModel> categoryList) {
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_row,parent,false);
        return new DashboardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.categoryImage.setImageResource(categoryList.get(position).getCategoryImg());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             switch (position){
                 case 0:
                     Navigation.findNavController(view).navigate(R.id.action_dashBoardFragment_to_alphabetFragment);
                     break;
                 case 1:
                     Navigation.findNavController(view).navigate(R.id.action_dashBoardFragment_to_numberFragment);
                     break;
                 case 2:
                     Navigation.findNavController(view).navigate(R.id.action_dashBoardFragment_to_weekFragment);
                     break;
                 case 3:
                     Navigation.findNavController(view).navigate(R.id.action_dashBoardFragment_to_bodyPartFragment);
                     break;
                 case 4:
                     Navigation.findNavController(view).navigate(R.id.action_dashBoardFragment_to_colorFragment);
                     break;
                 case 5:
                     Navigation.findNavController(view).navigate(R.id.action_dashBoardFragment_to_quizFragment);
                     break;


             }
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class DashboardViewHolder extends RecyclerView.ViewHolder {
        ImageView categoryImage;
        public DashboardViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage = itemView.findViewById(R.id.categoryImg);
        }

    }

}
