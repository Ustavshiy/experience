package com.courses.apollo.service.product;

import com.courses.apollo.model.product.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

/**
 * This class have til to find necessary object type "Product".
 */
public final class FindProductService {

    private FindProductService() {

    }

    /**
     * This method search a name in input list of objects type "Product" and output a list of Product
     * which contains this name.
     *
     * @param inputList is a List of objects type "Product" in which you need to do a search.
     * @param findName  This is name of Product what we are looking for.
     * @return List of Product contains name what we are looking for.
     */
    public static ArrayList<Product> findByName(ArrayList<Product> inputList, String findName) {
        ArrayList<Product> result = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (findName.equals(inputList.get(i).getName())) {
                result.add(inputList.get(i));
            }
        }
        return result;
    }

    /**
     * This method search a Product which coincides by name and costs no more than.
     *
     * @param inputList is a List of objects type "Product" in which you need to do a search.
     * @param findName  This is name of Product what we are looking for.
     * @param maxPrice  The maximum price that suits us.
     * @return List of Product contains name what we are looking for and with a price not exiting "maxPrice"
     */
    public static ArrayList<Product> findByNameAndPrice(ArrayList<Product> inputList,
                                                        String findName,
                                                        BigDecimal maxPrice) {
        ArrayList<Product> result = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).getPrice().compareTo(maxPrice) == 1
                    && Objects.equals(inputList.get(i).getName(), findName)) {
                result.add(inputList.get(i));
            }
        }
        return result;
    }

    /**
     * This method search a objects type "Product" with a minimal shelf life.
     *
     * @param inputList    is a List of objects type "Product" in which you need to do a search.
     * @param minShelfLife minimal quantity of shelf life.
     * @return List of Product with minimal quantity "minShelfLife"
     */
    public static ArrayList<Product> findByShelfLife(ArrayList<Product> inputList, Integer minShelfLife) {
        ArrayList<Product> result = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).getShelfLife() > minShelfLife) {
                result.add(inputList.get(i));
            }
        }
        return result;
    }
}
