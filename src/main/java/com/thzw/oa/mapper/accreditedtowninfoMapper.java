package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedtowninfo;

public interface accreditedtowninfoMapper {
    int deleteByPrimaryKey(Integer accreditedtownid);

    int insert(accreditedtowninfo record);

    int insertSelective(accreditedtowninfo record);

    accreditedtowninfo selectByPrimaryKey(Integer accreditedtownid);

    int updateByPrimaryKeySelective(accreditedtowninfo record);

    int updateByPrimaryKey(accreditedtowninfo record);
}