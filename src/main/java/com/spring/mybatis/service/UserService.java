package com.spring.mybatis.service;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ye on 2017/7/8.
 */
public interface UserService {
    public User findUserByid(int id);
    public void insertUser(User user);
}
