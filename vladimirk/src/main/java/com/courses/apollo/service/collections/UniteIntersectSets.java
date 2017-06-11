package com.courses.apollo.service.collections;

import java.util.HashSet;

/**
 * Class for uniting and intersecting sets.
 */
public class UniteIntersectSets {

    /**
     * Method to unite two sets.
     */
    public HashSet<Integer> uniteSets(HashSet<Integer> one, HashSet<Integer> two) {
        HashSet<Integer> united = new HashSet<>();
        united.addAll(one);
        united.addAll(two);
        return united;
    }

    /**
     * Method to intersect two sets.
     */
    public HashSet<Integer> intersectSets(HashSet<Integer> one, HashSet<Integer> two) {
        HashSet<Integer> intersected = new HashSet<>();
        intersected.addAll(one);
        intersected.retainAll(two);
        return intersected;
    }

}