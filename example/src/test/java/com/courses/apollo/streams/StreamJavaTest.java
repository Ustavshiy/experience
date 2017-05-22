package com.courses.apollo.streams;


import com.courses.apollo.model.Dish;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamJavaTest {

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH),
                    new Dish("Burger", false, 600, Dish.Type.MEAT));

    public static final List<Dish> MENU_TWO =
            Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT));

    @Test
    public void testIterateAllElements() {
        for (Dish aMenu : menu) {
            System.out.println(aMenu);
        }
        System.out.println("-----------");
        menu.forEach(System.out::println);
    }

    @Test
    public void testPredicate() {
        for (Dish aMenu : menu) {
            if (aMenu.getCalories() > 400 && aMenu.getType() != Dish.Type.MEAT) {
                System.out.println(aMenu);
            }
        }
        System.out.println("-----------");
        menu.stream()
                .filter(dish -> dish.getCalories() > 400)
                .filter(dish -> dish.getType() != Dish.Type.MEAT)
                .forEach(System.out::println);
    }

    @Test
    public void intermediateOperationsTest() {
        int counter = 0;
        Set<Dish> dishSet = new HashSet<>();
        for (Dish aMenu : menu) {
            if ( counter < 3 && aMenu.getCalories() > 300 && aMenu.getType() != Dish.Type.MEAT && !dishSet.contains(aMenu)) {
                counter++;
                System.out.println(aMenu);
                dishSet.add(aMenu);
            }
        }
        System.out.println("-----------");
        menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .filter(dish -> dish.getType() != Dish.Type.MEAT)
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void testGetStreams() throws Exception{
        Stream<Dish> firstStream = menu.stream();
        Stream<String> secondStream = Stream.of("A", "B", "C");
        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        Stream<String> streamFromFiles = Files.lines(Paths.get("src\\main\\resources\\testTwo.txt"));
        IntStream streamFromString = "123".chars();
        Stream<Object> fourthStream = Stream.builder().add("a1").add("a2").add("a3").build();
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1).limit(10);
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1").limit(20);
    }

    public void printDish(Dish dish) {
        System.out.println(dish);
    }
}
