package com.thzw.oa.service;

import com.thzw.oa.entity.adminiminfo;
import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.entity.teammates_select_mission;

import java.util.Date;
import java.util.List;

public interface AdminimS {

    public adminiminfo addMission(String title, String content, Date stime, Date etime , long id);

    public adminiminfo addMission(adminiminfo info ,long id);

    public int missionToUser(adminiminfo inf, List<find_members_by_adminid> findM);

    public int deleteMission(int imid);

    public List<teammates_select_mission> selectMission(long userid);
}
/*
2019-12-01
高级数据库第十六组
办公OA系统
何超凡、唐佳、吴鹏、赵雷
*/