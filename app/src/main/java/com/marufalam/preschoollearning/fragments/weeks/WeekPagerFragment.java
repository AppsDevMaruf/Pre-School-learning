package com.marufalam.preschoollearning.fragments.weeks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterfare;
import com.marufalam.preschoollearning.fragments.CategoryModels;


public class WeekPagerFragment extends Fragment {



    public WeekPagerFragment() {
        // Required empty public constructor
    }
   CategoryModels categoryModels;

    public WeekPagerFragment(CategoryModels categoryModels) {
        this.categoryModels = categoryModels;
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_week_pager, container, false);




        ImageView objectImg = (ImageView) view.findViewById(R.id.objectImgWeek);

        objectImg.setImageResource(categoryModels.getObjectImg());
        objectImg.setOnClickListener(view1 -> {
            SoundInterfare.playSound( categoryModels.getObjectSound(),getContext());
        });


        return view;
    }
}