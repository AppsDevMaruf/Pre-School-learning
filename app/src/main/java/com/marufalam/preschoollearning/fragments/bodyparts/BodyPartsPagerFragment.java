package com.marufalam.preschoollearning.fragments.bodyparts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterfare;
import com.marufalam.preschoollearning.fragments.CategoryModels;


public class BodyPartsPagerFragment extends Fragment {



    public BodyPartsPagerFragment() {
        // Required empty public constructor
    }
  CategoryModels categoryModels;

    public BodyPartsPagerFragment(CategoryModels categoryModels) {
        this.categoryModels = categoryModels;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphbet_pager, container, false);



        ImageView objectName = (ImageView) view.findViewById(R.id.objectName);
        ImageView objectImg = (ImageView) view.findViewById(R.id.objectImg);
        objectImg.setImageResource(categoryModels.getObjectImg());
        objectName.setImageResource(categoryModels.getObjectName());
        objectImg.setOnClickListener(view1 -> {
            SoundInterfare.playSound( categoryModels.getObjectSound(),getContext());
        });

        return view;
    }
}