package com.thzw.oa.mapper;

import com.thzw.oa.entity.imtomember;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface imtomemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(imtomember record);

    int insertSelective(imtomember record);

    imtomember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(imtomember record);

    int updateByPrimaryKey(imtomember record);
}