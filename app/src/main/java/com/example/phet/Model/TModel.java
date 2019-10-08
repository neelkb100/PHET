package com.example.phet.Model;

public class TModel {


    private int id;
    private String title;
    private String date;
    private double rating;
    private double price;
    private int image;

    public TModel(int id, String title, String date, double rating, double price, int image) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
