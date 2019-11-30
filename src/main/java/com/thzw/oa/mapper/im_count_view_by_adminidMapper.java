package com.thzw.oa.mapper;

import com.thzw.oa.entity.im_count_view_by_adminid;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface im_count_view_by_adminidMapper {
    int insert(im_count_view_by_adminid record);

    int insertSelective(im_count_view_by_adminid record);
}