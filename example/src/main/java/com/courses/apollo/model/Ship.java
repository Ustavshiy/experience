package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public class Ship {

    private Engine eng;
    private String test = "Test";

    // abstract, final, private, protected - допустимы
    public class Engine { // определение внутреннего (inner) класса
        // поля и методы
        public void launch() {
            System.out.println("Запуск двигателя");
            System.out.println(test);
        }
    } // конец объявления внутреннего класса

    public static class StaticEngine {

        public static void doSomething() {
            new Ship(). new Engine().launch();
        }

    }

    public final void init() { // метод внешнего класса
        eng = new Engine();
        eng.launch();
    }

    public void launch() {
        new Engine().launch();
    }
}
