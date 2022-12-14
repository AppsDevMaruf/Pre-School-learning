package com.marufalam.preschoollearning.fragments.quiz;


public class QuestionModels {
    String Question, oA, oB, oC, oD, ans;

    public QuestionModels() {
    }

    public QuestionModels(String question, String oA, String oB, String oC, String oD, String ans) {
        Question = question;
        this.oA = oA;
        this.oB = oB;
        this.oC = oC;
        this.oD = oD;
        this.ans = ans;
    }


    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getoA() {
        return oA;
    }

    public void setoA(String oA) {
        this.oA = oA;
    }

    public String getoB() {
        return oB;
    }

    public void setoB(String oB) {
        this.oB = oB;
    }

    public String getoC() {
        return oC;
    }

    public void setoC(String oC) {
        this.oC = oC;
    }

    public String getoD() {
        return oD;
    }

    public void setoD(String oD) {
        this.oD = oD;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "QuestionModels{" +
                "Question='" + Question + '\'' +
                ", oA='" + oA + '\'' +
                ", oB='" + oB + '\'' +
                ", oC='" + oC + '\'' +
                ", oD='" + oD + '\'' +
                ", ans='" + ans + '\'' +
                '}';
    }
}

