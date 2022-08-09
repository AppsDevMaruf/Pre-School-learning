package com.marufalam.preschoollearning.fragments.quiz;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.marufalam.preschoollearning.R;

public class QuizFragment extends Fragment {
ImageView findOut,wordMatch;


    public QuizFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        findOut = view.findViewById(R.id.findOut);
        wordMatch = view.findViewById(R.id.wordMatching);
        findOut.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_quizFragment_to_findOutFragment);

        });
        wordMatch.setOnClickListener(view1 -> {
            Navigation.findNavController(view1).navigate(R.id.action_quizFragment_to_wordMatchingFragment);

        });
        return view;

    }
}