package com.thzw.oa.mapper;

import com.thzw.oa.entity.adminareainfo;
import com.thzw.oa.entity.adminareainfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface adminareainfoMapper {
    int countByExample(adminareainfoExample example);

    int deleteByExample(adminareainfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(adminareainfo record);

    int insertSelective(adminareainfo record);

    List<adminareainfo> selectByExample(adminareainfoExample example);

    adminareainfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") adminareainfo record, @Param("example") adminareainfoExample example);

    int updateByExample(@Param("record") adminareainfo record, @Param("example") adminareainfoExample example);

    int updateByPrimaryKeySelective(adminareainfo record);

    int updateByPrimaryKey(adminareainfo record);
}