package com.thzw.oa.controller;

import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/captain")
public class MissionController {

    @Autowired(required = false)
    private MissionService missionService;

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
        // Userbaseinfo logineduser = (Userbaseinfo)session.getAttribute("LoginedUser");
        // if( logineduser == null)
            //return null;
        // long id = logineduser.getAccreditedvillageid();
        List<find_members_by_adminid> findMembersByAdminids = missionService.getmates(6);
        return findMembersByAdminids;
    }
}
