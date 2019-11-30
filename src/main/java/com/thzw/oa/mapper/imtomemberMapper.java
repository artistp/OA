package com.thzw.oa.mapper;

import com.thzw.oa.entity.imtomember;

public interface imtomemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(imtomember record);

    int insertSelective(imtomember record);

    imtomember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(imtomember record);

    int updateByPrimaryKey(imtomember record);
}