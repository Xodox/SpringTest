package com.xod.batch.server.controller;

import com.xod.batch.server.dao.UserStoryDao;
import com.xod.batch.server.dto.UserStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by protsenkov on 5/14/2015.
 */
@RestController
@RequestMapping("/userstory")
public class UserStoryController {

    @Autowired
    private UserStoryDao userStoryDao;

    @RequestMapping("/{id}")
    public UserStory getUserStory(@PathVariable("id") String id){

        return userStoryDao.findUserStoryById(id);
    }

}
