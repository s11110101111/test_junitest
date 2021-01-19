package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListThreads {
    private static final int WORKER_COUNT = 10;
    private static int nextWorker = (int) (Math.random() * WORKER_COUNT);

    // new object  monitor for lock synchronize
    private static final Object LOCK = new LockMonitor().getMonitor();


    public static void main(String[] args) throws Exception {

        List<Thread> threads = new ArrayList<>(WORKER_COUNT);
        for (int i = 0; i < WORKER_COUNT; ++i) {
            Thread thread = new WorkerThread(i);
            threads.add(thread);
            thread.start();
        }

        Thread.sleep(10000L);

        for (Thread thread : threads) {
            thread.interrupt();
            System.out.println(thread.isInterrupted());
            thread.join();
        }
    }


    private static class WorkerThread extends Thread {

        private final int workerId;

        private WorkerThread(int workerId) {
            this.workerId = workerId;
        }

        @Override
        public void run() {
            try {
                for (;;) {
                    synchronized (LOCK) {
                        while (nextWorker != workerId) {
                            LOCK.wait();
                        }
                        System.out.println("Worker " + workerId + " activated");

                        nextWorker = (nextWorker + 1) % WORKER_COUNT;
                        LOCK.notifyAll();
                    }

                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                System.out.println("Worker " + workerId + " interrupted");
            }
        }
    }
    public static class LockMonitor{
        Object monitor;
        public Object getMonitor(){
            monitor = new Object();
            return monitor;
        }
    }
}
