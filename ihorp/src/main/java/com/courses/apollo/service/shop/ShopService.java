package com.courses.apollo.service.shop;

import com.courses.apollo.model.shop.Shop;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Some service to test shop class.
 */
public final class ShopService {

    private ShopService() {}

    /**
     * @param shop     object type Shop.
     * @param minPrice minimal price of Product.
     * @param maxPrice maximum price for product.
     * @return array of products.
     */
    public static ArrayList<Shop.Product> findProduct(Shop shop, BigDecimal minPrice, BigDecimal maxPrice) {
        ArrayList<Shop.Product> result = new ArrayList<>();
        for (Shop.Product i : shop.getProducts()) {
            if (minPrice.compareTo(i.getProductPrice()) == -1 && maxPrice.compareTo(i.getProductPrice()) == 1) {
                result.add(i);
            }
        }
        return result;
    }
}
