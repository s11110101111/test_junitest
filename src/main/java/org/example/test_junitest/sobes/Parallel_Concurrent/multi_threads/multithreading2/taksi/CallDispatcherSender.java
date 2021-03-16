package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.multithreading2.taksi;


import java.util.Map;
import java.util.Queue;
import java.util.Random;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;


public class CallDispatcherSender {
    private final Map<Integer, Taxi> taxiStation = new ConcurrentHashMap<>();
    private final Queue<Message> queueIncome = new ConcurrentLinkedQueue<>();
    private volatile boolean cycle; // сбросим как получим входящие


    CallDispatcherSender() {

        Thread dispatcher = new Thread(new CallDispatcher());
        //fillQueueIncomingCalls();
        dispatcher.start();
        for (int i = 1; i <= 10; i++) {
            //start taxi thread
            Taxi taxi = new Taxi(i);
            taxiStation.put(i, taxi);
            Thread thTaxi = new Thread(taxi);
            thTaxi.setDaemon(true);
            thTaxi.setName("Taxi" + i);
            thTaxi.start();
        }
        fillQueueIncomingCalls();

        while (true) {
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


    void fillQueueIncomingCalls() {

        new Random()
                .ints(100, 1, 10)
                .parallel()
                .forEach((a) -> queueIncome.add(new Message(a, "Message for " + a))
                );
        System.out.println("Created queue for user calls , size - " + queueIncome.size());
        cycle = false;


    }

    protected class CallDispatcher implements Runnable {
        Taxi tekTaxi = null;

        void sendMessageTaxi(Message msg) {
            if (taxiStation.size() > 0) {
                tekTaxi = taxiStation.get(msg.id);
                tekTaxi.queueCalls.add(msg);
                //  tekTaxi.isNotTasks =false;
            } else {
                System.out.println("Taxi not online");
            }
        }

        @Override
        public void run() {
            Message msg;
            while (true || cycle || queueIncome.size() > 0) {
                System.out.println("   queue incoming size -" + queueIncome.size() + "--------------------");
                if ((msg = queueIncome.poll()) != null) {
                    try {
                        sendMessageTaxi(msg);
                        System.out.println("CallDispatcher sent queueIncome in " + msg.toString());
                        Thread.sleep(200);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    cycle = true;
                    System.out.println("CallDispatcher queueIncome is empty   ");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
    }


    class Taxi implements Runnable {
        int id;
        Queue<Message> queueCalls;
        boolean isNotTasks = true;

        Taxi(int i) {
            this.id = i;
            this.queueCalls = new ConcurrentLinkedQueue<Message>();
            System.out.println("Taxi created  id - " + i);
        }

        @Override
        public void run() {
            Message msg;
            while (isNotTasks) {
                try {
                    if ((msg = queueCalls.poll()) != null) {
                        Thread.sleep(2000);//   типа 3 минуты )
                        System.out.println("Taxi id " + this.id + " - save and work task: " + msg.toString());
                    } else {
                        System.out.println("Taxi id " + this.id + "queue is empty");
                        Thread.sleep(200);
                        //  isNotTasks = true;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new CallDispatcherSender();

    }


    public static class Message {
        private int id;
        private String text;

        public Message(int id, String text) {
            this.id = id;
            this.text = text;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "id=" + id +
                    ", text='" + text + '\'' +
                    '}';
        }
    }
}
