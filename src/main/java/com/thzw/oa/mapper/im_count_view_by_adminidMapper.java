package com.thzw.oa.mapper;

import com.thzw.oa.entity.im_count_view_by_adminid;
import com.thzw.oa.entity.im_count_view_by_adminidExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface im_count_view_by_adminidMapper {
    int countByExample(im_count_view_by_adminidExample example);

    int deleteByExample(im_count_view_by_adminidExample example);

    int insert(im_count_view_by_adminid record);

    int insertSelective(im_count_view_by_adminid record);

    List<im_count_view_by_adminid> selectByExampleWithBLOBs(im_count_view_by_adminidExample example);

    List<im_count_view_by_adminid> selectByExample(im_count_view_by_adminidExample example);

    int updateByExampleSelective(@Param("record") im_count_view_by_adminid record, @Param("example") im_count_view_by_adminidExample example);

    int updateByExampleWithBLOBs(@Param("record") im_count_view_by_adminid record, @Param("example") im_count_view_by_adminidExample example);

    int updateByExample(@Param("record") im_count_view_by_adminid record, @Param("example") im_count_view_by_adminidExample example);
}