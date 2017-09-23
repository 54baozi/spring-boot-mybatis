package com.spring.mybatis.service.impl;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.pojo.User;
import com.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ye on 2017/7/8.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserByid(int id) {
        User user = userMapper.findUserByid(id);
        return user;
    }
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

}
