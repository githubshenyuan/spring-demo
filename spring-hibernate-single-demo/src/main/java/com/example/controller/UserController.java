package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author sh 2018/11/12 9:56
 * @version ideaIU-2018.2.5.win
 */
@Controller
public class UserController {
    @Resource
    UserService userService;

    public void save() {
        User user = new User();
        user.setUserName("xiaoming");
        user.setPassword("password");
        user.setSex("1");
        user.setAge("1");

        userService.save(user);
    }



}
