package com.courses.apollo.model.library;

import java.util.List;

/**
 * Created by Dell on 29.03.2017.
 */
public class Book {
    /**
     * Book title.
     */
    private String title;
    /**
     * List of readers.
     */
    private List<Reader> readers;

    private boolean isAvailable;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void addReaders(Reader reader) {
        this.readers.add(reader);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable() {
        isAvailable = true;
    }

    public void setUnavailable() {
        isAvailable = false;
    }
}
