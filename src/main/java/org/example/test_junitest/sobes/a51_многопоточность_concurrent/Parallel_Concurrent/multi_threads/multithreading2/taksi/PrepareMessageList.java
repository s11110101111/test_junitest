package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.multi_threads.multithreading2.taksi;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class PrepareMessageList {

    public static void main(String[] args) {
   CopyOnWriteArrayList<CallDispatcherSender.Message> lstMsg = new CopyOnWriteArrayList<>();
       PrepareMessageList pm = new PrepareMessageList();
       lstMsg=pm.fillList();
       lstMsg.stream().forEach(System.out::println);
    }

     public CopyOnWriteArrayList<CallDispatcherSender.Message> fillList(){
         CopyOnWriteArrayList<CallDispatcherSender.Message> listMsg = new CopyOnWriteArrayList<>();
         new Random()
                 .ints(1000,1,10)
                 .forEach(a->{
                    listMsg.add(new CallDispatcherSender.Message(a,"Message for "+a));
                 });
return listMsg;

     }

}
