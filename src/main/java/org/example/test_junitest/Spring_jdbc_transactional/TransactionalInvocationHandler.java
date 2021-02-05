package org.example.test_junitest.Spring_jdbc_transactional;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransactionalInvocationHandler  implements InvocationHandler {
    private final IUserService userService;

    public TransactionalInvocationHandler(IUserService userService) {
        this.userService = userService;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Open up a database connection");
        Object result = method.invoke(userService, args);
        System.out.println("closing the database connection");
        return result;
    }
}
