package com.qs304.skydrive.service;

import com.qs304.skydrive.entity.User;
import com.qs304.skydrive.entity.UserExample;
import com.qs304.skydrive.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginService {
    @Autowired
    UserMapper mapper;
    public List<User> login(String username, String passowrd){
        UserExample example=new UserExample();
        example.or().andAccoundEqualTo(username).andPasswordEqualTo(passowrd);
        example.setDistinct(true);
        return mapper.selectByExample(example);
    }

    public void singUp(String username,String password,String name){
        mapper.updateByPrimaryKey(new User(name,9999,username,password));
    }
}
