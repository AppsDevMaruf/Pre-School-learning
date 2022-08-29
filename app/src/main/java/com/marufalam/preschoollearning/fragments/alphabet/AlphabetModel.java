package com.marufalam.preschoollearning.fragments.alphabet;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.week.WeekModel;

import java.util.ArrayList;
import java.util.List;

public class AlphabetModel {
    int alphL,alphW,alphObject,alphSponudL,AlphSponudW;

    public AlphabetModel() {
    }

    public AlphabetModel(int alphL, int alphW, int alphObject, int alphSponudL, int alphSponudW) {
        this.alphL = alphL;
        this.alphW = alphW;
        this.alphObject = alphObject;
        this.alphSponudL = alphSponudL;
        AlphSponudW = alphSponudW;
    }

    public int getAlphL() {
        return alphL;
    }

    public void setAlphL(int alphL) {
        this.alphL = alphL;
    }

    public int getAlphW() {
        return alphW;
    }

    public void setAlphW(int alphW) {
        this.alphW = alphW;
    }

    public int getAlphObject() {
        return alphObject;
    }

    public void setAlphObject(int alphObject) {
        this.alphObject = alphObject;
    }

    public int getAlphSponudL() {
        return alphSponudL;
    }

    public void setAlphSponudL(int alphSponudL) {
        this.alphSponudL = alphSponudL;
    }

    public int getAlphSponudW() {
        return AlphSponudW;
    }

    public void setAlphSponudW(int alphSponudW) {
        AlphSponudW = alphSponudW;
    }
    public static List<AlphabetModel> getAlphabetItems(){
        final ArrayList<AlphabetModel> items = new ArrayList<>();
        items.add(new AlphabetModel(R.drawable.a,R.drawable.apple_t,R.drawable.apple,R.raw.a,R.raw.a_is_for_apple));
        items.add(new AlphabetModel(R.drawable.a,R.drawable.apple_t,R.drawable.apple,R.raw.a,R.raw.a_is_for_apple));
        items.add(new AlphabetModel(R.drawable.a,R.drawable.apple_t,R.drawable.apple,R.raw.a,R.raw.a_is_for_apple));
        items.add(new AlphabetModel(R.drawable.a,R.drawable.apple_t,R.drawable.apple,R.raw.a,R.raw.a_is_for_apple));

        return items;
    }
}
