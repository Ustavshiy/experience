package com.courses.apollo.model.computer;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class Memory for all memory devices.
 */
public class Memory implements Serializable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Memory)) return false;
        Memory memory = (Memory) o;
        return size == memory.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
