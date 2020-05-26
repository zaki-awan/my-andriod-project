package com.example.eidalqatami;

public class ProductLayout {

    private int image;
    private String title, price, rating;

    public ProductLayout(int image, String title, String price, String rating) {
        this.image = image;
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }
}
