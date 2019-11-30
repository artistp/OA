package com.thzw.oa.service;

import com.thzw.oa.entity.userbaseinfo;

import com.thzw.oa.mapper.userbaseinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {
    @Autowired(required = false)
    private userbaseinfoMapper userMapper;

    public userbaseinfo toLogin(String username, String password){
        System.out.println("service");
        userbaseinfo user=new userbaseinfo();
        user.setPhone(username);
        user.setPwd(password);
        if (user!=null){
            System.out.println("sersuccess");
        }else{
            System.out.println("sererror");
        }
        // user= userMapper.selectByPhone(user);
        return user;
    }
}
