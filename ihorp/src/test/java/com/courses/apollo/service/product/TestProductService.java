package com.courses.apollo.service.product;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.courses.apollo.service.product.FindProductService;
import org.junit.Test;

import com.courses.apollo.model.product.Product;
import com.courses.apollo.data.ProductTestData;

public class TestProductService {

    @Test
    public void TestFindByName() {
        String searchName = "Banana";

        ArrayList<Product> answerList = new ArrayList();
        answerList.add(ProductTestData.getProducts().get(3));
        answerList.add(ProductTestData.getProducts().get(5));

        answerList.equals(FindProductService.findByName(ProductTestData.getProducts(), searchName));
    }

    @Test
    public void TestFindByNameAndPrice() {
        String searchName = "Banana";
        BigDecimal maxPrice = new BigDecimal(50);

        ArrayList<Product> answerList = new ArrayList();
        answerList.add(ProductTestData.getProducts().get(3));

        answerList.equals(FindProductService.findByNameAndPrice(ProductTestData.getProducts(), searchName, maxPrice));
    }

    @Test
    public void TestFindByShelfLife() {
        Integer shelfLifeFind = 364;

        ArrayList<Product> answerList = new ArrayList();
        answerList.add(ProductTestData.getProducts().get(2));
        answerList.add(ProductTestData.getProducts().get(7));
        answerList.add(ProductTestData.getProducts().get(9));

        answerList.equals(FindProductService.findByShelfLife(ProductTestData.getProducts(), shelfLifeFind));
    }
}
