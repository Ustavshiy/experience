package com.courses.apollo.service.motorcyclist;

import com.courses.apollo.model.motorcyclist.Motorcyclist;
import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * This class contains all methods of Motorcyclist task.
 */
public class MotorcycleService {

    private MotorcycleService() {}

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

    /**
     * This methos sort a list of equipments by price.
     * @param motoEquipments list of equipments.
     * @return sorted list of quipments by price.
     */
    public static ArrayList<MotoEquipment> motoEquipmentSorter(ArrayList<MotoEquipment> motoEquipments) {

        for (int i = 1; i < motoEquipments.size(); i++) {
            for (int a = 1; a < motoEquipments.size(); a++) {
                if (motoEquipments.get(a - 1).getWeight() > motoEquipments.get(a).getWeight()) {
                    MotoEquipment tmp = motoEquipments.get(a - 1);
                    motoEquipments.set(a - 1, motoEquipments.get(a));
                    motoEquipments.set(a, tmp);
                }
            }
        }
        return motoEquipments;
    }

    /**
     * This method calculate a total price of all motorcyclist's staff.
     * @param motorcyclist is a Object type Motorcyclist.
     * @return a variable type BigDecimal.
     */
    public static BigDecimal totalEquipmentPrice(ArrayList<MotoEquipment> motorcyclist) {

        BigDecimal totalPrice = new BigDecimal("0.00");

        for (MotoEquipment motoEquipment : motorcyclist) {
            totalPrice = totalPrice.add(motoEquipment.getPrice());
        }

        return totalPrice;
    }
}
