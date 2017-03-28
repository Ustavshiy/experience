package com.courses.apollo.data;

import com.courses.apollo.model.product.Product;

import java.util.ArrayList;

public class ProductTestData {

    public static ArrayList<Product> getProducts() {

        Product productOne = new Product(
                0, "Tomato", 482862443, "MyGrandma (R)", "10.5", 120, 2);
        Product productTwo = new Product(
                1, "Orange", 482587654, "YourGrandpa (R)", "15.68", 200, 6);
        Product productThree = new Product(
                2, "Potato", 482658745, "Lukashenko (R)", "0.68", 365, 10);
        Product productFour = new Product(
                3, "Banana", 482587489, "BestNiggasFruits (R)", "20.46", 50, 5);
        Product productFive = new Product(
                4, "Milk", 482541247, "Yahotinske (R)", "8.68", 10, 1);
        Product productSix = new Product(
                5, "Banana", 482658713, "CCC fruits (R)", "70.57", 50, 7);
        Product productSeven = new Product(
                6, "Bread", 482578932, "Kiyv Hlib Zavod (R)", "6.78", 5, 1);
        Product productEight = new Product(
                7, "Candy", 482987654, "Ne slipnetsa (R)","30.57", 365, 50);
        Product productNine = new Product(
                8, "Cheese", 482658713, "Happy Cow (R)", "29.99", 15, 6);
        Product productTen = new Product(
                9, "Vodka", "Main Product (R)", "60.98", 3650);

        ArrayList<Product> products = new ArrayList<>();
        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);
        products.add(productFour);
        products.add(productFive);
        products.add(productSix);
        products.add(productSeven);
        products.add(productEight);
        products.add(productNine);
        products.add(productTen);
        return products;
    }
}
