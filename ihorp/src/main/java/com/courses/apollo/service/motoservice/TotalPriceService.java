package com.courses.apollo.service.motoservice;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Class with methods to calculate a total price of all motorcyclist's staff.
 */
public final class TotalPriceService {

    private TotalPriceService() {}

    /**
     * This method calculate a total price of all motorcyclist's staff.
     * @param motorcyclist is a Object type Motorcyclist.
     * @return a variable type BigDecimal.
     */
    public static BigDecimal totalEquipmentPrice(ArrayList<MotoEquipment> motorcyclist) {

        BigDecimal totalPrice = new BigDecimal(0.00);

        for (MotoEquipment motoEquipment : motorcyclist) {
            totalPrice = totalPrice.add(motoEquipment.getPrice());
        }

        return totalPrice;
    }
}
