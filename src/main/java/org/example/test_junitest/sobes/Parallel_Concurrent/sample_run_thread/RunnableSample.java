package org.example.test_junitest.sobes.Parallel_Concurrent.sample_run_thread;


import org.example.test_junitest.sobes.enum_test.ColorANSI;

//2 имплементим интерфейс Runnable  И реализуем метод run
//  создадим и подсуним в поток, стартанем его)
//
public class RunnableSample implements Runnable{


    @Override
    public void run() {
        String msg = ColorANSI.PURPLE.fillColor("do multiThread task 1 )");
        System.out.println(msg);

    }

    public static void main(String[] args) {
        RunnableSample tsk1 = new RunnableSample();
        Thread t1 = new Thread(tsk1);
        t1.start();
    }
}
