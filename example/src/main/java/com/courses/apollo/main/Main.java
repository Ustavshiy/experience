package com.courses.apollo.main;

import com.courses.apollo.model.Student;
import com.courses.apollo.model.figure.AngleShape;
import com.courses.apollo.model.figure.Triangle;

/**
 * Created by User on 20.02.2017.
 */
public final class Main {

    private Main() {}

    /**
     * This is main method.
     * @param args strings array
     */
    public static void main(String[] args) {
        AngleShape triangle = new Triangle();
        triangle.doSomething();
    }
}
