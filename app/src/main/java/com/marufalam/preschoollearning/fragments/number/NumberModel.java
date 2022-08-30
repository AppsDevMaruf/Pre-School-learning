package com.marufalam.preschoollearning.fragments.number;

import com.marufalam.preschoollearning.R;


import java.util.ArrayList;
import java.util.List;

public class NumberModel {
    int number,img,numSound;

    public NumberModel() {
    }

    public NumberModel(int number, int img, int numSound) {
        this.number = number;
        this.img = img;
        this.numSound = numSound;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getNumSound() {
        return numSound;
    }

    public void setNumSound(int numSound) {
        this.numSound = numSound;
    }

    public static List<NumberModel> getNumberItems(){
        final ArrayList<NumberModel> items = new ArrayList<>();
        items.add(new NumberModel(R.drawable.one_t,R.drawable.one,R.raw.one));
        items.add(new NumberModel(R.drawable.two_t,R.drawable.two,R.raw.two));
        items.add(new NumberModel(R.drawable.three_t,R.drawable.three,R.raw.three));
        items.add(new NumberModel(R.drawable.one_t,R.drawable.one,R.raw.one));
        items.add(new NumberModel(R.drawable.two_t,R.drawable.two,R.raw.two));
        items.add(new NumberModel(R.drawable.two_t,R.drawable.two,R.raw.two));
        items.add(new NumberModel(R.drawable.three_t,R.drawable.three,R.raw.three));
        return items;
    }
}
