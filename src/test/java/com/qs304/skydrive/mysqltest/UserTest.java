package com.qs304.skydrive.mysqltest;

import com.qs304.skydrive.entity.User;
import com.qs304.skydrive.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    UserMapper usermapper;
    @Test
    public void inserUser(){
        usermapper.insert(new User("岳阳",999999,"1354669134","123456"));
    }
}
