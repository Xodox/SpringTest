package com.xod.batch.server.bean;

import com.xod.batch.server.dto.CustomerAddress;

/**
 * Created by protsenkov on 5/14/2015.
 */
public class CustomerAddressDaoImpl implements CustomerAddressDao {
    @Override
    public CustomerAddress getAddressById(String id) {
        return new CustomerAddress("street name" + id, "street number" + id, "app_" + id);
    }

    @Override
    public CustomerAddress createCustomerAddress(CustomerAddress customerAddress) {
        return null;
    }

    @Override
    public void updateCustomerAddress(CustomerAddress customerAddress) {

    }
}
