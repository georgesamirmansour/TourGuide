package com.example.gogos.tourguide;

/**
 * Created by gogos on 2017-10-31.
 */

public class DataResources {
    private String information;
    private int imageResource;

    public DataResources(String information, int imageResource) {
        this.information = information;
        this.imageResource = imageResource;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

}
