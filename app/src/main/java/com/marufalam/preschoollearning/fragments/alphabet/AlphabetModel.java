package com.marufalam.preschoollearning.fragments.alphabet;

public class AlphabetModel {
    int capitalImg;
    int smallImg;
    int objectImg;
    String objectDetail;

    public AlphabetModel() {
    }

    public AlphabetModel(int capitalImg, int smallImg, int objectImg, String objectDetail) {
        this.capitalImg = capitalImg;
        this.smallImg = smallImg;
        this.objectImg = objectImg;
        this.objectDetail = objectDetail;
    }

    public int getCapitalImg() {
        return capitalImg;
    }

    public void setCapitalImg(int capitalImg) {
        this.capitalImg = capitalImg;
    }

    public int getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(int smallImg) {
        this.smallImg = smallImg;
    }

    public int getObjectImg() {
        return objectImg;
    }

    public void setObjectImg(int objectImg) {
        this.objectImg = objectImg;
    }

    public String getObjectDetail() {
        return objectDetail;
    }

    public void setObjectDetail(String objectDetail) {
        this.objectDetail = objectDetail;
    }
}
