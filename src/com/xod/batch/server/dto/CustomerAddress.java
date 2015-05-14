package com.xod.batch.server.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by protsenkov on 5/13/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAddress {

    String streetName;
    String streetNumber;
    String appartament;

    public CustomerAddress(){}

    public CustomerAddress(String streetName, String streetNumber, String appartament) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.appartament = appartament;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getAppartament() {
        return appartament;
    }
}
