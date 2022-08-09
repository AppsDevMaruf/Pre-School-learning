package com.marufalam.preschoollearning;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FindOutFragment extends Fragment {
    CardView alphabetQ,numberQ,weeksQ,bodyPartQ,colorQ;


    public FindOutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_find_out, container, false);
        alphabetQ = view.findViewById(R.id.alphabetQ);
        numberQ = view.findViewById(R.id.numberQ);
        weeksQ = view.findViewById(R.id.weeksQ);
        bodyPartQ = view.findViewById(R.id.bodyPartQ);
        colorQ = view.findViewById(R.id.colorQ);

        alphabetQ.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_findOutFragment_to_alphabetFindQFragment);
        });




        return view;
    }
}