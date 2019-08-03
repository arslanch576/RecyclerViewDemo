package com.coderobust.android.recyclerviewdemo;

public class Toy {
    int image;
    String name;
    int price;
    String description;

    public Toy(int image, String name, int price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public Toy() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
