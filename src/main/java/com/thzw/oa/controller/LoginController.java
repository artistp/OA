package com.thzw.oa.controller;


import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    @ResponseBody
    @RequestMapping(value = "/tologin")
    public String toLogin(String phone,String pwd,HttpSession session){
        System.out.println(phone);
        System.out.println(pwd);
        userbaseinfo user = loginService.toLogin(phone,pwd);
        session.setAttribute("LoginedUser",user);
        if(user.getName()!=null&&user.getPwd()!=null){
            return "index.html";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/loginout")
    public String LoginOut(HttpSession session){
        if(session.getAttribute("LoginedUser")!=null) {
            session.removeAttribute("LoginedUser");
            return "success";
        }else{
            return "error";
        }
    }


    /*
    * 提供一个数据接口：获取当前登录的用户信息
    *
    * 以便前端获取当前登录者的信息
    * */
    @ResponseBody
    @RequestMapping(value = "/loginedInfo")
    public userbaseinfo loginInfo(HttpSession session){
        userbaseinfo info = (userbaseinfo)session.getAttribute("LoginedUser");
        if( info == null)
        {
            return null;
        }
        else {
            return info;
        }
    }

}
