package com.marufalam.preschoollearning.fragments.color;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.CategoryModels;
import com.marufalam.preschoollearning.fragments.bodyparts.BodyPartsViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class ColorFragment extends Fragment {
    List<CategoryModels> categoryModelsList;
    ViewPager viewpager;

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color, container, false);

        categoryModelsList = new ArrayList<>();
        categoryModelsList.add(new CategoryModels(R.drawable.black_t,  R.drawable.black,R.raw.black));
        categoryModelsList.add(new CategoryModels(R.drawable.blue_t,  R.drawable.blue,R.raw.blue));
        categoryModelsList.add(new CategoryModels(R.drawable.cyan_t,  R.drawable.cyan,R.raw.cyan));
        categoryModelsList.add(new CategoryModels(R.drawable.green_t,  R.drawable.green,R.raw.green));
        categoryModelsList.add(new CategoryModels(R.drawable.grey_t,  R.drawable.grey,R.raw.grey));
        categoryModelsList.add(new CategoryModels(R.drawable.magenta_t,  R.drawable.magenta,R.raw.magenta));
        categoryModelsList.add(new CategoryModels(R.drawable.orange_t,  R.drawable.orange,R.raw.orange));
        categoryModelsList.add(new CategoryModels(R.drawable.pink_t,  R.drawable.pink,R.raw.pink));
        categoryModelsList.add(new CategoryModels(R.drawable.purple_t,  R.drawable.purple,R.raw.purple));
        categoryModelsList.add(new CategoryModels(R.drawable.red_t,  R.drawable.red,R.raw.red));
        categoryModelsList.add(new CategoryModels(R.drawable.yellow_t,  R.drawable.yellow,R.raw.yellow));


        viewpager = view.findViewById(R.id.viewpager);
        setupViewPager(viewpager);
        return view;
    }
    private void setupViewPager(ViewPager viewPager) {
        BodyPartsViewPagerAdapter adapter = new BodyPartsViewPagerAdapter(getChildFragmentManager());


        for(CategoryModels so: categoryModelsList){
            adapter.addFragment(new ColorPagerFragment(so));
        }


        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);
    }
}