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
        items.add(new NumberModel(R.drawable.four_t,R.drawable.four,R.raw.four));
        items.add(new NumberModel(R.drawable.five_t,R.drawable.five,R.raw.five));
        items.add(new NumberModel(R.drawable.six_t,R.drawable.six,R.raw.six));
        items.add(new NumberModel(R.drawable.seven_t,R.drawable.seven,R.raw.seven));
        items.add(new NumberModel(R.drawable.eight_t,R.drawable.eight,R.raw.eight));
        items.add(new NumberModel(R.drawable.nine_t,R.drawable.nine,R.raw.nine));
        items.add(new NumberModel(R.drawable.ten_t,R.drawable.ten,R.raw.ten));
        return items;
    }
}
