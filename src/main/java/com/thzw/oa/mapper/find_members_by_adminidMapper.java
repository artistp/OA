package com.thzw.oa.mapper;

import com.thzw.oa.entity.find_members_by_adminid;
import com.thzw.oa.entity.find_members_by_adminidExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface find_members_by_adminidMapper {
    int countByExample(find_members_by_adminidExample example);

    int deleteByExample(find_members_by_adminidExample example);

    int insert(find_members_by_adminid record);

    int insertSelective(find_members_by_adminid record);

    List<find_members_by_adminid> selectByExample(find_members_by_adminidExample example);

    int updateByExampleSelective(@Param("record") find_members_by_adminid record, @Param("example") find_members_by_adminidExample example);

    int updateByExample(@Param("record") find_members_by_adminid record, @Param("example") find_members_by_adminidExample example);
}