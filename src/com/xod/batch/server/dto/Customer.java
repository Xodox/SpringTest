package com.xod.batch.server.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigInteger;

/**
 * Created by protsenkov on 5/13/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    @Value("${simple-name}")
    private String simpleName;


    CustomerAddress address;
    String id;
    String name;
    String desc;



    public Customer(){}

    public Customer(CustomerAddress address, String id, String name, String desc) {
        System.out.println("simpleName =  " + simpleName);
        this.address = address;
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
