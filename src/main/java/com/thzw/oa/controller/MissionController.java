package com.thzw.oa.controller;

import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.entity.teammates_select_mission;
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
        long id = logineduser.getUserid();

        // 先发布任务
        adminiminfo inf = adminimService.addMission(info ,id);
        // 任务发布到队员
        List<find_members_by_adminid> findMembersByAdminids = missionService.getmates(id);
        adminimService.missionToUser(inf, findMembersByAdminids);
        return "success";
    }




    @RequestMapping("/deleteMission")
    @ResponseBody
    public String deleteMission(Integer imid, HttpSession session)
    {
//        // 获取session   已登录的用户的账户session
//        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
//        if( logineduser == null)
//            return "请登录！";
//        long id = logineduser.getAccreditedvillageid();
        // imid = 3;
        int ret = adminimService.deleteMission(imid);
        if (ret == -1)
            return "信息错误！请检查输入！";
        return "success";
    }


    @RequestMapping("/updateMission")
    @ResponseBody
    public String updateMission(adminiminfo info, HttpSession session)
    {
        // 获取session   已登录的用户的账户session
        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
        if( logineduser == null)
            return "请登录！";
//         测试：
//        adminiminfo test = new adminiminfo();
//
//        test.setImid(2);
//        test.setTitle("title");
//        test.setImcontent("IMContent");
//        test.setStime(new Date());
//        test.setEtime(new Date());
//        test.setUserid((long)6);
//        Byte imtype = 0b01;
//        test.setImtype(imtype);
        int imid = (int)session.getAttribute("IMID_UPDATE");
        info.setImid(imid);
        info.setUserid(logineduser.getUserid());
        Byte imtype = 0b01;
        info.setImtype(imtype);
        int ret = adminimService.updateMission(info);
        if (ret == -1)
            return "信息错误！请检查输入！";
        return "success";
    }


    @RequestMapping("/selectMission")
    @ResponseBody
    public List<teammates_select_mission> selectMission(HttpSession session)
    {
        /*
        // 获取session   已登录的用户的账户session
        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
        if( logineduser == null)
            return null;
            */
        /*
        adminiminfo test = new adminiminfo();

        test.setTitle("title");
        test.setImcontent("IMContent");
        test.setStime(new Date());
        test.setEtime(new Date());
        test.setUserid((long)6);
        Byte imtype = 0b01;
        test.setImtype(imtype);
        */

        long id = 75; //logineduser.getAccreditedvillageid();
        List<teammates_select_mission> list = adminimService.selectMission(id);
        return list;
    }



    @RequestMapping("updateRequest")
    public String updateRequest(int imid,HttpSession session)
    {
        session.setAttribute("IMID_UPDATE",imid);
        return "redirect:/captain/updateView";
    }

    @RequestMapping("/updateView")
    public String updateView()
    {
        return "/update.html";
    }

}
/*
2019-12-01
高级数据库第十六组
办公OA系统
何超凡、唐佳、吴鹏、赵雷
*/
