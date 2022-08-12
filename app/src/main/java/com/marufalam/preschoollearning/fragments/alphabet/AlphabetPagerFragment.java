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
import com.marufalam.preschoollearning.SoundInterfare;

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


        ImageView alphabet = (ImageView) view.findViewById(R.id.alphabet);
        ImageView objectName = (ImageView) view.findViewById(R.id.objectName);
        ImageView objectImg = (ImageView) view.findViewById(R.id.objectImg);
        alphabet.setImageResource(alphabetModel.getCapitalImg());
        objectImg.setImageResource(alphabetModel.getObjectImg());
        objectName.setImageResource(alphabetModel.getObjectDetail());

        alphabet.setOnClickListener(view1 -> SoundInterfare.playSound( alphabetModel.alphaSound,getContext()));

        objectImg.setOnClickListener(view1 -> SoundInterfare.playSound( alphabetModel.objectSound,getContext()));
        return view;
    }
}