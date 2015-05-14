package com.xod.batch.server.dao;

import com.xod.batch.server.dto.UserStory;

/**
 * Created by protsenkov on 5/14/2015.
 */
public interface UserStoryDao {

    public UserStory findUserStoryById(String id);
}
