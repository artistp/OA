package com.thzw.oa.controller;

import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.service.AdminimService;
import com.thzw.oa.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.thzw.oa.entity.adminiminfo;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/captain")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @Autowired
    private AdminimService adminimService;

    @RequestMapping("/MappingView")
    public String captainMapping()
    {
        return "captain_mappingmates.html";
    }


    @RequestMapping("/selectMapping")
    @ResponseBody
    public List<find_members_by_adminid> selectMapping(HttpSession session)
    {
        // 获取session   已登录的用户的账户session
        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
        if( logineduser == null)
            return null;
        long id = logineduser.getAccreditedvillageid();
        List<find_members_by_adminid> findMembersByAdminids = missionService.getmates(6);
        return findMembersByAdminids;
    }


    @RequestMapping("/distMission")
    @ResponseBody
    public String distMission(adminiminfo info, HttpSession session)
    {
        // 获取session   已登录的用户的账户session
        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
        if( logineduser == null)
            return null;
        long id = logineduser.getAccreditedvillageid();

        // 先发布任务
        adminiminfo inf = adminimService.addMission(info ,id);
        // 任务发布到队员
        List<find_members_by_adminid> findMembersByAdminids = missionService.getmates(id);
        adminimService.missionToUser(inf, findMembersByAdminids);
        return "OK";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpSession session)
    {
        /*
        // 获取session   已登录的用户的账户session
        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
        if( logineduser == null)
            return null;

         */
        adminiminfo test = new adminiminfo();

        test.setTitle("title");
        test.setImcontent("IMContent");
        test.setStime(new Date());
        test.setEtime(new Date());
        test.setUserid((long)6);
        Byte imtype = 0b01;
        test.setImtype(imtype);



        long id = 6; //logineduser.getAccreditedvillageid();

        // 先发布任务
        adminiminfo inf = adminimService.addMission(test ,id);
        // 任务发布到队员
        List<find_members_by_adminid> findMembersByAdminids = missionService.getmates(id);
        adminimService.missionToUser(inf, findMembersByAdminids);
        return "OK";
    }
}
