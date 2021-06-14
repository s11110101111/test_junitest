package org.example.test_junitest.sobes.a51_многопоточность_concurrent.способысоздания_потоков;

public class InheritFromThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" читаю счетчик = "+СпособыСозданияИЗапускаПотоков.count);
        СпособыСозданияИЗапускаПотоков.count++;
            }
}
