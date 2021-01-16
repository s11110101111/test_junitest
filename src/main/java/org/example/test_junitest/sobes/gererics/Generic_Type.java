package org.example.test_junitest.sobes.gererics;

import java.util.List;

public class Generic_Type<T> {
    private T t;

    public <X> X print(X x) {

        System.out.println(x + "\n" + x.getClass().getSimpleName());
        return x;
    }

    public static <U> U getFirst(U u) {
        System.out.println(u + "\n" +u.getClass().getSimpleName());
        return u;
    }
}
