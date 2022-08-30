package com.marufalam.preschoollearning.fragments.alphabet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.week.WeekAdapter;
import com.marufalam.preschoollearning.fragments.week.WeekModel;


public class AlphabetFragment extends Fragment {


    public AlphabetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_alphabet, container, false);
        ImageView backbtn = view.findViewById(R.id.backbtn);
        backbtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_alphabetFragment_to_dashBoardFragment);
        });

        final AlphabetAdapter adapter = new AlphabetAdapter(AlphabetModel.getAlphabetItems());
        final LinearLayoutManager llm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = view.findViewById(R.id.alphRV);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);
        return view;
    }
}