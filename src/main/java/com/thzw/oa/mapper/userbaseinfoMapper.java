package com.thzw.oa.mapper;

import com.thzw.oa.entity.userbaseinfo;
import com.thzw.oa.entity.userbaseinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface userbaseinfoMapper {
    int countByExample(userbaseinfoExample example);

    int deleteByExample(userbaseinfoExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(userbaseinfo record);

    int insertSelective(userbaseinfo record);

    List<userbaseinfo> selectByExample(userbaseinfoExample example);

    userbaseinfo selectByPrimaryKey(Long userid);

    userbaseinfo selectByPhone(userbaseinfo record);

    int updateByExampleSelective(@Param("record") userbaseinfo record, @Param("example") userbaseinfoExample example);

    int updateByExample(@Param("record") userbaseinfo record, @Param("example") userbaseinfoExample example);

    int updateByPrimaryKeySelective(userbaseinfo record);

    int updateByPrimaryKey(userbaseinfo record);
}