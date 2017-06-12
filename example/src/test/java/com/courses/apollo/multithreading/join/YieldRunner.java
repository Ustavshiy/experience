package com.courses.apollo.multithreading.join;

/**
 * Вызов статического метода yield() для исполняемого потока должен приводить к приостановке потока на некоторый квант времени,
 * чтобы другие потоки могли выполнять свои действия.
 * Например, в случае потока с высоким приоритетом после обработки части пакета данных,
 * когда следующая еще не готова, стоит уступить часть времени другим потокам.
 * Однако если требуется надеж- ная остановка потока, то следует использовать его крайне осторожно или вооб- ще
 * применить другой способ.
 */
public class YieldRunner {
    public static void main(String[] args) {
        new Thread() { // анонимный класс public void run()
            public void run() {
                System.out.println("старт потока 1");
                Thread.yield();
                System.out.println("завершение 1");
            }
        }.start(); // запуск потока

        new Thread() {
            public void run() {
                System.out.println("старт потока 2");
                System.out.println("завершение 2");
            }
        }.start();
    }
}

