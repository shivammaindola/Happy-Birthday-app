package com.dheeraj.codelabs.mdc.java.shrine;

public class Model {

    private String title;

    private String image;

    public Model(String image, String title) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
