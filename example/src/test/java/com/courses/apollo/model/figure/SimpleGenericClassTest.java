package com.courses.apollo.model.figure;

import com.courses.apollo.model.SimpleGenericClass;
import org.junit.Test;

/**
 * Created by User on 27.04.2017.
 */
public class SimpleGenericClassTest {

    @Test
    public void testExtends() {
        Square square = new Square(10);
        Triangle triangle = new Triangle(10.00, 10.00, 10.00);
        SimpleGenericClass simpleGenericClass = new SimpleGenericClass("1", triangle);
        simpleGenericClass.returnSomeShape(new Shape() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        });
        simpleGenericClass.returnSomeShape(triangle, square);
    }
}
