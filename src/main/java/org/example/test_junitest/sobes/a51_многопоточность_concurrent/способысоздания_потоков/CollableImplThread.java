package org.example.test_junitest.sobes.a51_многопоточность_concurrent.способысоздания_потоков;

import java.util.concurrent.Callable;

public class CollableImplThread implements Callable<Integer> {
    private Integer oldValue;
    public Integer call() throws Exception{
oldValue=СпособыСозданияИЗапускаПотоков.count;
       if (oldValue != СпособыСозданияИЗапускаПотоков.count){
           throw new Exception(" это типа нарушение целостности ");
       }
        System.out.println(Thread.currentThread().getName() +" читаю счетчик = "+СпособыСозданияИЗапускаПотоков.count);
        СпособыСозданияИЗапускаПотоков.count++;

        return oldValue;
    }
}
