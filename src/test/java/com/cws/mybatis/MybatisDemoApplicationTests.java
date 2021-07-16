package com.cws.mybatis;

import com.cws.mybatis.baen.User;
import com.cws.mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
private UserService userService;
    @Test
    void contextLoads() {
        List<User> users = userService.queryAllUser();

    }

}
