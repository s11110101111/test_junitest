package org.example.test_junitest.sobes.a51_многопоточность_concurrent.способысоздания_потоков;

import lombok.SneakyThrows;

public class RunnableImplThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" читаю счетчик = "+СпособыСозданияИЗапускаПотоков.count);
        СпособыСозданияИЗапускаПотоков.count++;
    }
}
