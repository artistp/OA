package com.thzw.oa.mapper;

import com.thzw.oa.entity.accreditedcountryinfo;
import com.thzw.oa.entity.accreditedcountryinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface accreditedcountryinfoMapper {
    int countByExample(accreditedcountryinfoExample example);

    int deleteByExample(accreditedcountryinfoExample example);

    int deleteByPrimaryKey(Integer accreditedcountryid);

    int insert(accreditedcountryinfo record);

    int insertSelective(accreditedcountryinfo record);

    List<accreditedcountryinfo> selectByExample(accreditedcountryinfoExample example);

    accreditedcountryinfo selectByPrimaryKey(Integer accreditedcountryid);

    int updateByExampleSelective(@Param("record") accreditedcountryinfo record, @Param("example") accreditedcountryinfoExample example);

    int updateByExample(@Param("record") accreditedcountryinfo record, @Param("example") accreditedcountryinfoExample example);

    int updateByPrimaryKeySelective(accreditedcountryinfo record);

    int updateByPrimaryKey(accreditedcountryinfo record);
}