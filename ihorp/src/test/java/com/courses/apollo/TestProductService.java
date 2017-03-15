package com.courses.apollo;

import java.util.ArrayList;
import com.courses.apollo.model.Product;
import org.junit.Test;

public class TestProductService {

    @Test
    public void TestProductsName(){
        ArrayList<Product> testProdArray = ProductTestData.getProducts();
        ArrayList<Product> result = new ArrayList<>();
        final String searchName = "Banana";

        for (int i = 0; i < testProdArray.size(); i++){
            if(searchName.equals(testProdArray.get(i).getName())){
                result.add(testProdArray.get(i));
            }
        }
        System.out.println(result);
    }

    @Test
    public void TestProductsPrice(){
        ArrayList<Product> testProducts = ProductTestData.getProducts();
        ArrayList<Product> result = new ArrayList<>();
        final Double searchPrice = 10.0;

        for (int i = 0; i < testProducts.size(); i++){
            if(searchPrice >= testProducts.get(i).getPrice()){
                result.add(testProducts.get(i));
            }
        }
        System.out.println(result);
    }

    @Test
    public void TestProductsShelfLife(){
        ArrayList<Product> testProducts = ProductTestData.getProducts();
        ArrayList<Product> result = new ArrayList<>();
        final Integer searchShelfLife = 200;

        for (int i = 0; i < testProducts.size(); i++){
            if(testProducts.get(i).getShelfLife() == null){
                continue;
            }
            if(searchShelfLife <= testProducts.get(i).getShelfLife()){
                result.add(testProducts.get(i));
            }
        }
        System.out.println(result);
    }
}
