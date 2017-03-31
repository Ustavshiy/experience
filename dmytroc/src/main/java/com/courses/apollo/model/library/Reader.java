package com.courses.apollo.model.library;

/**
 * Class Reader contains name of reader.
 */
public class Reader {
    /**
     * Name of reader.
     */
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
