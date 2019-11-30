package com.thzw.oa.service;


import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.entity.find_members_by_adminidExample;
import com.thzw.oa.mapper.find_members_by_adminidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MissionService implements MissionS{


    @Autowired
    private find_members_by_adminidMapper findMembersByAdminidMapper;

    @Override
    public List<find_members_by_adminid> getmates(long id)
    {
        find_members_by_adminidExample example = new find_members_by_adminidExample();
        find_members_by_adminidExample.Criteria criteria = example.createCriteria();
        criteria.andAdminidEqualTo(id);
        List<find_members_by_adminid> findMembersByAdminids = findMembersByAdminidMapper.selectByExample(example);
        return findMembersByAdminids;
    }
}
