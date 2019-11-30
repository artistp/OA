package com.thzw.oa.mapper;

import com.thzw.oa.entity.imfilemapinfo;

public interface imfilemapinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(imfilemapinfo record);

    int insertSelective(imfilemapinfo record);

    imfilemapinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(imfilemapinfo record);

    int updateByPrimaryKey(imfilemapinfo record);
}