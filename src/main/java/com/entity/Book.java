package com.entity;

/**
 * Created by Lenovo on 2018/1/16.
 */
public class Book {
    private String name;
    private float price;
    private float discount;

    public Book(){}
    public Book(String name, float price, float discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
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

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
