package com.courses.apollo;

import java.util.ArrayList;
import org.junit.Test;

public class TestProductService {

    @Test
    public void TestProductsName(){
        ArrayList<Product> testProdArray = ProductTestData.getProductArrayList();
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
        ArrayList<Product> testProducts = ProductTestData.getProductArrayList();
        ArrayList<Product> result = new ArrayList<>();
        final Double searchPrice = 10.0;

        for (int i = 0; i < testProducts.size(); i++){
            if(searchPrice >= testProducts.get(i).getPrice()){
                result.add(testProducts.get(i));
            }
        }
        System.out.println(result);
    }

//    @Test
//    public void TestProductsShelfLife(){
//        ArrayList<Product> testProducts = ProductTestData.getProductArrayList();
//        ArrayList<Product> result = new ArrayList<>();
//        final Double searchPrice = 10.0;
//
//        for (int i = 0; i < testProducts.size(); i++){
//            if(searchPrice >= testProducts.get(i).getPrice()){
//                result.add(testProducts.get(i));
//            }
//        }
//        System.out.println(result);
//    }
}
