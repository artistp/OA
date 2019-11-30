package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedtowninfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface accreditedtowninfoMapper {
    int deleteByPrimaryKey(Integer accreditedtownid);

    int insert(accreditedtowninfo record);

    int insertSelective(accreditedtowninfo record);

    accreditedtowninfo selectByPrimaryKey(Integer accreditedtownid);

    int updateByPrimaryKeySelective(accreditedtowninfo record);

    int updateByPrimaryKey(accreditedtowninfo record);
}