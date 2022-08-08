package com.marufalam.preschoollearning.fragments.dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.databinding.FragmentDashBoardBinding;


public class DashBoardFragment extends Fragment {
    private FragmentDashBoardBinding binding;




    public DashBoardFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDashBoardBinding.inflate(inflater,container,false);
        final DashboardAdapter adapter = new DashboardAdapter(
                DashBordModel.getDashboardAllItems());
        final GridLayoutManager llm = new GridLayoutManager(getActivity(),1,LinearLayoutManager.HORIZONTAL,false);
        binding.dashboardRecyclerView.setLayoutManager(llm);
        binding.dashboardRecyclerView.setAdapter(adapter);
        return binding.getRoot();
    }
}