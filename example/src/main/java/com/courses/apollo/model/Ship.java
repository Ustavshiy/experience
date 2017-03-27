package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public class Ship {
    /**
     * Engine inner class.
     */
    private Engine eng;
    /**
     * String test.
     */
    private String test = "Test";

    /**
     * Inner class.
     */
    // abstract, final, private, protected - допустимы
    public class Engine { // определение внутреннего (inner) класса поля и методы

        /**
         * Method in inner class.
         */
        public void launch() {
            System.out.println("Запуск двигателя");
            System.out.println(test);
        }
    } // конец объявления внутреннего класса

    /**
     * Static inner class.
     */
    public static class StaticEngine {
        /**
         * static method.
         */
        public static void doSomething() {
            new Ship().new Engine().launch();
        }

    }

    /**
     * Method init.
     */
    public final void init() { // метод внешнего класса
        eng = new Engine();
        eng.launch();
    }

    /**
     * Method launch.
     */
    public void launch() {
        new Engine().launch();
    }
}
