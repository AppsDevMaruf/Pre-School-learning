package com.marufalam.preschoollearning.fragments.alphabet;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.exoplayer2.SimpleExoPlayer;
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
        alphabetModelList.add(new AlphabetModel(R.drawable.a, R.drawable.small_a, R.drawable.apple, "Apple",R.raw.a,R.raw.a_is_for_apple));
        alphabetModelList.add(new AlphabetModel(R.drawable.b, R.drawable.small_b, R.drawable.boy, "Boy",R.raw.b,R.raw.b_is_for_boy));
        alphabetModelList.add(new AlphabetModel(R.drawable.c, R.drawable.small_c, R.drawable.cat, "Cat",R.raw.c,R.raw.c_is_for_cat));
        alphabetModelList.add(new AlphabetModel(R.drawable.d, R.drawable.small_d, R.drawable.duck, "Duck",R.raw.d,R.raw.d_is_for_dog));
        alphabetModelList.add(new AlphabetModel(R.drawable.e, R.drawable.small_e, R.drawable.egg, "Egg",R.raw.e,R.raw.e_is_for_egg));


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