package com.courses.apollo.service.shop;

import com.courses.apollo.model.shop.Shop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShopServiceTest {

    Shop testShop = new Shop();
    ArrayList<Shop.Product> products = new ArrayList<>();

    @Before
    public void addData() {
        Shop.Product banana = testShop.new Product(false, "FruitDep", "Banana", "10.74");
        Shop.Product apple = testShop.new Product(false, "FruitDep", "Apple", "17.53");
        Shop.Product orange = testShop.new Product(false, "FruitDep", "Orange", "7.12");
        Shop.Product cutFruit = testShop.new Product(true, "ServiceDep", "Sharp knife", "0.99");
        Shop.Product washShirt = testShop.new Product(true, "ServiceDep", "TiotyaMotia wash", "29.99");

        ArrayList<Shop.Product> products = new ArrayList<>();
        products.add(banana);
        products.add(apple);
        products.add(orange);
        products.add(cutFruit);
        products.add(washShirt);

        testShop.setName("Billa");
        testShop.setAddress("Khreshatic str.");
        testShop.setProducts(products);
    }

    @Test
    public void testShopService() {
        ArrayList<Shop.Product> results = new ArrayList<>();
        Shop.Product result = new Shop().new Product(false, "FruitDep", "Orange", "7.12");
        results.add(result);
        BigDecimal minPrice = new BigDecimal(1);
        BigDecimal maxPrice = new BigDecimal(10);
        Assert.assertEquals(results, ShopService.findProduct(testShop, minPrice, maxPrice));
    }

}
