package com.courses.apollo.multithreading.join;

/**
 * Несмотря на вызов метода join() для потока t1, поток t2 будет работать, в отличие от потока main,
 * который сможет продолжить свое выполнение толь- ко по завершении потока t1.
 * Если вместо метода join() без параметров использовать версию join(long timeout),
 * то поток main будет остановлен только на указанный промежуток времени. При вызове t1.join(500) вывод будет другим
 * <p>
 * Статический метод currentThread() возвращает ссылку на текущий поток, т. е. на поток, в котором данный метод был вызван.

 */
public class JoinRunner {

    static {
        System.out.println("Старт потока main");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new JoinThread());
        t1.setName("First");
        Thread t2 = new Thread(new JoinThread());
        t2.setName("Second");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();// поток main остановлен до окончания работы потока t1 } catch (InterruptedException e) {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()); // имя текущего потока
    }
}
