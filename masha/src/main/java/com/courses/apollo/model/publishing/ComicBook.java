package com.courses.apollo.model.publishing;

import java.util.ArrayList;
import java.util.List;

/**
 * Graphical fiction book.
 */
public class ComicBook extends Book {

    /**
     * Painters of the comics.
     */
    private List<String> painter;

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

    public List<String> getPainter() {
        return painter;
    }

    public void setPainter(List<String> painter) {
        this.painter = painter;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }
}
