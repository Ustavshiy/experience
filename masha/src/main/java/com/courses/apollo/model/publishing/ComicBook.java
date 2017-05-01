package com.courses.apollo.model.publishing;

import java.util.ArrayList;

/**
 * Graphical fiction book.
 */
public class ComicBook extends Book {

    /**
     * Painters of the comics.
     */
    private ArrayList<String> painter;

    /**
     * Colored or b&w.
     */
    private boolean isColored;

    @Override
    public void sellToReseller() {
    }

    /**
     * get special comics illustrations of the text.
     */
    public void textToPicture() {
    }

    public ArrayList<String> getPainter() {
        return painter;
    }

    public void setPainter(ArrayList<String> painter) {
        this.painter = painter;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }
}
