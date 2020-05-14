package com.alaythiaproductions.recyclerviewwithmultipleviews.models;

public class Trip {

    private int tripImage;
    private String tripTitle, tripLength;

    public Trip(int tripImage, String tripTitle, String tripLength) {
        this.tripImage = tripImage;
        this.tripTitle = tripTitle;
        this.tripLength = tripLength;
    }

    public int getTripImage() {
        return tripImage;
    }

    public void setTripImage(int tripImage) {
        this.tripImage = tripImage;
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
    }

    public String getTripLength() {
        return tripLength;
    }

    public void setTripLength(String tripLength) {
        this.tripLength = tripLength;
    }
}
