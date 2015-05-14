package com.xod.batch.server.bean;

import com.xod.batch.server.dto.Customer;
import com.xod.batch.server.dto.CustomerAddress;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by protsenkov on 5/14/2015.
 */
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    CustomerAddressDao customerAddressDao;

    @Override
    public List<Customer> findCustomers(String name) {
        return null;
    }

    @Override
    public Customer findCustomerById(String id) {
        System.out.println("findCustomerById");
        return new Customer( customerAddressDao.getAddressById("123"), id, "name", "desc");
    }

    @Override
    public Customer createCustomer(Customer cust) {
        return cust;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
