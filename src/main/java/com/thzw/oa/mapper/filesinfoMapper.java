package com.thzw.oa.mapper;

import com.thzw.oa.entity.filesinfo;
import com.thzw.oa.entity.filesinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface filesinfoMapper {
    int countByExample(filesinfoExample example);

    int deleteByExample(filesinfoExample example);

    int deleteByPrimaryKey(Integer fileid);

    int insert(filesinfo record);

    int insertSelective(filesinfo record);

    List<filesinfo> selectByExample(filesinfoExample example);

    filesinfo selectByPrimaryKey(Integer fileid);

    int updateByExampleSelective(@Param("record") filesinfo record, @Param("example") filesinfoExample example);

    int updateByExample(@Param("record") filesinfo record, @Param("example") filesinfoExample example);

    int updateByPrimaryKeySelective(filesinfo record);

    int updateByPrimaryKey(filesinfo record);
}