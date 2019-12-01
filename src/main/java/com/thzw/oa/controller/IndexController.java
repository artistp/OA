package com.thzw.oa.controller;

import com.thzw.oa.entity.im_count_view_by_adminid;
import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/selectIm")
    @ResponseBody
    public List<im_count_view_by_adminid> selectIm(HttpSession session)
    {
        // 获取session   已登录的用户的账户session
        userbaseinfo logineduser = (userbaseinfo)session.getAttribute("LoginedUser");
        if( logineduser == null)
            return null;
        long id = logineduser.getAccreditedvillageid();
        List<im_count_view_by_adminid> findimByAdminids = indexService.getims(id);

        return findimByAdminids;
    }
}
