package com.thzw.oa.service;

import com.thzw.oa.entity.im_count_view_by_adminid;
import com.thzw.oa.entity.im_count_view_by_adminidExample;
import com.thzw.oa.mapper.im_count_view_by_adminidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService implements IndexS {

    @Autowired
    private im_count_view_by_adminidMapper imMapper;

    @Override
    public List<im_count_view_by_adminid> getims(long id) {
        im_count_view_by_adminidExample example = new im_count_view_by_adminidExample();
        im_count_view_by_adminidExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(id);
        List<im_count_view_by_adminid> findimsByAdminids = imMapper.selectByExample(example);
        return findimsByAdminids;
    }
}
