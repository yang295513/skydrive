package com.qs304.skydrive.controller;

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
        return "login";
    }
}
