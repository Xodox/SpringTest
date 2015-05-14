package com.xod.batch.server;

import com.xod.batch.server.bean.CustomerAddressDao;
import com.xod.batch.server.bean.CustomerAddressDaoImpl;
import com.xod.batch.server.bean.CustomerDao;
import com.xod.batch.server.bean.CustomerDaoImpl;
import com.xod.batch.server.dao.UserStoryDao;
import com.xod.batch.server.dao.UserStoryDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootApplicationContext {

    @Bean
    public CustomerDao getCustomerDaoBean(){
        return new CustomerDaoImpl();
    }

    @Bean
    public CustomerAddressDao getCustomerAddressDao(){
        return new CustomerAddressDaoImpl();
    }

    @Bean
    public UserStoryDao getUserStoryDao(){
        return new UserStoryDaoImpl();
    }

}

