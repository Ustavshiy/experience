package com.courses.apollo.streams;


import com.courses.apollo.StudentTestData;
import com.courses.apollo.model.Dish;
import com.courses.apollo.model.Student;
import com.courses.apollo.model.University;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
        Set<Dish> dishSet = new TreeSet<>(Comparator.comparing(Dish::getName));
        for (Dish aMenu : menu) {
            if (counter < 3
                    && aMenu.getCalories() > 300
                    && aMenu.getType() != Dish.Type.MEAT
                    && !dishSet.contains(aMenu)) {
                counter++;
                System.out.println(aMenu);
                dishSet.add(aMenu);
            }
        }
        System.out.println("-----------");
        menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .filter(dish -> dish.getType() != Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories).thenComparing(Dish::getName).reversed())
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void testGetStreams() throws Exception {
        Stream<Dish> firstStream = menu.stream();
        Stream<String> secondStream = Stream.of("A", "B", "C");
        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        Stream<String> streamFromFiles = Files.lines(Paths.get("src\\main\\resources\\testTwo.txt"));
        IntStream streamFromString = "123".chars();
        Stream<Object> fourthStream = Stream.builder().add("a1").add("a2").add("a3").build();
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1).limit(10);
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1").limit(20);
    }

    @Test
    public void testFunctor() {
        menu.stream().map(dish -> new Student(dish.getName())).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        menu.stream().peek(dish -> System.out.println(dish.getCalories()))
                .peek(dish -> System.out.println(dish.getName()))
                .peek(dish -> System.out.println(dish.getType()))
                .forEach(System.out::println);
        menu.stream().mapToInt(Dish::getCalories).forEach(System.out::println);
    }

    @Test
    public void flatMapTest() {
        List<University> universities = StudentTestData.getUniversities();
        Student max = universities.get(0).getStudents().get(0);
        for (University university : universities) {
            Integer maxMark = 0;
            for (int j = 0; j < university.getStudents().size(); j++) {
                List<Integer> marks = university.getStudents().get(j).getMarks();
                int markSum = 0;
                for (Integer mark : marks) {
                    markSum += mark;
                }
                if (markSum > maxMark) {
                    maxMark = markSum;
                    max = university.getStudents().get(j);
                }
            }
        }
        System.out.println(max);
        System.out.println("-------------------------------------------------------");
        Student maxStudent = universities.stream()
                .flatMap(university -> university.getStudents().stream())
                .reduce((student, student2) -> {
                    int s1 = student.getMarks().stream().reduce(Integer::sum).orElse(0);
                    int s2 = student2.getMarks().stream().reduce(Integer::sum).orElse(0);
                    if(s1 > s2) {
                        return student;
                    }
                    return student2;
                }).orElse(null);
        System.out.println(max.equals(maxStudent));
    }

    @Test
    public void testTerminalOperations() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        int sum = 0;
        for(Integer i : integers) {
            sum += i;
        }
        System.out.println(sum);
        int s = integers.stream().reduce((integer, integer2) -> integer + integer2).orElse(0);
        Dish dish = menu.stream().filter(d -> d.getCalories() > 300).findAny().orElse(null);

    }

    @Test
    public void testCollectors() {
        Integer idFrom = 0;
        Integer idTo = 10;
        List<Student> students = new ArrayList<>();
        List<University> universities = StudentTestData.getUniversities();
        for (University university : universities) {
            for (int j = 0; j < university.getStudents().size(); j++) {
                Student s = university.getStudents().get(j);
                if(idFrom < s.getStudentId() && s.getStudentId() < idTo) {
                    students.add(s);
                }
            }
        }
        Map<Integer , Integer> map = new HashMap<>();

        TreeMap<Integer, Student> res = universities.stream()
                .flatMap(univer -> univer.getStudents().stream())
                .collect(Collectors.toMap(Student::getStudentId, Function.identity(), (o, o2) -> o,
                        TreeMap::new));
        System.out.println(res);
    }
}
