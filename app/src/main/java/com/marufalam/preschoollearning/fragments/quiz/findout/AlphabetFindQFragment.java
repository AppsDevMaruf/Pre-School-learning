package com.marufalam.preschoollearning.fragments.quiz.findout;


import static com.marufalam.preschoollearning.fragments.quiz.QuizFragment.listofQ;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.marufalam.preschoollearning.MainActivity;
import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.quiz.QuestionModels;
import com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.security.auth.login.LoginException;


public class AlphabetFindQFragment extends Fragment implements View.OnClickListener {
    CountDownTimer countDownTimer;
    int timervalue = 120;
    RoundedHorizontalProgressBar progressBar;
    List<QuestionModels> allQuestionList;
    QuestionModels modelClass;
    int index = 0;
    int correctCount = 0, wrongCount = 0;
    TextView card_question, dexit, showTime;

    CardView cardOA, cardOB, cardOC, cardOD;
    MaterialButton nextbtn;
    ImageView optiona, dbackButton, optionb, optionc, optiond;
    long MillisecondTime, TimeBuff, UpdateTime = 0L;
    int Seconds, Minutes, MilliSeconds;


    public AlphabetFindQFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_alphabet_find_q, container, false);
        Hooks(view);

        allQuestionList = listofQ;
        Collections.shuffle(allQuestionList);
        modelClass = listofQ.get(index);
        nextbtn.setClickable(false);
        countDownTimer = new CountDownTimer(120000, 1000) {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onTick(long millisUntilFinished) {
                timervalue = timervalue - 1;
                progressBar.setProgress(timervalue);

                MillisecondTime = millisUntilFinished;

                UpdateTime = TimeBuff + MillisecondTime;

                Seconds = (int) (UpdateTime / 1000);

                Minutes = Seconds / 60;

                Seconds = Seconds % 60;

                MilliSeconds = (int) (UpdateTime % 1000);

                showTime.setText("0" + Minutes + ":" + String.format("%02d", Seconds));

            }

            @Override
            public void onFinish() {
                Dialog dialog = new Dialog(getActivity(), R.style.Dialog);
                dialog.setContentView(R.layout.time_out_dialog);
                WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                lp.dimAmount = 0.0F;
                lp.screenBrightness = 1.0F;
                getActivity().getWindow().setAttributes(lp);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                dialog.getWindow().findViewById(R.id.tryagainbtn).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       /* Intent intent = new Intent(DashboardActivity.this, SplashActivity.class);
                        startActivity(intent);*/
                    }
                });
                dialog.show();
            }
        }.start();
        setAllData();

        return view;
    }

    private void Hooks(View view) {

        progressBar = view.findViewById(R.id.progress_bar);
        card_question = view.findViewById(R.id.card_question);

        optiona = view.findViewById(R.id.card_questiona);
        optionb = view.findViewById(R.id.card_questionb);
        optionc = view.findViewById(R.id.card_questionc);
        optiond = view.findViewById(R.id.card_questiond);


        cardOA = view.findViewById(R.id.CardA);
        cardOA.setOnClickListener(this);
        cardOB = view.findViewById(R.id.CardB);
        cardOB.setOnClickListener(this);
        cardOC = view.findViewById(R.id.CardC);
        cardOC.setOnClickListener(this);
        cardOD = view.findViewById(R.id.CardD);
        cardOD.setOnClickListener(this);

        nextbtn = view.findViewById(R.id.next_btn);
        showTime = view.findViewById(R.id.showTime);

        //dexit = view.findViewById(R.id.dexit);
        //dbackButton = view.findViewById(R.id.dback);
       /* dexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //back button
            }
        });
        dbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(DashboardActivity.this,SplashActivity.class));
            }
        });*/

    }

    private void setAllData() {
        card_question.setText(modelClass.getQuestion());
        Picasso.get().load(modelClass.getoA()).into(optiona);
        Picasso.get().load(modelClass.getoB()).into(optionb);
        Picasso.get().load(modelClass.getoC()).into(optionc);
        Picasso.get().load(modelClass.getoD()).into(optiond);


    }

    public void Correct(CardView cardOption) {
        cardOption.setCardBackgroundColor(getResources().getColor(R.color.green));

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctCount++;
                index++;
                modelClass = listofQ.get(index);
                setAllData();
                resetColor();
                enableButton();
            }
        });


    }


    public void Wrong(CardView cardOption) {
        cardOption.setCardBackgroundColor(getResources().getColor(R.color.red));
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongCount++;
                if (index < listofQ.size() - 1) {
                    index++;
                    modelClass = listofQ.get(index);
                    setAllData();
                    resetColor();
                    enableButton();
                } else {
                    GameWon();
                }
            }
        });

    }

    private void GameWon() {
       /* Toast.makeText(getActivity(), "Game is On", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(AlphabetFindQFragment.this, MainActivity.class);
        intent.putExtra("correct", correctCount);
        intent.putExtra("wrong", wrongCount);
        startActivity(intent);*/
    }

    public void enableButton() {
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);
    }

    public void disableButton() {
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);
    }

    public void resetColor() {
        cardOA.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setCardBackgroundColor(getResources().getColor(R.color.white));
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CardA:
                disableButton();
                nextbtn.setClickable(true);
                Toast.makeText(getActivity(), "Clicked A", Toast.LENGTH_SHORT).show();
                if (modelClass.getoA().equals(modelClass.getAns())) {
                    cardOA.setCardBackgroundColor(getResources().getColor(R.color.green));
                    if (index < listofQ.size() - 1) {
                        Correct(cardOA);
                    } else {
                        GameWon();
                    }

                } else {
                    Wrong(cardOA);
                }
                break;
            case R.id.CardB:
                disableButton();
                nextbtn.setClickable(true);
                Toast.makeText(getActivity(), "Clicked B", Toast.LENGTH_SHORT).show();
                if (modelClass.getoB().equals(modelClass.getAns())) {
                    cardOB.setCardBackgroundColor(getResources().getColor(R.color.green));
                    if (index < listofQ.size() - 1) {
                        Correct(cardOB);
                    } else {
                        GameWon();
                    }

                } else {
                    Wrong(cardOB);
                }
                break;
            case R.id.CardC:
                disableButton();
                nextbtn.setClickable(true);
                Toast.makeText(getActivity(), "Clicked C", Toast.LENGTH_SHORT).show();
                if (modelClass.getoC().equals(modelClass.getAns())) {
                    cardOC.setCardBackgroundColor(getResources().getColor(R.color.green));
                    if (index < listofQ.size() - 1) {
                        Correct(cardOC);
                    } else {
                        GameWon();
                    }

                } else {
                    Wrong(cardOC);
                }
                break;
            case R.id.CardD:
                disableButton();
                nextbtn.setClickable(true);
                Toast.makeText(getActivity(), "Clicked D", Toast.LENGTH_SHORT).show();
                if (modelClass.getoD().equals(modelClass.getAns())) {
                    cardOD.setCardBackgroundColor(getResources().getColor(R.color.green));
                    if (index < listofQ.size() - 1) {
                        Correct(cardOD);
                    } else {
                        GameWon();
                    }

                } else {
                    Wrong(cardOD);
                }
                break;
            default:
                break;
        }
    }
}

