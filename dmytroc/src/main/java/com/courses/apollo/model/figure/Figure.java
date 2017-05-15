package com.courses.apollo.model.figure;

import java.util.HashSet;

/**
 * Created by Dell on 15.05.2017.
 */
public class Figure {
    private HashSet<Pixel> figureSet;

    public Figure() {
    }

    public HashSet<Pixel> getFigureSet() {
        return figureSet;
    }

    public void setFigureSet(HashSet<Pixel> figureSet) {
        this.figureSet = figureSet;
    }

    public void addPixel (Pixel pixel){
        figureSet.add(pixel);
    }
}
