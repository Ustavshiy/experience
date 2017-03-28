package com.courses.apollo.service;

import com.courses.apollo.model.motorcyclist.Equipment;
import com.courses.apollo.model.motorcyclist.Motorcyclist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by vladimirk on 26.03.17.
 */
public class MotorcyclistService {

    /**
     * Method that return boolean true if motorcyclist equiped.
     * @param motorcyclist indicate motorcyclist.
     * @return isEquip - boolean variable to indicate if motorcyclist equiped.
     */
    public boolean equip(Motorcyclist motorcyclist) {
        motorcyclist.setIsEquiped(true);
        return motorcyclist.getIsEquiped();
    }

    /**
     * Method that return sum of price of all equipments.
     * @param equipments indicate list of equipments.
     * @return sum - sum of price of all equipments.
     */
    public int sumPrice(List<Equipment> equipments) {
        int sum = 0;
        for (int i = 0; i < equipments.size(); i++) {
            sum = sum + equipments.get(i).getPrice();
        }
        return sum;
    }

    /**
     * Method that return list of all equipments sorted by weight.
     * @param equipments indicate list of equipments.
     * @return equipments sorted by weight.
     */
    public List sortEquipByWeight(List<Equipment> equipments) {
        equipments.sort(Comparator.comparing(Equipment::getWeight));
        return equipments;
    }

    /**
     * Method that return list of all equipments in needed price range.
     * @param equipments indicate list of equipments.
     * @param minPrice indicate given needed minimal price.
     * @param maxPrice indicate given needed maximum price.
     * @return equipments sorted by weight.
     */
    public List findEquipInPriceRange(List<Equipment> equipments, int minPrice, int maxPrice) {
        List findedEquipInPriceRange = new ArrayList<>();
        for (int i = 0; i < equipments.size(); i++) {
            int price = equipments.get(i).getPrice();
            if (price > minPrice && price < maxPrice) {
                findedEquipInPriceRange.add(equipments.get(i));
            }
        }
        return findedEquipInPriceRange;
    }
}
