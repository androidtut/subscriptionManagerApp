package com.example.subscriptionapp.models;

public class carddatatop {
    int image;
    String title,price,recentitem;

    public carddatatop(int image, String title, String price, String recentitem) {
        this.image = image;
        this.title = title;
        this.price = price;
        this.recentitem = recentitem;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRecentitem() {
        return recentitem;
    }

    public void setRecentitem(String recentitem) {
        this.recentitem = recentitem;
    }
}
