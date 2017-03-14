package com.courses.apollo;

import java.util.ArrayList;
import org.junit.Test;

public class TestProductService {

    @Test
    public void TestProductName(){
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
}
