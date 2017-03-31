package com.courses.apollo.model.library;

/**
 * Enum Book contain all books in library.
 */
public enum Book {
    /**
     * Book Anna Karenina.
     */
    ANNA_KARENINA(true),
    /**
     * Book Madame Bovary.
     */
    MADAME_BOVARY(true),
    /**
     * Book War and peace.
     */
    WAR_AND_PEACE(true),
    /**
     * Book Great Gatsby.
     */
    GREAT_GATSBY(true);
    /**
     * Is book available.
     */
    private boolean isAvailable;

    Book(boolean b) {
    }

    /**
     * Check book status.
     *
     * @return boolean.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Set book status to available.
     */
    public void setAvailable() {
        isAvailable = true;
    }

    /**
     * Set book status to Unavailable.
     */
    public void setUnavailable() {
        isAvailable = false;
    }
}
