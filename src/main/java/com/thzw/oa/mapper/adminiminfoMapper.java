package com.thzw.oa.mapper;

import com.thzw.oa.entity.adminiminfo;
import com.thzw.oa.entity.adminiminfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface adminiminfoMapper {
    int countByExample(adminiminfoExample example);

    int deleteByExample(adminiminfoExample example);

    int deleteByPrimaryKey(Integer imid);

    int insert(adminiminfo record);

    int insertSelective(adminiminfo record);

    List<adminiminfo> selectByExampleWithBLOBs(adminiminfoExample example);

    List<adminiminfo> selectByExample(adminiminfoExample example);

    adminiminfo selectByPrimaryKey(Integer imid);

    int updateByExampleSelective(@Param("record") adminiminfo record, @Param("example") adminiminfoExample example);

    int updateByExampleWithBLOBs(@Param("record") adminiminfo record, @Param("example") adminiminfoExample example);

    int updateByExample(@Param("record") adminiminfo record, @Param("example") adminiminfoExample example);

    int updateByPrimaryKeySelective(adminiminfo record);

    int updateByPrimaryKeyWithBLOBs(adminiminfo record);

    int updateByPrimaryKey(adminiminfo record);
}