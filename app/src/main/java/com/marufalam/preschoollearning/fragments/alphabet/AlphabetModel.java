package com.marufalam.preschoollearning.fragments.alphabet;

public class AlphabetModel {
    int capitalImg;
    int objectImg;
    int objectDetail;
    int alphaSound;
    int objectSound;


    public AlphabetModel() {
    }

    public AlphabetModel(int capitalImg, int objectImg, int objectDetail, int alphaSound, int objectSound) {
        this.capitalImg = capitalImg;
        this.objectImg = objectImg;
        this.objectDetail = objectDetail;
        this.alphaSound = alphaSound;
        this.objectSound = objectSound;
    }

    public int getCapitalImg() {
        return capitalImg;
    }

    public void setCapitalImg(int capitalImg) {
        this.capitalImg = capitalImg;
    }

    public int getObjectImg() {
        return objectImg;
    }

    public void setObjectImg(int objectImg) {
        this.objectImg = objectImg;
    }

    public int getObjectDetail() {
        return objectDetail;
    }

    public void setObjectDetail(int objectDetail) {
        this.objectDetail = objectDetail;
    }

    public int getAlphaSound() {
        return alphaSound;
    }

    public void setAlphaSound(int alphaSound) {
        this.alphaSound = alphaSound;
    }

    public int getObjectSound() {
        return objectSound;
    }

    public void setObjectSound(int objectSound) {
        this.objectSound = objectSound;
    }
}
