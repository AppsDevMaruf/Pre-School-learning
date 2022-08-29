package com.marufalam.preschoollearning.fragments.number;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.CategoryModels;

import java.util.ArrayList;
import java.util.List;


public class NumberFragment extends Fragment {
    List<CategoryModels> categoryModelsList;


    public NumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        categoryModelsList = new ArrayList<>();
        categoryModelsList.add(new CategoryModels(R.drawable.one_t, R.drawable.one, R.raw.one));
        categoryModelsList.add(new CategoryModels(R.drawable.two_t, R.drawable.two, R.raw.two));
        categoryModelsList.add(new CategoryModels(R.drawable.three_t, R.drawable.three, R.raw.three));
        categoryModelsList.add(new CategoryModels(R.drawable.four_t, R.drawable.four, R.raw.four));
        categoryModelsList.add(new CategoryModels(R.drawable.five_t, R.drawable.five, R.raw.five));
        categoryModelsList.add(new CategoryModels(R.drawable.six_t, R.drawable.six, R.raw.six));
        categoryModelsList.add(new CategoryModels(R.drawable.seven_t, R.drawable.seven, R.raw.seven));
        categoryModelsList.add(new CategoryModels(R.drawable.eight_t, R.drawable.eight, R.raw.eight));
        categoryModelsList.add(new CategoryModels(R.drawable.nine_t, R.drawable.nine, R.raw.nine));
        categoryModelsList.add(new CategoryModels(R.drawable.ten_t, R.drawable.ten, R.raw.ten));


        return view;
    }
}