package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.LineModel;

/**
 * Created by chopenkod on 11.03.17.
 */
public class StraightUtilsTestData {

    public static LineModel getStraightModel() {
        return new LineModel(new Fraction(-2, -1, 1, 3));
    }

    public static LineModel[] getStraightModelArray() {
        return new LineModel[]{new LineModel(new Fraction(-2, -1, 1, 3)),
                new LineModel(new Fraction(3, 5, -1, 3)),
                new LineModel(new Fraction(2, 2, -1, 2)),
                new LineModel(new Fraction(-2, 4, -3, -3))};
    }

    public static LineModel[] expextedResltParallelFinder() {
        return new LineModel[]{new LineModel(new Fraction(-2, -1, 1, 3)),
                new LineModel(new Fraction(3, 5, -1, 3))};
    }

    public static Fraction[] expextedResltcoordinatsCrossingFinderTest() {
        return new Fraction[]{new Fraction(-2.5, 0, 0, 5),
                new Fraction(3.5, 0, 0, -7),
                new Fraction(2, Double.POSITIVE_INFINITY, 0, Double.POSITIVE_INFINITY),
                new Fraction(Double.POSITIVE_INFINITY, 0, Double.POSITIVE_INFINITY, -3),};
    }
}
