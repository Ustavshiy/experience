package com.courses.apollo.model.computer;

import java.io.Serializable;

/**
 * Class RAM.
 */
public class RAM extends Memory implements Serializable {

    /**
     * Constructor.
     * @param size to indicate size of RAM.
     */
    public RAM(int size) {
        super(size);
    }
}
