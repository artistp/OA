package com.thzw.oa.service;

import com.thzw.oa.entity.find_members_by_adminid;

import java.util.List;

public interface MissionS {

    public List<find_members_by_adminid> getmates(long id);
}
