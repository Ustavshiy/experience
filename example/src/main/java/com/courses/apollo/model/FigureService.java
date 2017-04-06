package com.courses.apollo.model;

import com.courses.apollo.model.exception.FigureIllegalArgumentsEntered;
import com.courses.apollo.model.figure.Shape;

/**
 * Created by User on 03.04.2017.
 */
public class FigureService {

    public void getPerimeter(Shape shape) {
        try {
            shape.getPerimeter();
        }catch (Exception e) {
            throw new FigureIllegalArgumentsEntered();
        }
    }
}
