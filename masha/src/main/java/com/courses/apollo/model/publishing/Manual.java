package com.courses.apollo.model.publishing;

/**
 * Manual, just a manual.
 */
public class Manual extends Book {

    /**
     * Themes of articles of this manual.
     */
    private String nameOfSubject;

    @Override
    public void sellToReseller() {
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }
}
