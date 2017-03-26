package com.courses.apollo.model.computer;

/**
 * Class Memory for all memory devices.
 */
public class Memory {

    /**
     * @param size indicate size of Memory components in megabytes.
     */
    private int size;

    public int getSize() {
        return size;
    }

    /**
     * Constructor.
     * @param size to indicate size of Memory device.
     */
    public Memory(int size) {
        this.size = size;
    }
}
