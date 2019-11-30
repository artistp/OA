package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedvillageinfo;

public interface accreditedvillageinfoMapper {
    int deleteByPrimaryKey(Integer accreditedvillageid);

    int insert(accreditedvillageinfo record);

    int insertSelective(accreditedvillageinfo record);

    accreditedvillageinfo selectByPrimaryKey(Integer accreditedvillageid);

    int updateByPrimaryKeySelective(accreditedvillageinfo record);

    int updateByPrimaryKey(accreditedvillageinfo record);
}