package com.courses.apollo.model.library;

import java.util.List;

/**
 * Created by Dell on 29.03.2017.
 */
public enum Books {
    ANNA_KARENINA(null, true), MADAME_BOVARY(null, true), WAR_AND_PEACE(null, true), GREAT_GATSBY(null, true);
    private List<Reader> readers;
    private boolean isAvailable;

    Books(List<Reader> readers, boolean b) {
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
