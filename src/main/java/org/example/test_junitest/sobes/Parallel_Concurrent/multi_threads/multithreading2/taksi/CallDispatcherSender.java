package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.multithreading2.taksi;

import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class CallDispatcherSender {
    private final Map<Integer, Taxi> taxiStation;
    public final Queue<Message> queueIncome;
    public final Queue<Message> queueMsgStart; //  очередь база для 1000 звонков
    private volatile boolean cycle = true; // сбросим как получим входящие

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
        fillList();
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

    class UserCall implements Callable<String> {
        Message mes;
        String userName;
UserCall(String nameUser){
    this.userName= nameUser;
}
        @Override
        public String call() throws Exception {
            if (queueMsgStart.size() > 0) {
                mes = queueMsgStart.poll();
                queueIncome.add(mes);
             return mes.toString();
            }

            return "No  incoming calls";
        }
    }

    void fillList() {
        Queue<Message> queueMsgStart = new ConcurrentLinkedQueue<>();
        new Random()
                .ints(100, 1, 10)
                .forEach(a -> {
                    queueMsgStart.add(new Message(a, "Message for " + a));
                });
        System.out.println("Created queue for user calls , size - " + queueMsgStart.size());
        cycle = false;


    }

    protected class CallDispatcher implements Runnable {
        Taxi tekTaxi = null;

        void sendMessageTaxi(Message msg) {
            if (taxiStation.size() > 0) {
                tekTaxi = taxiStation.get(msg.id);
                tekTaxi.queueCalls.add(msg);
                tekTaxi.isNotTasks = false;
            } else {
                System.out.println("Taxi not online");
            }
        }

        @Override
        public void run() {
            Message msg;
            while (cycle || queueIncome.size() > 0) {
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
                    // System.out.println("CallDispatcher queueIncome is empty   ");
                }

            }

        }
    }

    protected class IncomingCall {
        int id;
        String text;
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

        public void setQueueCalls(Message message) {
            queueCalls.add(message);

        }

        @Override
        public void run() {
            Message msg;
            while (isNotTasks || queueCalls.size() > 0) {
                try {
                    if ((msg = queueCalls.poll()) != null) {
                        Thread.sleep(3000);//   типа 3 минуты )
                        System.out.println("Taxi id " + this.id + "save and work task: " + msg.toString());
                    } else {
                        //   System.out.println("Taxi id " + this.id + "queue is empty");
                        isNotTasks = true;
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
