package com.thzw.oa.mapper;

import com.thzw.oa.entity.filesinfo;

public interface filesinfoMapper {
    int deleteByPrimaryKey(Integer fileid);

    int insert(filesinfo record);

    int insertSelective(filesinfo record);

    filesinfo selectByPrimaryKey(Integer fileid);

    int updateByPrimaryKeySelective(filesinfo record);

    int updateByPrimaryKey(filesinfo record);
}