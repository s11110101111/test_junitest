package org.example.test_junitest.sobes.a51_многопоточность_concurrent.способысоздания_потоков;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class СпособыСозданияИЗапускаПотоков {
    public static  Integer count = 0;


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("--extends Thread 0----");
        InheritFromThread th1 = new InheritFromThread();
        th1.start();
        System.out.println("--implement runnable Thread 01----");
        Runnable rn = new RunnableImplThread();
        Thread th2 = new Thread(rn);
        th2.start();
        System.out.println("--implement runnable Thread 02----");
        Callable<Integer> cl = new CollableImplThread();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future fut1 =  executor.submit(rn);
        Future fut2 = executor.submit(cl);
        Future fut3 = executor.submit(cl);


        th1.join();
        th2.join();
        th1 = null;
        th2 = null;
        System.out.println(" ft1 " +fut1.get());
        System.out.println(" ft2 " +fut2.get());
        System.out.println(" ft3 " +fut3.get());
        executor.shutdown();
    }
}
