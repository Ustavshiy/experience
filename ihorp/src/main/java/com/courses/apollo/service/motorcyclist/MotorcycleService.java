package com.courses.apollo.service.motorcyclist;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * This class contains all methods of Motorcyclist task.
 */
public final class MotorcycleService {

    private MotorcycleService() {}

    /**
     * This method finds the list of equipment by range of price.
     * @param motoEquipments List of equipments.
     * @param minPrice min price of range. Variable String type.
     * @param maxPrice max price of range. Variable String type.
     * @return the list of equipment.
     */
    public static ArrayList<MotoEquipment> findEquipmentByPriceRange(ArrayList<MotoEquipment> motoEquipments,
                                                                     BigDecimal minPrice, BigDecimal maxPrice) {
        ArrayList<MotoEquipment> equipmentsByPriceRange = new ArrayList<>();
        for (MotoEquipment i : motoEquipments) {
            if (i.getPrice().compareTo(minPrice) == 1 && i.getPrice().compareTo(maxPrice) == -1) {
                equipmentsByPriceRange.add(i);
            }
        }
        return equipmentsByPriceRange;
    }

    /**
     * This methos sort a list of equipments by wight.
     * @param motoEquipments list of equipments.
     * @return sorted list of quipments by wight.
     */
    public static ArrayList<MotoEquipment> motoEquipmentSorter(ArrayList<MotoEquipment> motoEquipments) {
        for (int min = 0; min < motoEquipments.size() - 1; min++) {
            int least = min;
            for (int j = min + 1; j < motoEquipments.size(); j++) {
                if (motoEquipments.get(j).getWeight() < motoEquipments.get(least).getWeight()) {
                    least = j;
                    }
                }
            MotoEquipment tmp = motoEquipments.get(min);
            motoEquipments.set(min, motoEquipments.get(least));
            motoEquipments.set(least, tmp);
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
