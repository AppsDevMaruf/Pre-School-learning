package com.marufalam.preschoollearning.fragments.alphabet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.material.tabs.TabLayout;
import com.marufalam.preschoollearning.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AlphabetPagerFragment extends Fragment {



    public AlphabetPagerFragment() {
        // Required empty public constructor
    }
    AlphabetModel alphabetModel;

    public AlphabetPagerFragment(AlphabetModel alphabetModel) {
        this.alphabetModel = alphabetModel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphbet_pager, container, false);

        TextView tv = view.findViewById(R.id.objectText);
        tv.setText(alphabetModel.getObjectDetail());

        ImageView capital = (ImageView) view.findViewById(R.id.capital);
        ImageView small = (ImageView) view.findViewById(R.id.small);
        ImageView objectImg = (ImageView) view.findViewById(R.id.objectImg);
        capital.setImageResource(alphabetModel.getCapitalImg());
        small.setImageResource(alphabetModel.getSmallImg());
        objectImg.setImageResource(alphabetModel.getObjectImg());
        return view;
    }
}