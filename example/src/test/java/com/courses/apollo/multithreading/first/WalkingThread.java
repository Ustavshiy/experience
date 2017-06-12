package com.courses.apollo.multithreading.first;


public class WalkingThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
