package com.spring.mybatis.mapper;

import com.spring.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ye on 2017/7/8.
 */
@Mapper
public interface UserMapper {
    public User findUserByid(int id);
    public void insertUser(User user);
}
