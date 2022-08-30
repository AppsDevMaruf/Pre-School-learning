package com.marufalam.preschoollearning.fragments.color;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.week.WeekModel;

import java.util.ArrayList;
import java.util.List;

public class ColorModel {
    int colorText,color,colorSound;

    public ColorModel() {
    }

    public ColorModel(int colorText, int color, int colorSound) {
        this.colorText = colorText;
        this.color = color;
        this.colorSound = colorSound;
    }

    public int getColorText() {
        return colorText;
    }

    public void setColorText(int colorText) {
        this.colorText = colorText;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColorSound() {
        return colorSound;
    }

    public void setColorSound(int colorSound) {
        this.colorSound = colorSound;
    }
    public static List<ColorModel> getColorItems(){
        final ArrayList<ColorModel> items = new ArrayList<>();
        items.add(new ColorModel(R.drawable.red_t,R.drawable.red,R.raw.red));
        items.add(new ColorModel(R.drawable.green_t,R.drawable.green,R.raw.green));
        items.add(new ColorModel(R.drawable.black_t,R.drawable.black,R.raw.black));
        items.add(new ColorModel(R.drawable.yellow_t,R.drawable.yellow,R.raw.yellow));
        items.add(new ColorModel(R.drawable.cyan_t,R.drawable.cyan,R.raw.cyan));
        items.add(new ColorModel(R.drawable.blue_t,R.drawable.blue,R.raw.blue));

        return items;
    }
}
