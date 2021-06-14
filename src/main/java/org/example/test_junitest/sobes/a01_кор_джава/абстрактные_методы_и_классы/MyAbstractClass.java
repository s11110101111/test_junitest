package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы;

public abstract class MyAbstractClass {
    private String privateName;
    String defaultName;
    public String publicName;

    // нельзя сделать приватным
    abstract void myAbstractMethod();

    public void setPrivateName(String name) {
        this.privateName = "privat name"+ name;
        this.defaultName = "def name " + name;
        this.publicName = "publ name " + name;
    }

    private void privateMethod() {
        System.out.println("вызов приватного метода"+" c доступом к приватной переменной "+ privateName);
    }

    void defaultMethod() {
        System.out.println("вызов по умолчанию метода");
    }
}
