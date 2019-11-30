package com.thzw.oa.controller;


import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(value = "/Login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public String Longin(){
        System.out.println("11111111");
        return "/login.html";
    }

    @RequestMapping(value = "/tologin")
    @ResponseBody
    public String toLogin(String phone,String pwd){
        System.out.println("222222222222222");
        userbaseinfo user = loginService.toLogin(phone,pwd);
        if(user.getName()!=null&&user.getPwd()!=null){
            System.out.println("success");
            return "success";
        }else{
            System.out.println("error");
            return "error";
        }
    }
}
