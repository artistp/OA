package com.thzw.oa.mapper;

import com.thzw.oa.entity.adminareainfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface adminareainfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(adminareainfo record);

    int insertSelective(adminareainfo record);

    adminareainfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(adminareainfo record);

    int updateByPrimaryKey(adminareainfo record);
}