package com.thzw.oa.mapper;

import com.thzw.oa.entity.imfilemapinfo;
import com.thzw.oa.entity.imfilemapinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface imfilemapinfoMapper {
    int countByExample(imfilemapinfoExample example);

    int deleteByExample(imfilemapinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(imfilemapinfo record);

    int insertSelective(imfilemapinfo record);

    List<imfilemapinfo> selectByExample(imfilemapinfoExample example);

    imfilemapinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") imfilemapinfo record, @Param("example") imfilemapinfoExample example);

    int updateByExample(@Param("record") imfilemapinfo record, @Param("example") imfilemapinfoExample example);

    int updateByPrimaryKeySelective(imfilemapinfo record);

    int updateByPrimaryKey(imfilemapinfo record);
}