package com.courses.apollo.model.blackbox;

import java.util.Objects;
import java.util.TreeSet;

/**
 * Class BlackBox for collect Integers, automatically ascending sort and return N-s element.
 */
public class BlackBox {
    /**
     * TreeSet internal structure of BlackBox.
     */
    private TreeSet<Integer> blackbox;

    public BlackBox() {
        blackbox = new TreeSet<>();
    }

    /**
     * Method return size of BlackBox.
     *
     * @return Integer size.
     */
    public Integer getSize() {
        return blackbox.size();
    }

    /**
     * Method add new Integer to BlackBox.
     *
     * @param value value.
     */
    public void addElement(Integer value) {
        blackbox.add(value);
    }

    /**
     * Method returns N-s element in BlackBox by ascending.
     *
     * @param element number of element starting by 1.
     * @return value.
     */
    public Integer getIndex(Integer element) {
        Integer[] integerArray = new Integer[blackbox.size()];
        blackbox.toArray(integerArray);
        if (element <= integerArray.length) {
            return integerArray[element - 1];
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlackBox blackBox = (BlackBox) o;
        return Objects.equals(blackbox, blackBox.blackbox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blackbox);
    }
}