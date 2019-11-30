package com.thzw.oa.mapper;

import com.thzw.oa.entity.signinfo;
import com.thzw.oa.entity.signinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface signinfoMapper {
    int countByExample(signinfoExample example);

    int deleteByExample(signinfoExample example);

    int deleteByPrimaryKey(Integer signid);

    int insert(signinfo record);

    int insertSelective(signinfo record);

    List<signinfo> selectByExample(signinfoExample example);

    signinfo selectByPrimaryKey(Integer signid);

    int updateByExampleSelective(@Param("record") signinfo record, @Param("example") signinfoExample example);

    int updateByExample(@Param("record") signinfo record, @Param("example") signinfoExample example);

    int updateByPrimaryKeySelective(signinfo record);

    int updateByPrimaryKey(signinfo record);
}