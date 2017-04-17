package com.courses.apollo.service.shop;

import com.courses.apollo.model.shop.Shop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShopServiceTest {

    Shop billa = new Shop();
    Shop.Department fruitDep = billa.new Department();
    Shop.Department clothingDep = billa.new Department();
    Shop.Department alcoholDep = billa.new Department();

    @Before
    public void testShop() {
        Shop.Department.Product banana = new Shop(). new Department(). new Product("Nigeria Bananas (c)", "17.45");
        Shop.Department.Service packFruit = new Shop().new Department().new Service("Billa (c)", "0.51");
        fruitDep.setDepartmentName("Fruits Dep");
        fruitDep.setProduct(banana);
        fruitDep.setService(packFruit);

        Shop.Department.Product shirt = new Shop().new Department().new Product("Zara (c)", "299.99");
        Shop.Department.Service washClothes = new Shop().new Department().new Service("Billa Wash", "15.57");
        clothingDep.setDepartmentName("Clothing Dep");
        clothingDep.setProduct(shirt);
        clothingDep.setService(washClothes);

        Shop.Department.Product vodka = new Shop().new Department().new Product("Hortica", "49.99");
        Shop.Department.Service detoxication = new Shop().new Department().new Service("Ogur4ik", "99.99");
        alcoholDep.setDepartmentName("Alkohol Dep");
        alcoholDep.setProduct(vodka);
        alcoholDep.setService(detoxication);

        billa.setName("Billa");
        billa.setAddress("Khreshatic str.");
        billa.setDepartments(fruitDep);
        billa.setDepartments(clothingDep);
        billa.setDepartments(alcoholDep);
    }

    @Test
    public void testShopService() {
        Assert.assertEquals(fruitDep, ShopService.cheapestDepartment(billa));
    }


}
