package com.example.slf.pulse_manager;

/**
 * Created by slf on 16/4/2.
 */
public class Medicine {
    private String name;
    private String description;
    private int image_shop;
    private int image_star;
    private String price;

    public Medicine(String name, String description, int image_shop, int image_star, String price) {
        this.name = name;
        this.description = description;
        this.image_shop = image_shop;
        this.image_star = image_star;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage_shop() {
        return image_shop;
    }

    public void setImage_shop(int image_shop) {
        this.image_shop = image_shop;
    }

    public int getImage_star() {
        return image_star;
    }

    public void setImage_star(int image_star) {
        this.image_star = image_star;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
