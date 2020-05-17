package com.example.mytourguideaplication;

public class DataClass {

    int cityName;
    int cityDescription;
    int images;

    public DataClass(int cityName, int cityDescription, int images) {
        this.cityName = cityName;
        this.cityDescription = cityDescription;
        this.images = images;
    }

    public int getCityName() {
        return cityName;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }

    public int getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(int cityDescription) {
        this.cityDescription = cityDescription;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
