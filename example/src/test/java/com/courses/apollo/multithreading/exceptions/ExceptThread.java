package com.courses.apollo.multithreading.exceptions;

/**
 * Created by roman.andrianov on 10/18/16.
 */
public class ExceptThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                if(i == 5) {
                    throw new IllegalArgumentException("Illegal Argument");
                }
                Thread.currentThread().sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
