package org.example.test_junitest.Spring_jdbc_transactional;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
@Component
public class UserDAO {
    private final DataSource dataSource;

    public UserDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Transactional
    public void save(User user){
String strTrans = ColorANSI.GREEN.fillColor("Transactio open? " + this.getClass() +" === "+
        TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println(strTrans);
        System.out.println("Saving user to the DB via datasource " + dataSource
                +"\n"+ user.toString());
        //TODO saving to the DB here ...


    }

}
