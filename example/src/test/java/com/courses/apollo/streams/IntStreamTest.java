package com.courses.apollo.streams;


import com.courses.apollo.model.annotation.MyOwnJunitTest;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;


public class IntStreamTest {

    public static void main(String[] args) throws Exception {
        IntStreamTest intStreamTest = new IntStreamTest();
        Class clazz = intStreamTest.getClass();
        Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Annotation[] annotations = methods[i].getAnnotations();
            for (int j = 0; j < annotations.length; j++) {
                if(annotations[j] instanceof Test) {
                    methods[i].invoke(intStreamTest);
                }
            }
        }


        IntStreamTest streamTest = new IntStreamTest();
        Stream.of(IntStreamTest.class.getMethods())
                .flatMap(method -> Stream.of(method.getAnnotations())
                        .filter(a -> a instanceof MyOwnJunitTest).map(a -> method))
                .forEach(m -> {
                    try {
                        m.invoke(streamTest);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }

    @MyOwnJunitTest(s = "test")
    public void myOwnJunitTest() {
        System.out.println("Hello Bogdan!");
    }

    @MyOwnJunitTest(s = "test")
    public void myOwnJunitTestTwo() {
        System.out.println("Hello Dmytro!");
    }

    public void testImperativeFibonacci() {
        int prev = 0;
        int next = 1;
        int sum;
        for (int i = 2; i < 10; ++i) {
            sum = prev + next;
            System.out.print(" " + sum);
            prev = next;
            next = sum;
        }
    }

    @Test
    public void testDeclarative() {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(t -> System.out.print(t[1] + ","));

        IntStream.generate(() -> 1)
                .limit(5)
                .forEach(System.out::println);
    }

    @Test
    public void testMultiArray() {
        int[][] array = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Arrays.stream(array).flatMapToInt(Arrays::stream).forEach(System.out::println);
        //transpose().apply(array);
    }

    public static UnaryOperator<int[][]> transpose() {
        return m -> range(0, m[0].length).mapToObj(r ->
                range(0, m.length).mapToDouble(c -> m[c][r]).toArray()
        ).toArray(int[][]::new);
    }

    public static double[] multiply(double[][] matrix, double[] vector) {
        return Arrays.stream(matrix)
                .mapToDouble(row ->
                        range(0, row.length)
                                .mapToDouble(col -> row[col] * vector[col])
                                .sum()
                ).toArray();
    }

    public Integer[][] rotateMatrix(int[][] matrix) {
        return range(0, matrix.length)
                .mapToObj(i -> range(0, matrix[i].length)
                        .mapToObj(j -> matrix[matrix[i].length - j - 1][i]).toArray(Integer[]::new))
                .toArray(Integer[][]::new);
    }


}
