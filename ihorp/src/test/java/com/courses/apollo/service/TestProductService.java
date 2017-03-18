package com.courses.apollo.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

import com.courses.apollo.model.Product;
import com.courses.apollo.ProductTestData;

public class TestProductService {

    @Test
    public void TestFindByName() {
        String searchName = "Banana";

        ArrayList<Product> answerList = new ArrayList();
        answerList.add(ProductTestData.getProducts().get(3));
        answerList.add(ProductTestData.getProducts().get(5));

        answerList.equals(FindProduct.findByName(ProductTestData.getProducts(), searchName));
    }

    @Test
    public void TestFindByNameAndPrice() {
        String searchName = "Banana";
        BigDecimal maxPrice = new BigDecimal(50);

        ArrayList<Product> answerList = new ArrayList();
        answerList.add(ProductTestData.getProducts().get(3));

        answerList.equals(FindProduct.findByNameAndPrice(ProductTestData.getProducts(), searchName, maxPrice));
    }

    @Test
    public void TestFindByShelfLife() {
        Integer shelfLifeFind = 364;

        ArrayList<Product> answerList = new ArrayList();
        answerList.add(ProductTestData.getProducts().get(2));
        answerList.add(ProductTestData.getProducts().get(7));
        answerList.add(ProductTestData.getProducts().get(9));

        answerList.equals(FindProduct.findByShelfLife(ProductTestData.getProducts(), shelfLifeFind));
    }
}
