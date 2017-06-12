package com.courses.apollo.multithreading.exceptions;

/**
 * В процессе функционирования потоки являются в общем случае независи- мыми друг от друга.
 * Прямым следствием такой независимости будет коррект- ное продолжение работы потока main после аварийной остановки
 * запущенно- го из него потока после генерации исключения.
 * <p>
 * Основной поток избавлен от необходимости обрабатывать исключения в порожденных потоках.
 * В данной ситуации верно и обратное: если основной поток прекратит свое выполнение из-за необработанного исключения,
 * то это не скажется на работо- способности порожденного им потока.
 */
public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ExceptThread thread = new ExceptThread();
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(t.getName());
            System.out.println(e.getMessage());
            System.out.println("Unhandled error");
        });
        thread.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("If main is dead");
        }));
        //thread.join();
        Thread.sleep(5000);
        throw new IllegalArgumentException();
        //System.out.println("end of main");
    }
}
