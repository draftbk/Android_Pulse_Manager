package com.example.slf.pulse_manager;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by slf on 16/4/1.
 */
public class Shop {
    private String name;
    private String distance;
    private int image_shop;
    private int image_star;

    public Shop(String name, String distance, int image_shop, int image_star) {
        this.name = name;
        this.distance = distance;
        this.image_shop = image_shop;
        this.image_star = image_star;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
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
}
