package com.courses.apollo.model.figure;

import java.util.HashSet;
import java.util.Set;

/**
 * Class contains set of pixels in figure.
 */
public class Figure {
    /**
     * Set of Pixels in Figure.
     */
    private Set<Pixel> figureSet = new HashSet<>();

    public Figure() {
    }

    public Set<Pixel> getFigureSet() {
        return figureSet;
    }

    /**
     * Method add new Pixel to Figure.
     * @param pixel pixel.
     */
    public void addPixel(Pixel pixel) {
        figureSet.add(pixel);
    }
}
