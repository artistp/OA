package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedvillageinfo;
import com.thzw.oa.entity.accreditedvillageinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface accreditedvillageinfoMapper {
    int countByExample(accreditedvillageinfoExample example);

    int deleteByExample(accreditedvillageinfoExample example);

    int deleteByPrimaryKey(Integer accreditedvillageid);

    int insert(accreditedvillageinfo record);

    int insertSelective(accreditedvillageinfo record);

    List<accreditedvillageinfo> selectByExample(accreditedvillageinfoExample example);

    accreditedvillageinfo selectByPrimaryKey(Integer accreditedvillageid);

    int updateByExampleSelective(@Param("record") accreditedvillageinfo record, @Param("example") accreditedvillageinfoExample example);

    int updateByExample(@Param("record") accreditedvillageinfo record, @Param("example") accreditedvillageinfoExample example);

    int updateByPrimaryKeySelective(accreditedvillageinfo record);

    int updateByPrimaryKey(accreditedvillageinfo record);
}