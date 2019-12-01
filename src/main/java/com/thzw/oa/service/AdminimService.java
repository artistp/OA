package com.thzw.oa.service;

import com.thzw.oa.entity.adminiminfo;
import com.thzw.oa.entity.adminiminfoExample;
import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.entity.imtomember;
import com.thzw.oa.mapper.adminiminfoMapper;
import com.thzw.oa.mapper.imtomemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminimService implements AdminimS {

    @Autowired
    private adminiminfoMapper adminiminfoMapper;

    @Autowired
    private imtomemberMapper imtomemberMapper;

    /*
    * 添加任务到任务列表
    *
    * 任务信息使用基本类型存储
    * */
    public adminiminfo addMission(String title, String IMContent, Date Stime, Date Etime , long UserId)
    {
        adminiminfoExample example = new adminiminfoExample();
        int count = adminiminfoMapper.countByExample( example );

        adminiminfo info = new adminiminfo();

        info.setImid( count+1 );
        info.setTitle(title);
        info.setImcontent(IMContent);
        info.setStime(Stime);
        info.setEtime(Etime);
        info.setUserid(UserId);
        Byte imtype = 0b01;
        info.setImtype(imtype);
        int ret = adminiminfoMapper.insert(info);

        return info;
    }
    /*
     * 添加任务到任务列表
     *
     * 任务信息使用 任务类adminiminfo存储
     * */
    public adminiminfo addMission(adminiminfo info ,long id)
    {
        adminiminfoExample example = new adminiminfoExample();
        int count = adminiminfoMapper.countByExample( example );

        info.setImid( count+1 );
        Byte imtype = 0b01;

        info.setImtype(imtype);
        int ret = adminiminfoMapper.insert(info);

        return info;
    }

    /*
     * 队长 发布任务给 管理的队员
     *
     *@ 任务信息使用 任务类adminiminfo存储
     *@ List<find_members_by_adminid> findM 保存队长的信息
     * */
    public int missionToUser(adminiminfo inf, List<find_members_by_adminid> findM)
    {
        int missionID = inf.getImid();
        long captainID = inf.getUserid();
        Byte check = 0;
        for(int i =0;i <findM.size();i++)
        {
            imtomember imtomem = new imtomember();
            imtomem.setIfcheck(check);
            imtomem.setImid(missionID);
            find_members_by_adminid mem = findM.get(i);
            long memID = mem.getMemberId();
            imtomem.setTouserid(memID);
            imtomemberMapper.insert( imtomem );
        }
        return 1;
    }
}
//