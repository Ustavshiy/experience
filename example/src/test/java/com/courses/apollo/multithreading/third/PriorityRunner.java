package com.courses.apollo.multithreading.third;

/**
 * Потоку можно назначить приоритет от 1 (константа MIN_PRIORITY) до 10 (MAX_PRIORITY)
 * с помощью метода setPriority(int prior).
 * Получить значение приоритета потока можно с помощью метода getPriority().
 * Поток с более высоким приоритетом в данном случае, как правило, монопо- лизирует вывод на консоль.
 * Потоки объединяются в группы потоков. После создания потока нельзя из- менить его принадлежность к группе.
 * ThreadGroup tg = new ThreadGroup("Группа потоков 1"); Thread t0 = new Thread(tg, "поток 0");
 * Все потоки, объединенные в группу, имеют одинаковый приоритет.
 * Чтобы опре- делить, к какой группе относится поток, следует вызвать метод getThreadGroup().
 * <p>
 * Если поток до включения в группу имел приоритет выше приоритета группы потоков,
 * то после включения значение его приоритета станет равным приори- тету группы.
 * Поток же со значением приоритета, более низким,
 * чем приоритет группы после включения в оную, значения своего приоритета не изменит.
 */
public class PriorityRunner {
    public static void main(String[] args) {
        PriorThread min = new PriorThread("Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread("Norm");
        min.setPriority(Thread.MIN_PRIORITY); //
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        ThreadGroup tg = new ThreadGroup("Группа потоков 1");
        Thread t0 = new Thread(tg, "поток 0");
        min.start();
        norm.start();
        max.start();

    }
}
