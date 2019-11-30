package com.thzw.oa.service;

import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.mapper.userbaseinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService{
    @Autowired
    private userbaseinfoMapper userMapper;

    public userbaseinfo toLogin(String username, String password){
        userbaseinfo user=new userbaseinfo();
        user.setPhone(username);
        user.setPwd(password);
        user = userMapper.selectByPhone(user);
//        if (user!=null){
//            System.out.println("sersuccess");
//            System.out.println(user.getName());
//        }else{
//            System.out.println("sererror");
//        }
        return user;
    }
}
