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

        alphabetModelList.add(new AlphabetModel(R.drawable.a, R.drawable.small_a, R.drawable.apple, "Apple"));
        alphabetModelList.add(new AlphabetModel(R.drawable.b, R.drawable.small_b, R.drawable.boy, "Boy"));
        alphabetModelList.add(new AlphabetModel(R.drawable.c, R.drawable.small_c, R.drawable.cat, "Cat"));
        alphabetModelList.add(new AlphabetModel(R.drawable.d, R.drawable.small_d, R.drawable.duck, "Duck"));
        alphabetModelList.add(new AlphabetModel(R.drawable.e, R.drawable.small_e, R.drawable.egg, "Egg"));


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