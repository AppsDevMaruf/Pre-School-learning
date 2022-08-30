package com.marufalam.preschoollearning.fragments.number;

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


public class NumberFragment extends Fragment {

    public NumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        ImageView backbtn = view.findViewById(R.id.backbtn);
        backbtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_numberFragment_to_dashBoardFragment);
        });

        final NumberAdapter adapter = new NumberAdapter(NumberModel.getNumberItems());
        final LinearLayoutManager llm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = view.findViewById(R.id.numberRV);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);


        return view;
    }
}