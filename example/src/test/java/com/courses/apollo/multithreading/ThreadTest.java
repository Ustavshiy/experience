package com.courses.apollo.multithreading;


import com.courses.apollo.multithreading.first.TalkThread;
import com.courses.apollo.multithreading.first.TwoThread;
import com.courses.apollo.multithreading.first.WalkingThread;
import org.junit.Test;

public class ThreadTest {

    public static void main(String[] args) {
        TalkThread talkThread = new TalkThread();
        WalkingThread walkingThread = new WalkingThread();
        talkThread.start();
        walkingThread.start();
    }

    @Test
    public void walkTalkTest() {
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkingThread());
        // запуск потоков
        talk.start();
        walk.start();
        // WalkRunnable w = new WalkRunnable(); // просто объект, не поток
        // w.run(); или talk.run(); // выполнится метод, но поток не запустится!
    }


}
