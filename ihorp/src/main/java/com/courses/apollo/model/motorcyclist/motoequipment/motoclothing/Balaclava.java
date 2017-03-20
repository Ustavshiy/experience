package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

/**
 * This class made for constructor "Bandana"
 */
public class Balaclava extends MotoClothing {

    /**
     * Field identify is the Bandana has print of the Skeleton.
     */
    private boolean isSkeletonPrint;

    public Balaclava(String name, String price, double weight, String size, boolean isSkeletonPrint) {
        this.isSkeletonPrint = isSkeletonPrint;
    }

    public boolean isSkeletonPrint() {
        return isSkeletonPrint;
    }

    public void setSkeletonPrint(boolean skeletonPrint) {
        isSkeletonPrint = skeletonPrint;
    }
}
