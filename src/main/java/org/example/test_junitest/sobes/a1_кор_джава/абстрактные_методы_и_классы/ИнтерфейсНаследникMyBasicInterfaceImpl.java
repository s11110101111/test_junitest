package org.example.test_junitest.sobes.a1_кор_джава.абстрактные_методы_и_классы;

public class ИнтерфейсНаследникMyBasicInterfaceImpl implements ИнтерфейсНаследникMyBasicInterface {

    public String basicMethod(String asa) throws Exception{
        return "Перегрузака метода базового интерфейса";
    }

    @Override
    public String basicMethod() {
        return "Переопрелелили метод базового интерфейса";
    }

    @Override
    //нелья добамить свой если нет интерфейсе, можем понизать ексепшионы, можем не указывать ,
    public String basicMethodThrowsExceptions() throws StringIndexOutOfBoundsException{
        return "Переопределение метода базового интерфейса бросающего exception";
    }
}
