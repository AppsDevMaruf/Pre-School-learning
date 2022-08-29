package com.marufalam.preschoollearning.fragments.week;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.dashboard.DashBordModel;
import com.marufalam.preschoollearning.fragments.dashboard.DashboardAdapter;


public class WeekFragment extends Fragment {


    public WeekFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_week, container, false);

        ImageView backbtn = view.findViewById(R.id.backbtn);
        backbtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_weekFragment_to_dashBoardFragment);
        });

        final WeekAdapter adapter = new WeekAdapter(WeekModel.getWeekItems());
        final LinearLayoutManager llm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = view.findViewById(R.id.weekRV);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);
        return view;
    }
}