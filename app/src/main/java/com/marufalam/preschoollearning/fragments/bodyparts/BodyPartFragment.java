package com.marufalam.preschoollearning.fragments.bodyparts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.CategoryModels;
import com.marufalam.preschoollearning.fragments.color.ColorAdapter;
import com.marufalam.preschoollearning.fragments.color.ColorModel;


import java.util.ArrayList;
import java.util.List;


public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView backbtn = view.findViewById(R.id.backbtn);
        backbtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_bodyPartFragment_to_dashBoardFragment);
        });

        final BodypartsAdapter adapter = new BodypartsAdapter(BodyPartsModel.getBodyParts());
        final LinearLayoutManager llm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = view.findViewById(R.id.bodyRV);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);





        return view;
    }




}
