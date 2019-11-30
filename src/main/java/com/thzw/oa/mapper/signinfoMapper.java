package com.thzw.oa.mapper;

import com.thzw.oa.entity.signinfo;

public interface signinfoMapper {
    int deleteByPrimaryKey(Integer signid);

    int insert(signinfo record);

    int insertSelective(signinfo record);

    signinfo selectByPrimaryKey(Integer signid);

    int updateByPrimaryKeySelective(signinfo record);

    int updateByPrimaryKey(signinfo record);
}