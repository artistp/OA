package com.thzw.oa.mapper;

import com.thzw.oa.entity.imtomember;
import com.thzw.oa.entity.imtomemberExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface imtomemberMapper {
    int countByExample(imtomemberExample example);

    int deleteByExample(imtomemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(imtomember record);

    int insertSelective(imtomember record);

    List<imtomember> selectByExample(imtomemberExample example);

    imtomember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") imtomember record, @Param("example") imtomemberExample example);

    int updateByExample(@Param("record") imtomember record, @Param("example") imtomemberExample example);

    int updateByPrimaryKeySelective(imtomember record);

    int updateByPrimaryKey(imtomember record);
}