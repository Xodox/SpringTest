package com.xod.batch.server.bean;

import com.xod.batch.server.dto.Customer;

import java.util.List;

public interface CustomerDao {

    public List<Customer> findCustomers(String name);

    public Customer findCustomerById(String id);

    public Customer createCustomer(Customer cust);

    public void updateCustomer(Customer customer);


}
