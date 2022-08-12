package com.marufalam.preschoollearning.fragments;

public class CategoryModels {
    int ObjectName;
    int ObjectImg;
    int ObjectSound;

    public CategoryModels() {
    }

    public CategoryModels(int objectImg, int objectSound) {
        ObjectImg = objectImg;
        ObjectSound = objectSound;
    }

    public CategoryModels(int objectName, int objectImg, int objectSound) {
        ObjectName = objectName;
        ObjectImg = objectImg;
        ObjectSound = objectSound;
    }

    public int getObjectName() {
        return ObjectName;
    }

    public void setObjectName(int objectName) {
        ObjectName = objectName;
    }

    public int getObjectImg() {
        return ObjectImg;
    }

    public void setObjectImg(int objectImg) {
        ObjectImg = objectImg;
    }

    public int getObjectSound() {
        return ObjectSound;
    }

    public void setObjectSound(int objectSound) {
        ObjectSound = objectSound;
    }
}
