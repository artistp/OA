package com.thzw.oa.mapper;

import com.thzw.oa.entity.find_members_by_adminid;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface find_members_by_adminidMapper {
    int insert(find_members_by_adminid record);

    int insertSelective(find_members_by_adminid record);
}