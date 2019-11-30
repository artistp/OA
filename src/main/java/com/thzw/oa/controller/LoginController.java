package com.thzw.oa.controller;


import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public String Longin(){
        return "/login.html";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "/index.html";
    }

    @RequestMapping(value = "/tologin")
    @ResponseBody
    public String toLogin(String phone,String pwd){
        System.out.println(phone);
        System.out.println(pwd);
        userbaseinfo user = loginService.toLogin(phone,pwd);
        if(user.getName()!=null&&user.getPwd()!=null){
            return "index.html";
        }else{
            return "error";
        }
    }
}
