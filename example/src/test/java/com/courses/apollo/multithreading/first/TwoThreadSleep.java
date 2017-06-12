package com.courses.apollo.multithreading.first;

/**
 * Created by roman.andrianov on 10/18/16.
 */
public class TwoThreadSleep extends Thread {
    public void run() {
        loop();
    }


    public void loop() {
// get a reference to the thread running this
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("just entered loop() - " + name);
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(20000);
            } catch (InterruptedException x) {
                x.printStackTrace();
            }
            System.out.println("Print");
        }
        System.out.println("name=" + name);
    }

    public static void main(String[] args)throws Exception {
        TwoThreadSleep tt = new TwoThreadSleep();
        tt.setName("my worker thread");
        tt.start();
        Thread.currentThread().sleep(10);
        tt.interrupt();
        // pause for a bit
        try {
            Thread.sleep(700);
        } catch (InterruptedException x) {
// ignore }
            tt.loop();
        }
    }
}
