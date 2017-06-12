package com.courses.apollo.multithreading.first;

public class TwoThreadSetName extends Thread {

    public String test = "Test";

    public void run() {
        test = "Test in Thread";
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        // get a reference to the thread running this
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("My Main");
        TwoThreadSetName tt = new TwoThreadSetName();
        tt.setName("my worker thread");
        tt.start();

        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}

