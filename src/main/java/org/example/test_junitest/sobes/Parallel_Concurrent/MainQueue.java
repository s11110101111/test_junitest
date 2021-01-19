package org.example.test_junitest.sobes.Parallel_Concurrent;

import lombok.SneakyThrows;
import org.example.test_junitest.sobes.enum_test.ColorANSI;

import java.util.ArrayList;
import java.util.Arrays;

public class MainQueue {


    public static void main(String[] args) {
        BlockingQueue bQueue = new BlockingQueue();
        Thread worker = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Runnable task = bQueue.get();
                    System.out.println("launch task in main ");
                    task.run();

                }
            }
        });
        worker.start();
        for (int i = 0; i < 10; i++) {
            bQueue.put(getTask());


        }

    }

    public static Runnable getTask() {
        return new Runnable() {
            @Override
            @SneakyThrows
            public void run() {
                String threadName = Thread.currentThread().getName();
                String textStart = "Task start";
                String textStop = "Task Stop";

                if (threadName.equals("Thread-0")) {
                    threadName = ColorANSI.RED.fillColor(threadName);
                    textStart = ColorANSI.RED.fillColor(textStart);
                    textStop = ColorANSI.RED.fillColor(textStop);
                }


                System.out.println(threadName);
                System.out.println(textStart + "  " + this);

                Thread.sleep(1000);
                System.out.println();
                System.out.println(textStop + threadName + "  " + this);
            }
        };
    }

    static class BlockingQueue {
        ArrayList<Runnable> tasks = new ArrayList<>();

        @SneakyThrows
        public synchronized Runnable get() {
            while (tasks.isEmpty()) {
                System.out.println("wait");
                wait();
                System.out.println("after wait");
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }

        public synchronized void put(Runnable task) {
            tasks.add(task);
            System.out.println("add task and notify");
            notify();

        }
    }

}
