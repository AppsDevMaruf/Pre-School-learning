package com.marufalam.preschoollearning.fragments.dashboard;

import com.marufalam.preschoollearning.R;

import java.util.ArrayList;
import java.util.List;

public class DashBordModel {
    int categoryImg;

    public DashBordModel() {
    }

    public DashBordModel(int categoryImg) {
        this.categoryImg = categoryImg;
    }

    public int getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(int categoryImg) {
        this.categoryImg = categoryImg;
    }

    public static List<DashBordModel> getDashboardAllItems(){
        final ArrayList<DashBordModel> items = new ArrayList<>();
        items.add(new DashBordModel(R.drawable.alphabet));
        items.add(new DashBordModel(R.drawable.numbers));
        items.add(new DashBordModel(R.drawable.weekdays));
        items.add(new DashBordModel(R.drawable.bodyparts));
        items.add(new DashBordModel(R.drawable.colors));
        items.add(new DashBordModel(R.drawable.quiz));

        return items;
    }
}
