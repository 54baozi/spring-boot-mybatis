package com.spring.mybatis.controller;

import com.spring.mybatis.pojo.User;
import com.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ye on 2017/7/8.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/findOne/{id}")
    public User findUserByid(@PathVariable int id){
        User user = userService.findUserByid(id);
        return user;
    }
    @RequestMapping("/user/addUser")
    public String addUser(User user){
        userService.insertUser(user);
        return "添加成功!";
    }
}
