package com.qs304.skydrive.controller;

import com.alibaba.fastjson.JSONObject;
import com.qs304.skydrive.entity.User;
import com.qs304.skydrive.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping(value = "/singin",method = RequestMethod.POST)
    public String login(String accound,String password){
        JSONObject jsonObject=new JSONObject();
        System.out.println(accound+password);
        List<User> list=service.login(accound,password);
        if(list.size()==0){
            jsonObject.put("code","100");
            jsonObject.put("msg","登陆失败，账号或者密码错误");
            jsonObject.put("user",list);
        }else{
            jsonObject.put("code","200");
            jsonObject.put("msg","登陆成功");
        }
        return jsonObject.toJSONString();
    }
    @RequestMapping(value = "/singup",method = RequestMethod.POST)
    public String singup(String accound,String password,String yqm,String name){
        JSONObject jsonObject=new JSONObject();
        if(yqm.equals("135466")){
            if(service.login(accound,password).size()==0) {
                jsonObject.put("code", "200");
                jsonObject.put("msg", "注册成功");
            }else{
                jsonObject.put("code", "100");
                jsonObject.put("msg", "注册失败账号已经存在");
            }
            service.singUp(accound,password,name);
        }else{
            jsonObject.put("code","100");
            jsonObject.put("msg","邀请码没有资格");
        }
        return jsonObject.toJSONString();
    }
}
