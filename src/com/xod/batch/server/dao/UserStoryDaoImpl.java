package com.xod.batch.server.dao;

import com.xod.batch.server.dto.UserStory;

/**
 * Created by protsenkov on 5/14/2015.
 */
public class UserStoryDaoImpl implements UserStoryDao {
    @Override
    public UserStory findUserStoryById(String id) {
        return new UserStory("usname_" + id , "usdesc_"+ id);
    }
}
