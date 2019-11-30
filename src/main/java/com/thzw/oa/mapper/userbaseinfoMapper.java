package com.thzw.oa.mapper;

import com.thzw.oa.entity.userbaseinfo;

public interface userbaseinfoMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(userbaseinfo record);

    int insertSelective(userbaseinfo record);

    userbaseinfo selectByPrimaryKey(Long userid);

    userbaseinfo selectByPhone(userbaseinfo record);

    int updateByPrimaryKeySelective(userbaseinfo record);

    int updateByPrimaryKey(userbaseinfo record);
}