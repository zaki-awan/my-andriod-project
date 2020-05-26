package com.example.eidalqatami;

public class Model_Womens_Perfume {

    private int image;
    private String price,productsold,soldfigure;

    public Model_Womens_Perfume(int image, String price, String productsold, String soldfigure) {
        this.image = image;
        this.price = price;
        this.productsold = productsold;
        this.soldfigure = soldfigure;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public String getProductsold() {
        return productsold;
    }

    public String getSoldfigure() {
        return soldfigure;
    }
}
