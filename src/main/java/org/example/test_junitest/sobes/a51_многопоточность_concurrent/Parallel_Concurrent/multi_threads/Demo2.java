package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.multi_threads;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Thread worker = new WorkerThread();
        Thread sleeper = new SleeperThread();

        System.out.println("Starting threads");
        worker.setDaemon(true);
        worker.start();
        sleeper.setDaemon(true);
        sleeper.start();
        Thread.sleep(1000);

//        System.out.println("Interrupting threads");
//        worker.interrupt();
//        sleeper.interrupt();
//
//        System.out.println("Joining threads");
//        worker.join();
//        sleeper.join();

        System.out.println("All done");
    }


    private static class WorkerThread extends Thread {

        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i < 10000000; ++i) {
                sum += i;
                if (i % 100 == 0 && isInterrupted()) {
                    System.out.println("Loop interrupted at i = " + i);
                    break;
                }
            }
        }
    }


    private static class SleeperThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }
}
