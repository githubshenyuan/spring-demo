package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sh 2018/11/12 9:56
 * @version ideaIU-2018.2.5.win
 */
@Service
public class UserService {
    @Resource
    UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);

    }
}
