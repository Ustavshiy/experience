package com.courses.apollo.multithreading.first;

public class TwoThreadAlive extends Thread {


    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        // get a reference to the thread running this
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name =" + name);
    }

    public static void main(String[] args) throws Exception {
        TwoThreadAlive tt = new TwoThreadAlive();
        tt.setName("my worker thread");
        System.out.println("before start(), tt.isAlive() =" + tt.isAlive());
        tt.start();
        System.out.println("just after start()" + tt.isAlive());
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
        System.out.println("at the end of main(), tt.isAlive()=" + tt.isAlive());
        Thread.currentThread().sleep(10);
        System.out.println("at the end of main(), tt.isAlive()=" + tt.isAlive());
    }
}
