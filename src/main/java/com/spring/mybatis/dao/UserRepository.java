package com.spring.mybatis.dao;

import com.spring.mybatis.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * Created by ye on 2017/9/22.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(int id);
    @Query("select u from User u where u.id=?1")
    User huoQuUser(int id);
}
