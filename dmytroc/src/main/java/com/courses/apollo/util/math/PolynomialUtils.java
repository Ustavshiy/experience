package com.courses.apollo.util.math;

import com.courses.apollo.model.math.Polynomial;

/**
 * Class for RationalFraction logic.
 * Определить класс Полином c коэффициентами типа Рациональная Дробь.
 * Объявить массив/список/множество из n полиномов и определить сумму полиномов массива.
 * 2.Определить класс Прямая на плоскости (в пространстве),
 * параметры кото- рой задаются с помощью Рациональной Дроби.
 * Определить точки пересе- чения прямой с осями координат.
 * Определить координаты пересечения двух прямых.
 * Создать массив/список/множество объектов и определить группы параллельных прямых.
 */
public class PolynomialUtils {

    /**
     * Find sum of Polynomial array. PolynomialFirst+...+PolynomialLast.
     *
     * @param polynomialArray input RationalFraction array.
     * @return calculated sum.
     */
    public double polynomialSum(Polynomial[] polynomialArray) {
        double result = 0;
        for (Polynomial polynomial : polynomialArray) {
            result += polynomial.getPolynomialResult();
        }
        return result;
    }
}