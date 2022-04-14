package com.example.android2hw5.model;

public class BoardModel {
    private String lottie;
    private String description;
    private  String nextBtn;

    public String getNextBtn() {
        return nextBtn;
    }

    public String getLottie() {
        return lottie;
    }

    public String getDescription() {
        return description;
    }



    public BoardModel(String lottie, String description, String nextBtn) {
        this.lottie = lottie;
        this.description = description;
        this.nextBtn = nextBtn;
    }
}
