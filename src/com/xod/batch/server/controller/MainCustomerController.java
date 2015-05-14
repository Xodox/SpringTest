package com.xod.batch.server.controller;

import com.xod.batch.server.bean.CustomerAddressDao;
import com.xod.batch.server.bean.CustomerDao;
import com.xod.batch.server.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class MainCustomerController {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    private CustomerAddressDao customerAddressDao;


    @RequestMapping(value = "/customer/{id}")
    public Customer createCustomer(@PathVariable String id){
        return customerDao.findCustomerById(id);
    }

    @RequestMapping(value = "/customer/new/{name}/{desc}/{customerAddressId}")
    public Customer createCustomer(@PathVariable String name, @PathVariable String desc, @PathVariable("customerAddressId") String customerAddressId){

        Customer cust = new Customer(customerAddressDao.getAddressById(customerAddressId), null, name, desc);
        System.out.println("create customer: " + cust);
        return customerDao.createCustomer(cust);
    }


    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hellllllooooo   woorld";
    }

}
