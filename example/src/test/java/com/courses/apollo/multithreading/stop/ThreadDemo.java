package com.courses.apollo.multithreading.stop;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            String name = Thread.currentThread().getName();
            int count = 0;
            while (true)
                System.out.println(name + ": " + count++);
        };
        Thread thdA = new Thread(r);
        Thread thdB = new Thread(r);
        thdA.start();
        thdB.start();

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        thdA.interrupt();
        thdB.interrupt();
        System.out.println("Thread Stopped");
    }
}
