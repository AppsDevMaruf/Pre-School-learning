package com.marufalam.preschoollearning.fragments.bodyparts;

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


public class BodyPartFragment extends Fragment {
    List<CategoryModels> bodyPModelList;
    ViewPager viewpager;

    public BodyPartFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_body_part, container, false);

        bodyPModelList = new ArrayList<>();
        bodyPModelList.add(new CategoryModels(R.drawable.arm_t,  R.drawable.arm,R.raw.arm));
        bodyPModelList.add(new CategoryModels(R.drawable.ears_t,  R.drawable.ears,R.raw.ears));
        bodyPModelList.add(new CategoryModels(R.drawable.eyes_t,  R.drawable.eyes,R.raw.eyes));
        bodyPModelList.add(new CategoryModels(R.drawable.forehead_t,  R.drawable.forehead_t,R.raw.forehad));
        bodyPModelList.add(new CategoryModels(R.drawable.hand_t,  R.drawable.hand_t,R.raw.hand));
        bodyPModelList.add(new CategoryModels(R.drawable.head_t,  R.drawable.head,R.raw.head));
        bodyPModelList.add(new CategoryModels(R.drawable.leg_t,  R.drawable.leg,R.raw.leg));
        bodyPModelList.add(new CategoryModels(R.drawable.mouth_t,  R.drawable.mouth,R.raw.mouth));
        bodyPModelList.add(new CategoryModels(R.drawable.neck_t,  R.drawable.neck,R.raw.neck));
        bodyPModelList.add(new CategoryModels(R.drawable.nose_t,  R.drawable.nose,R.raw.nose));
        bodyPModelList.add(new CategoryModels(R.drawable.shoulder_t,  R.drawable.shoulder,R.raw.shoulder));
        bodyPModelList.add(new CategoryModels(R.drawable.teeth_t,  R.drawable.teeth,R.raw.teeth));




        viewpager = view.findViewById(R.id.viewpager);
        setupViewPager(viewpager);
        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        BodyPartsViewPagerAdapter adapter = new BodyPartsViewPagerAdapter(getChildFragmentManager());


        for(CategoryModels so:bodyPModelList){
            adapter.addFragment(new BodyPartsPagerFragment(so));
        }


        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);
    }



}
