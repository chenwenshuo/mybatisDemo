package com.cws.mybatis.service.impl;

import com.cws.mybatis.baen.User;
import com.cws.mybatis.mapper.UserMapper;
import com.cws.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chenwenshuo
 * @Date: 2021/07/16/7:30 下午
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryAllUser() {
        List<User> users = userMapper.queryAllUser();
        System.out.println(users);
        return users;
    }
}
