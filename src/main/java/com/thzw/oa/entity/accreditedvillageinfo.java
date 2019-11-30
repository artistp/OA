package com.thzw.oa.entity;

public class accreditedvillageinfo {
    private Integer accreditedvillageid;

    private String accreditedvillagename;

    private Integer accreditedtownid;

    public Integer getAccreditedvillageid() {
        return accreditedvillageid;
    }

    public void setAccreditedvillageid(Integer accreditedvillageid) {
        this.accreditedvillageid = accreditedvillageid;
    }

    public String getAccreditedvillagename() {
        return accreditedvillagename;
    }

    public void setAccreditedvillagename(String accreditedvillagename) {
        this.accreditedvillagename = accreditedvillagename == null ? null : accreditedvillagename.trim();
    }

    public Integer getAccreditedtownid() {
        return accreditedtownid;
    }

    public void setAccreditedtownid(Integer accreditedtownid) {
        this.accreditedtownid = accreditedtownid;
    }
}