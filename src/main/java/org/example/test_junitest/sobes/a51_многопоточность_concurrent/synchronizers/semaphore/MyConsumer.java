package org.example.test_junitest.sobes.a51_многопоточность_concurrent.synchronizers.semaphore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Semaphore;

public class MyConsumer extends Thread {
    private Semaphore sem;
    private String name;
    private String product;
    private boolean isTookProduct;

    MyConsumer(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

  
    @Override
    public void run() {


        try {
            if (!isTookProduct) {
                sem.acquire();
                System.out.println( getName() + ": Подхожу к окну выдачи продукта");
                  sleep(300);
                  product= "Продукт аля "+ getName();
                  isTookProduct=true;
                System.out.println( getName() + ": получил продукта -" +product);
                sem.release();
                sleep(300);
                System.out.println( getName() + ": пойду перекурю с -" + product);

            }
        } catch (InterruptedException e) {
           // e.printStackTrace();
            System.out.println("чтото пошло не так проудкт мы не потребили");
        }
        RecycleProduct();

    }

    private void RecycleProduct() {
        try {
            sleep(300);
            System.out.println(product +": потребил продукт)");
            product ="";
            isTookProduct= false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        new MyConsumer(sem,"Потребитель 1").start();
        new MyConsumer(sem,"Потребитель 2").start();
        new MyConsumer(sem,"Потребитель 3").start();
        new MyConsumer(sem,"Потребитель 4").start();
        new MyConsumer(sem,"Потребитель 5").start();
    }
}

