package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads;

import lombok.SneakyThrows;
import org.example.test_junitest.sobes.enum_test.ColorANSI;

public class MainStartThreads {
   private static   int a;
    public static void main(String[] args) {
        Thread thrdMain = Thread.currentThread();
        System.out.println(thrdMain);

        for (int i = 0; i <10 ; i++) {
            ThreadMain thrd = new ThreadMain();
           thrd.setPriority(1+i);
            thrd.start();
            Thread thrd2 = new Thread(new ThreadMain2());
                thrd2.setPriority(10-i);
                thrd2.start();
        }


    }

    private static class  ThreadMain extends Thread{

        @SneakyThrows
        @Override
        public void run() {

            int b = a;
            a=0;
            Thread.sleep(1001);
            System.out.println("Hello ThreadMain "+ ColorANSI.YELLOW.fillColor(getName()
            +"\n Priority "+getPriority()+""
                    +"\n is interupted "+this.isInterrupted()
                    +"\n is id "+this.getId()
                    +"\n is  state "+this.getState() + "=="+b
            ));
        }
    }
    private static  class ThreadMain2 implements Runnable{


        @SneakyThrows
        @Override
        public void run() {
            a=1;
            Thread.sleep(1000);
            System.out.println( "hello thread 2 "+ ColorANSI.RED.fillColor(Thread.currentThread().getName()
                    +"\n Priority "+Thread.currentThread().getPriority()+""
                    +"\n is interupted "+Thread.currentThread().isInterrupted()
                    +"\n is id "+Thread.currentThread().getId()
                    +"\n is  state "+Thread.currentThread().getState() +"=="+a
            ));
        }
    }

}
