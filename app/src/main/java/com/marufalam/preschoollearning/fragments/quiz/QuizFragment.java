package com.marufalam.preschoollearning.fragments.quiz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.marufalam.preschoollearning.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

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
            Navigation.findNavController(view1).navigate(R.id.action_quizFragment_to_alphabetFindQFragment);

        });
        wordMatch.setOnClickListener(view1 -> {
            Navigation.findNavController(view1).navigate(R.id.action_quizFragment_to_wordMatchingFragment);

        });
        return view;

    }
}