package org.example.test_junitest.Spring_jdbc_transactional;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class UserServiceTest {

    @Test
    public void closeAccount() {

        IUserService userService = new UserService() {
        };

        IUserService proxiedUserService = (IUserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class[]{IUserService.class},

                new TransactionalInvocationHandler(userService));
        // cglib..proxies...


        proxiedUserService.closeAccount(new User("franz", "franz@germany.de"));
    }
}