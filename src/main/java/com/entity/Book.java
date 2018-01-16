package com.entity;

/**
 * Created by Lenovo on 2018/1/16.
 */
public class Book {
    private String name;
    private float price;
    private boolean isNew;

    public Book(){}
    public Book(String name, float price, boolean isNew){
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
