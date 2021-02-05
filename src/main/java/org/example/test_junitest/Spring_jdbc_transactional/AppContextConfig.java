package org.example.test_junitest.Spring_jdbc_transactional;

import com.mysql.cj.jdbc.Driver;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan()
//@EnableTransactionManagement
public class AppContextConfig {
    @Bean
//properties ... @value
    public MailService mailService() {
        return new MailService("gmail.com", "gavrila@gmail.com", 45453);
    }
@Bean
public PlatformTransactionManager txManager(){

        return new DataSourceTransactionManager(dataSource());
}

    @SneakyThrows
    @Bean
    public DataSource dataSource(){

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new Driver());
        ds.setUrl("jdbc:mysql://localhost:3306/test");
        ds.setPassword("root");
        ds.setUsername("root");
        return ds;    }


}
