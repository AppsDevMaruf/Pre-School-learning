package com.marufalam.preschoollearning.fragments.alphabet;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marufalam.preschoollearning.R;

import java.util.ArrayList;
import java.util.List;

public class AlphabetFragment extends Fragment {

    List<AlphabetModel> alphabetModelList;
    ViewPager viewpager;


    public AlphabetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphabet, container, false);

        alphabetModelList = new ArrayList<>();
        alphabetModelList.add(new AlphabetModel(R.drawable.a,  R.drawable.apple, R.drawable.apple_t,R.raw.a,R.raw.a_is_for_apple));
        alphabetModelList.add(new AlphabetModel(R.drawable.b,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.c,  R.drawable.cat, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.d,  R.drawable.duck, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.e,  R.drawable.egg, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.f,  R.drawable.fish, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.g,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.h,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.i,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.j,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.k,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.l,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.m,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.n,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.o,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.p,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.q,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.r,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.s,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.t,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.u,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.v,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.w,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.x,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.y,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.z,  R.drawable.boy, R.drawable.boy_t,R.raw.b,R.raw.b_is_for_boy));


        viewpager = view.findViewById(R.id.viewpager);
        setupViewPager(viewpager);
        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        AlphabetViewPagerAdapter adapter = new AlphabetViewPagerAdapter(getChildFragmentManager());


        for(AlphabetModel so:alphabetModelList){
            adapter.addFragment(new AlphabetPagerFragment(so));
        }


        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);
    }


}