package com.courses.apollo;

import java.util.ArrayList;

public class ProductTestData {
        public static ArrayList<Product> getProductArrayList() {
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

    private static Product productOne = new Product(
            1,
            "Tomato",
            482862443,
            "MyGrandma (R)",
            10.5,
            120,
            2);
    private static Product productTwo = new Product(
            2,
            "Orange",
            482587654,
            "YourGrandpa (R)",
            15.68,
            200,
            6);
    private static Product productThree = new Product(
            3,
            "Potato",
            482658745,
            "Lukashenko (R)",
            0.68,
            365,
            10);
    private static Product productFour = new Product(
            4,
            "Banana",
            482587489,
            "BestNiggasFruits (R)",
            20.4,
            50,
            5);
    private static Product productFive = new Product(
            5,
            "Milk",
            482541247,
            "Yahotinske (R)",
            8.68,
            10,
            1);
    private static Product productSix = new Product(
            6,
            "Bacon",
            482658713,
            "Meat (R)",
            70.57,
            31,
            1);
    private static Product productSeven = new Product(
            7,
            "Bread",
            482578932,
            "Kiyv Hlib Zavod (R)",
            6.78,
            5,
            1);
    private static Product productEight = new Product(
            8,
            "Candy",
            482987654,
            "Ne slipnetsa (R)",
            30.57,
            365,
            50);
    private static Product productNine = new Product(
            9,
            "Cheese",
            482658713,
            "Happy Cow (R)",
            29.99,
            15,
            6);
    private static Product productTen = new Product(
            10,
            "Vodka",
            "Main Product (R)",
            60.98);
}
