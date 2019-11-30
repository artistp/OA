package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedcountryinfo;

public interface accreditedcountryinfoMapper {
    int deleteByPrimaryKey(Integer accreditedcountryid);

    int insert(accreditedcountryinfo record);

    int insertSelective(accreditedcountryinfo record);

    accreditedcountryinfo selectByPrimaryKey(Integer accreditedcountryid);

    int updateByPrimaryKeySelective(accreditedcountryinfo record);

    int updateByPrimaryKey(accreditedcountryinfo record);
}