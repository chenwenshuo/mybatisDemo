package com.cws.mybatis.mapper;

import com.cws.mybatis.baen.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: chenwenshuo
 * @Date: 2021/07/16/7:15 下午
 */
@Mapper
public interface UserMapper {
    List<User> queryAllUser();
}
