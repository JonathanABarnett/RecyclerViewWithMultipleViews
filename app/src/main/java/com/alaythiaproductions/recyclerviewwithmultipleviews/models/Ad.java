package com.alaythiaproductions.recyclerviewwithmultipleviews.models;

public class Ad {

    private String adTitle, adDescription;

    public Ad(String adTitle, String adDescription) {
        this.adTitle = adTitle;
        this.adDescription = adDescription;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdDescription() {
        return adDescription;
    }

    public void setAdDescription(String adDescription) {
        this.adDescription = adDescription;
    }
}
