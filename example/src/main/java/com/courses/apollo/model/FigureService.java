package com.courses.apollo.model;

import com.courses.apollo.model.exception.FigureIllegalArgumentsEntered;
import com.courses.apollo.model.figure.Shape;

/**
 * Created by User.
 */
public class FigureService {

    /**
     * Example how you can catch an exception and return "FigureIllegalArgumentsEntered".
     * @param shape is a figure.
     */
    public void getPerimeter(Shape shape) {
        try {
            shape.getPerimeter();
        } catch (Exception e) {
            throw new FigureIllegalArgumentsEntered();
        }
    }
}
