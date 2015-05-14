package com.xod.batch.server.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by protsenkov on 5/14/2015.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class UserStory {

    public String name;

    public String desc;

    public UserStory() {
    }

    public UserStory(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
