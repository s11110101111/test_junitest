package org.example.test_junitest.sobes.Parallel_Concurrent.логика_проверки_атомарных_операций;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Потокобезопасный_HashTable<K, V> {
    private Map<K, V> map = new Hashtable<K, V>();

    public synchronized void putAndAbsent(K key, V value) {
        //синхронизируем проверку и вставку в один метод
        if (map.containsKey(key))
            map.put(key, value);
    }

    //нужно использовать стандартные потоко безопасные коллекции
    public void setConcurrentMap(K key,V value) {
        ConcurrentHashMap<K, V> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.putIfAbsent(key,value);
    }
}
