package com.courses.apollo.model.motorcyclist;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Motorcyclist.
 */
public class Motorcyclist {

    /**
     * @param equipments indicate list of equipments.
     */
    private List<Equipment> equipments = new ArrayList<>();

    /**
     * @param isEquiped to indicate is the motorcyclist equipped.
     */
    private boolean isEquiped;

    public boolean getIsEquiped() {
        return isEquiped;
    }

    public void setIsEquiped(boolean isEquiped) {
        this.isEquiped = isEquiped;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public Motorcyclist(List<Equipment> equipments, boolean isEquiped) {
        this.equipments = equipments;
        this.isEquiped = isEquiped;
    }
}
