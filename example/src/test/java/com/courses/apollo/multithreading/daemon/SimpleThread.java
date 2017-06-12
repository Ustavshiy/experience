package com.courses.apollo.multithreading.daemon;

/**
 * Потокидемоны используются для работы в фоновом режиме вместе с программой,
 * но не являются неотъемлемой частью логики программы.
 * Если какой-либо процесс может выполняться на фоне работы основных потоков
 * вы- полнения и его деятельность заключается в обслуживании основных потоков приложения,
 * то такой процесс может быть запущен как потокдемон.
 * С помо- щью метода setDaemon(boolean value), вызванного вновь созданным потоком до его запуска,
 * можно определить поток-демон. Метод boolean isDaemon() по- зволяет определить, является ли указанный поток демоном или нет.
 */
public class SimpleThread extends Thread {

    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("старт потока-демона");
                Thread.sleep(10_000); // заменить параметр на 1

            } else {
                System.out.println("старт обычного потока");
            }
        } catch (InterruptedException e) {
            System.err.print(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("завершение обычного потока");
            } else {
                System.out.println("завершение потока-демона");
            }
        }
    }
}

