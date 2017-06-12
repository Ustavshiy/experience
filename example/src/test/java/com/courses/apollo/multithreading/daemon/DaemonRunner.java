package com.courses.apollo.multithreading.daemon;

/**
 * последний оператор main
 старт обычного потока
 завершение обычного потока
 старт обычного потока
 завершение обычного потока
 */
public class DaemonRunner {
    public static void main(String[] args) {
        //SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        //usual.start();
        System.out.println("последний оператор main");
    }
}
