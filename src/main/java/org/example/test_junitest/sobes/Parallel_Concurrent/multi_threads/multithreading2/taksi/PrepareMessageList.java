package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.multithreading2.taksi;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class PrepareMessageList {

    public static void main(String[] args) {
   CopyOnWriteArrayList<Message> lstMsg = new CopyOnWriteArrayList<>();
       PrepareMessageList pm = new PrepareMessageList();
       lstMsg=pm.fillList();
       lstMsg.stream().forEach(System.out::println);
    }

     public CopyOnWriteArrayList<Message> fillList(){
         CopyOnWriteArrayList<Message> listMsg = new CopyOnWriteArrayList<>();
         new Random()
                 .ints(1000,1,10)
                 .forEach(a->{
                    listMsg.add(new Message(a,"Message for "+a));
                 });
return listMsg;

     }

}
