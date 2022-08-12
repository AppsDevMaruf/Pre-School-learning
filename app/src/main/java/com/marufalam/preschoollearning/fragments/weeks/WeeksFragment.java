package com.marufalam.preschoollearning.fragments.weeks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.CategoryModels;
import com.marufalam.preschoollearning.fragments.bodyparts.BodyPartsViewPagerAdapter;
import com.marufalam.preschoollearning.fragments.color.ColorPagerFragment;

import java.util.ArrayList;
import java.util.List;


public class WeeksFragment extends Fragment {

    List<CategoryModels> categoryModelsList;
    ViewPager viewpager;

    public WeeksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weeks, container, false);
        categoryModelsList = new ArrayList<>();
        categoryModelsList.add(new CategoryModels( R.drawable.saturday,R.raw.saturday));
        categoryModelsList.add(new CategoryModels( R.drawable.sunday,R.raw.sunday));
        categoryModelsList.add(new CategoryModels(R.drawable.monday,  R.raw.monday));
        categoryModelsList.add(new CategoryModels(R.drawable.tuesday,  R.raw.tuesday));
        categoryModelsList.add(new CategoryModels(R.drawable.wednesday,  R.raw.wednesday));
        categoryModelsList.add(new CategoryModels(R.drawable.thursday,  R.raw.thursday));
        categoryModelsList.add(new CategoryModels(R.drawable.friday,  R.raw.friday));



        viewpager = view.findViewById(R.id.viewpager);
        setupViewPager(viewpager);
        return view;
    }
    private void setupViewPager(ViewPager viewPager) {
        WeekViewPagerAdapter adapter = new WeekViewPagerAdapter(getChildFragmentManager());


        for(CategoryModels so: categoryModelsList){
            adapter.addFragment(new WeekPagerFragment(so));
        }


        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);
    }
}