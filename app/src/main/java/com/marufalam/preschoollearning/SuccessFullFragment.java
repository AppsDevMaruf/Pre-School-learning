package com.marufalam.preschoollearning;


import static com.marufalam.preschoollearning.MainActivity.listofQ;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.marufalam.preschoollearning.fragments.quiz.QuizFragment;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.util.Objects;


public class SuccessFullFragment extends Fragment {
    CircularProgressBar progressBar;
    TextView resultText,Exit;
    LinearLayout sharebtn;
    ImageView backButton;

    int wonwrong,woncorrect;


    public SuccessFullFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_success_full, container, false);

        progressBar = view.findViewById(R.id.circularProgressBar);
        resultText = view.findViewById(R.id.resultText);
        sharebtn = view.findViewById(R.id.sharebtn);
        Exit = view.findViewById(R.id.ic_exit);
        backButton = view.findViewById(R.id.ic_back);


        woncorrect = getArguments().getInt("correct");
        wonwrong = getArguments().getInt("wrong");

        progressBar.setProgress(woncorrect);
        resultText.setText(woncorrect+"/"+listofQ.size());


        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    int won = woncorrect;
                    String shareMessage= "\nI Got "+won+" Out of " +listofQ.size()+" You Can Also try \n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch(Exception e) {
                    //e.toString();
                }
            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().finish();

            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireView()).navigate(R.id.action_successFullFragment_to_alphabetFindQFragment);
            }
        });
        return view;
    }
}