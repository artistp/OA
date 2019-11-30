package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedtowninfo;
import com.thzw.oa.entity.accreditedtowninfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface accreditedtowninfoMapper {
    int countByExample(accreditedtowninfoExample example);

    int deleteByExample(accreditedtowninfoExample example);

    int deleteByPrimaryKey(Integer accreditedtownid);

    int insert(accreditedtowninfo record);

    int insertSelective(accreditedtowninfo record);

    List<accreditedtowninfo> selectByExample(accreditedtowninfoExample example);

    accreditedtowninfo selectByPrimaryKey(Integer accreditedtownid);

    int updateByExampleSelective(@Param("record") accreditedtowninfo record, @Param("example") accreditedtowninfoExample example);

    int updateByExample(@Param("record") accreditedtowninfo record, @Param("example") accreditedtowninfoExample example);

    int updateByPrimaryKeySelective(accreditedtowninfo record);

    int updateByPrimaryKey(accreditedtowninfo record);
}