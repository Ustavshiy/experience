package com.courses.apollo.model.motorcyclist.motoequipment.motoclothing;

import java.util.Objects;

/**
 * This class made for constructor "Bandana".
 */
public class Balaclava extends MotoClothing {

    /**
     * Field identify is the Bandana has print of the Skeleton.
     */
    private boolean isSkeletonPrint;

    public Balaclava(String name, String price, double weight, String size, boolean isSkeletonPrint) {
        super(name, price, weight, size);
        this.isSkeletonPrint = isSkeletonPrint;
    }

    public boolean isSkeletonPrint() {
        return isSkeletonPrint;
    }

    public void setSkeletonPrint(boolean skeletonPrint) {
        isSkeletonPrint = skeletonPrint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Balaclava)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Balaclava balaclava = (Balaclava) o;
        return isSkeletonPrint == balaclava.isSkeletonPrint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSkeletonPrint);
    }
}
