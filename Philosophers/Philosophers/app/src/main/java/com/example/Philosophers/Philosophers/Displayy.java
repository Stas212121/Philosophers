package com.example.Philosophers.Philosophers;


public class Displayy {

    private int imageview;
    private String title;
    private String description;
    private String year;

    Displayy(int imageview, String title, String description, String year) {

        this.imageview = imageview;
        this.title = title;
        this.description = description;
        this.year = year;

    }

    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    public int getImageview() {
        return imageview;
    }

    public int setImageview(int imageview) {
        this.imageview = imageview;
        return Integer.parseInt(String.valueOf(imageview));
    }

    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    public void setYear(String year) {
        this.year = year;
    }
    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////


}