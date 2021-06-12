package org.example.test_junitest.sobes.patterns.singletons;

public enum ИзПеречисления {
    ОБРАЗ,Образ,образ,ОБРАз;

public void сделайЧтонибудь(){
    System.out.println("запусит наш синглтон" + getClass()
            +""+ordinal()
            +""+values());
}

}
