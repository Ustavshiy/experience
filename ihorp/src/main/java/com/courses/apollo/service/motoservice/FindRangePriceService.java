package com.courses.apollo.service.motoservice;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Class with methods to find by price range.
 */
public final class FindRangePriceService {

    private FindRangePriceService() {}

    /**
     * This method finds the list of equipment by range of price.
     * @param motoEquipments List of equipments.
     * @param minPrice min price of range. Variable String type.
     * @param maxPrice max price of range. Variable String type.
     * @return the list of equipment.
     */
    public static ArrayList<MotoEquipment> findEquipmentByPriceRange(ArrayList<MotoEquipment> motoEquipments,
                                                                     String minPrice, String maxPrice) {
        BigDecimal min = new BigDecimal(minPrice);
        BigDecimal max = new BigDecimal(maxPrice);

        ArrayList<MotoEquipment> equipmentsByPriceRange = new ArrayList<>();
        for (MotoEquipment i : motoEquipments) {
            if (i.getPrice().compareTo(min) == 1 && i.getPrice().compareTo(max) == -1) {
                equipmentsByPriceRange.add(i);
            }
        }
        return equipmentsByPriceRange;
    }
}
