package com.implement;

import com.entity.Book;

import java.util.Scanner;

/**
 * Created by Lenovo on 2018/1/16.
 */
public class CountPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book;
        while (scanner.hasNext()){
            String name = scanner.next();
            float price = scanner.nextFloat();
            float discount = scanner.nextFloat();
            book = new Book(name, price, discount);
            float sell = price * discount;
            System.out.println("书名：" + book.getName() + "出售价格:" + sell);

        }
    }
    public static void countPrice(String name, float price, float discount){
        Book book = new Book(name, price, discount);
        float sell = price * discount;
        System.out.println("书名：" + book.getName() + "出售价格:" + sell);
    }
}
