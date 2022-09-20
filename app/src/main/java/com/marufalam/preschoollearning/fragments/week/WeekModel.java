package com.marufalam.preschoollearning.fragments.week;

import com.marufalam.preschoollearning.R;

import java.util.ArrayList;
import java.util.List;

public class WeekModel {
    int img,weekSound;

    public WeekModel() {
    }

    public WeekModel(int img, int weekSound) {
        this.img = img;
        this.weekSound = weekSound;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getWeekSound() {
        return weekSound;
    }

    public void setWeekSound(int weekSound) {
        this.weekSound = weekSound;
    }

    public static List<WeekModel> getWeekItems(){
        final ArrayList<WeekModel> items = new ArrayList<>();
        items.add(new WeekModel(R.drawable.saturday,R.raw.saturday));
        items.add(new WeekModel(R.drawable.sunday,R.raw.sunday));
        items.add(new WeekModel(R.drawable.monday,R.raw.monday));
        items.add(new WeekModel(R.drawable.tuesday,R.raw.tuesday));
        items.add(new WeekModel(R.drawable.wednesday,R.raw.wednesday));
        items.add(new WeekModel(R.drawable.thursday,R.raw.thursday));
        items.add(new WeekModel(R.drawable.friday,R.raw.friday));
        return items;
    }
}
