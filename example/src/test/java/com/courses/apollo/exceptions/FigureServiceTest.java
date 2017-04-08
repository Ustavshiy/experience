package com.courses.apollo.exceptions;

import com.courses.apollo.model.FigureService;
import com.courses.apollo.model.exception.FigureIllegalArgumentsEntered;
import com.courses.apollo.model.figure.Shape;
import com.courses.apollo.model.figure.Triangle;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 03.04.2017.
 */
public class FigureServiceTest {

    private FigureService figureService;

    @Before
    public void before() {
        figureService = new FigureService();
    }

//    @Test(expected = FigureIllegalArgumentsEntered.class)
//    public void testFigureService() {
//        Shape triangle = new Triangle(0.0);
//        figureService.getPerimeter(triangle);
//    }

//    @Test(expected = NullPointerException.class)
//    public void testIfFigureThrowException() {
//        Triangle triangle = new Triangle(10.00);
//        triangle.getArea();
//    }
}
