package com.courses.apollo.service.shop;

import com.courses.apollo.model.shop.Shop;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Some service to test shop class.
 */
public class ShopService {

    /**
     * Method identify the most cheapest department in shop.
     *
     * @param billa is a object type Shop.
     * @return Department
     */
    public static Shop.Department cheapestDepartment(Shop billa) {

        ArrayList<BigDecimal> averageDepartmentPrices;
        averageDepartmentPrices = getAveragePrices(billa);

        BigDecimal minPrice;
        minPrice = averageDepartmentPrices.get(0);
        int indexMinPrice = 0;

        for (int i = 1; i < averageDepartmentPrices.size(); i++) {
            if (minPrice.compareTo(averageDepartmentPrices.get(i)) == 1) {
                indexMinPrice = i;
                minPrice = averageDepartmentPrices.get(i);
            }
        }
        return billa.getDepartments().get(indexMinPrice);
    }

    /**
     * This method find the average price for each of the department and return the list of average prices.
     *
     * @param fozzy is object type shop.
     * @return list of average prices.
     */
    private static ArrayList<BigDecimal> getAveragePrices(Shop fozzy) {

        ArrayList<BigDecimal> averagePrices = new ArrayList<>();

        for (int i = 0; i < fozzy.getDepartments().size(); i++) {

            Shop.Department tmpDepartment = fozzy.getDepartments().get(i);
            BigDecimal totalPrice = new BigDecimal(0.00);

            for (Shop.Department.Product tmpProduct : tmpDepartment.getProducts()) {
                totalPrice = totalPrice.add(tmpProduct.getProductPrice());
            }

            for (Shop.Department.Service tmpService : tmpDepartment.getServices()) {
                totalPrice = totalPrice.add(tmpService.getServicePrice());
            }

            BigDecimal quantity = new BigDecimal(
                    fozzy.getDepartments().get(i).getProducts().size()
                            + fozzy.getDepartments().get(i).getServices().size());
            averagePrices.add(totalPrice.divide(quantity));
        }
        return averagePrices;
    }


}
