package org.example.test_junitest.test_helper;

import lombok.SneakyThrows;

public class TestHelper {
    @SneakyThrows
    public static <T> T getInstance(Class<T> requiredTestInterfaceClass) {
        final String implClassName = requiredTestInterfaceClass.getName() + "Impl";
        final Class<?> implClass = Class.forName(implClassName);

        return (T) implClass.getDeclaredConstructor().newInstance();
    }
}
