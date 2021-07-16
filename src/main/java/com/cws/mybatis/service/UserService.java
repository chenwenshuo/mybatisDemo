package com.cws.mybatis.service;

import com.cws.mybatis.baen.User;

import java.util.List;

/**
 * @Author: chenwenshuo
 * @Date: 2021/07/16/7:29 下午
 */
public interface UserService {
    List<User> queryAllUser();
}
