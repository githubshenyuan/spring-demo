package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author sh 2018/11/12 10:09
 * @version ideaIU-2018.2.5.win
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:applicationContext.xml" )
public class UserControllerTest {
    @Resource
    UserController userController;
    @Test
    public void save() {
        userController.save();

    }
}