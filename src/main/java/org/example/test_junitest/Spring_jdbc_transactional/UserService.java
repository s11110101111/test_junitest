package org.example.test_junitest.Spring_jdbc_transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
//@Service
@Transactional//implements IUserService
public class UserService  {

    @Autowired
    private MailService mailService;

    @Autowired // @Inject..@Resource
    private UserDAO userDao;


    public void register(User user) {

        System.out.println("Transaction open? "+ this.getClass() +" === " + TransactionSynchronizationManager.isActualTransactionActive());

        mailService.sendWelcomeEmail(user);
        userDao.save(user);

        System.out.println("Transaction open? " + TransactionSynchronizationManager.isActualTransactionActive());
        // 1. save the user to a database.persistent storage..
        // 2. send the user a welcome email
        // 3..risk /balance check....
    }


    public void closeAccount(User user) {
        System.out.println("Closing the users account: " + user.getEmail());
    }

}
