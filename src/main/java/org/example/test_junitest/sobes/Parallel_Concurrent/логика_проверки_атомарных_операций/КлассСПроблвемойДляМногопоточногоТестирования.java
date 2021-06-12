package org.example.test_junitest.sobes.Parallel_Concurrent.логика_проверки_атомарных_операций;

public class КлассСПроблвемойДляМногопоточногоТестирования {
    //в тесте запустим два пототока ипроверим как это не сработает
    int nextId;
    public int takeNextId(){
        return nextId++;
    }

    public int getLastId() {
        return nextId;
    }
}
