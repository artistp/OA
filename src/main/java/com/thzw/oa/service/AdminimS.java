package com.thzw.oa.service;

import com.thzw.oa.entity.adminiminfo;
import com.thzw.oa.entity.find_members_by_adminid;

import java.util.Date;
import java.util.List;

public interface AdminimS {

    public adminiminfo addMission(String title, String content, Date stime, Date etime, long id);

    public adminiminfo addMission(adminiminfo info, long id);

    public int missionToUser(adminiminfo inf, List<find_members_by_adminid> findM);
}
