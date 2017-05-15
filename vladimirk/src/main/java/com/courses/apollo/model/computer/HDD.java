package com.courses.apollo.model.computer;

import java.io.Serializable;

/**
 * Class HDD.
 */
public class HDD extends Memory implements Serializable {

    /**
     * Constructor.
     * @param size to indicate size of HDD.
     */
    public HDD(int size) {
        super(size);
    }
}