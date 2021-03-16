package org.example.test_junitest.sobes.luxoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task {




    public static void getDuplicate(int[] arr){
       final Map<Integer,Integer> map = new HashMap<>();
               
        Arrays.stream(arr).forEach(a->{

           if( map.containsKey(a)){
               int count = map.get(a)+1;
               map.put(a,count);
           }else{
               map.put(a,1 );
           }
        });

        for(int i = 0; i< arr.length; i++){
        }
// 1 обход
        map.entrySet().forEach((a)-> {
            if (a.getValue()>1){
            System.out.println(a);
            }
            });
//2 обход
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
           if ( entry.getValue()>1) System.out.println(entry.getKey());
        }
        // 3 обход
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue()>1) System.out.println(entry.getKey());
        }
        
        }


    public static void main(String[] args) {

    }
}
