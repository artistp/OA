package com.thzw.oa.mapper;

import com.thzw.oa.entity.teammates_select_mission;
import com.thzw.oa.entity.teammates_select_missionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface teammates_select_missionMapper {
    int countByExample(teammates_select_missionExample example);

    int deleteByExample(teammates_select_missionExample example);

    int insert(teammates_select_mission record);

    int insertSelective(teammates_select_mission record);

    List<teammates_select_mission> selectByExampleWithBLOBs(teammates_select_missionExample example);

    List<teammates_select_mission> selectByExample(teammates_select_missionExample example);

    int updateByExampleSelective(@Param("record") teammates_select_mission record, @Param("example") teammates_select_missionExample example);

    int updateByExampleWithBLOBs(@Param("record") teammates_select_mission record, @Param("example") teammates_select_missionExample example);

    int updateByExample(@Param("record") teammates_select_mission record, @Param("example") teammates_select_missionExample example);
}