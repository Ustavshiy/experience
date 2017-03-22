package com.courses.apollo.service.motorcyclist;

import com.courses.apollo.model.motorcyclist.motoequipment.MotoEquipment;

import java.util.ArrayList;

/**
 * Class with methods to sort a list of equipments.
 */
public final class MotoEquipmentSorterService {

    private MotoEquipmentSorterService() {}

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
}
