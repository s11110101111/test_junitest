package org.example.test_junitest.Spring_jdbc_transactional;

public interface IUserService {
    void register(User user);
    void closeAccount(User user);

}
