package com.xod.batch.server.bean;

import com.xod.batch.server.dto.CustomerAddress;

/**
 * Created by protsenkov on 5/14/2015.
 */
public interface CustomerAddressDao {

    public CustomerAddress getAddressById(String id);

    public CustomerAddress createCustomerAddress(CustomerAddress customerAddress);

    public void updateCustomerAddress(CustomerAddress customerAddress);


}
