package com.xod.batch.client;

import com.xod.batch.server.dto.Customer;
import com.xod.batch.server.dto.UserStory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by protsenkov on 5/14/2015.
 */
public class RestApiCunsumer {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Customer customer = restTemplate.getForObject("http://localhost:8080/customer/123", Customer.class);
        System.out.println(customer.getAddress().getStreetNumber() + "==" + customer.getName());


        UserStory us = restTemplate.getForObject("http://localhost:8080/userstory/1234", UserStory.class);
        System.out.println(us.getName());
    }
}
