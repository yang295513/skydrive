package com.qs304.skydrive.controller;

import com.alibaba.fastjson.JSONObject;
import com.qs304.skydrive.entity.User;
import com.qs304.skydrive.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    UserMapper usermapper;

    @RequestMapping("/hello")
    public String hello(){
        String username;
        usermapper.insert(new User("岳阳",99999,"1354669134","123456"));
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("usermapper",usermapper.selectByPrimaryKey(1));
        return jsonObject.toJSONString();
    }
}
