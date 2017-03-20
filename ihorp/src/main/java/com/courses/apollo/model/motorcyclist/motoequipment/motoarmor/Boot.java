package com.courses.apollo.model.motorcyclist.motoequipment.motoarmor;

/**
 * This class made for constructor "Boots"
 */
public class Boot extends MotoArmor{

    /**
     * Field identify is this Boots has a quick off system.
     */
    private boolean quickTakeOff;

    public Boot(String name, String price, double weight, int protectionClass, boolean quikTakeOff) {
        this.quickTakeOff = quikTakeOff;
    }

    public boolean isQuikTakeOff() {
        return quickTakeOff;
    }

    public void setQuikTakeOff(boolean quikTakeOff) {
        this.quickTakeOff = quikTakeOff;
    }
}
