package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.multithreading2.taksi;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CallDispatcherSender {
    Map<Integer, Taxi> taxiStation ;
    Queue<Message> queueIncome;

    public Map<Integer, Taxi> getTaxiStation() {
        return taxiStation;
    }

    public Queue<Message> getQueueIncome() {
        return queueIncome;
    }

    CallDispatcherSender() {
         taxiStation = new ConcurrentHashMap<>();
         queueIncome = new ConcurrentLinkedQueue();
        Thread dispatcher = new Thread(new CallDispatcher());
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
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    protected class CallDispatcher implements Runnable {



void sendMessageTaxi(Message msg){

}

        @Override
        public void run() {


        }
    }

    protected class IncomingCall {
        int id;
        String text;
    }

    class Taxi implements Runnable {
        int id;
        Queue<Message> queueCalls;

        Taxi(int i) {
            this.id = i;
            this.queueCalls = new ConcurrentLinkedQueue<Message>();
            System.out.println("Taxi created  id - " + i);
        }

        public void setQueueCalls(Message message) {
            queueCalls.add(message);

        }

        @Override
        public void run() {
            while (true) {
                Message msg = queueCalls.poll();
                try {
                    if (msg != null) {
                        Thread.sleep(3000);//   типа 3 минуты )
                        System.out.println("Taxi id " + this.id + "save and work task: " + msg.toString());
                    } else {
                        System.out.println("Taxi id " + this.id + "queue is empty");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        new CallDispatcherSender();
    }


    public static class Message {
        private int id;
        private String text;


        public void setId(int id) {
            this.id = id;
        }


        public void setText(String text) {
            this.text = text;
        }

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
