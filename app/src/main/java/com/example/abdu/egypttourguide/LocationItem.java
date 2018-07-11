package com.example.abdu.egypttourguide;

public class LocationItem {
    private String name;
    private int imageResourceID;
    private String details;

    LocationItem(String name, String details, int imageResourceID) {
        this.name = name;
        this.details = details;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResourceID() {
        return this.imageResourceID;
    }

    public String getDetails() {
        return this.details;
    }
}
