package org.example.test_junitest.Spring_jdbc_transactional;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//implements InvocationHandler
public class TransactionalInvocationHandler  implements InvocationHandler {
    private final UserService userService;

    public TransactionalInvocationHandler(UserService userService) {
        this.userService = userService;
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Open up a database connection");
        Object result = method.invoke(userService, args);
        System.out.println("closing the database connection");
        return result;
    }
}
