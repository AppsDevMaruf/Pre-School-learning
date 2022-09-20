package com.marufalam.preschoollearning.fragments.color;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marufalam.preschoollearning.R;

import android.widget.ImageView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.CategoryModels;
import com.marufalam.preschoollearning.fragments.week.WeekAdapter;
import com.marufalam.preschoollearning.fragments.week.WeekModel;

import java.util.ArrayList;
import java.util.List;

public class ColorFragment extends Fragment {


    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_color, container, false);

        ImageView backbtn = view.findViewById(R.id.backbtn);
        backbtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_colorFragment_to_dashBoardFragment);
        });

        final ColorAdapter adapter = new ColorAdapter(ColorModel.getColorItems());
        final LinearLayoutManager llm = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.colorRV);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);


        return view;
    }


}