package com.courses.apollo.service.collections;

import java.util.HashSet;

/**
 * Class for uniting and intersecting sets.
 */
public class UniteIntersectSets {

    /**
     * Method to unite two sets.
     */
    public <T> HashSet<T> uniteSets(HashSet<T> one, HashSet<T> two) {
        HashSet<T> united = new HashSet<>(one);
        united.addAll(two);
        return united;
    }

    /**
     * Method to intersect two sets.
     */
    public <T> HashSet<T> intersectSets(HashSet<T> one, HashSet<T> two) {
        HashSet<T> intersected = new HashSet<>(one);
        intersected.retainAll(two);
        return intersected;
    }
}