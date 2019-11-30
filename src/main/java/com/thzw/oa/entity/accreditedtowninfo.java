package com.thzw.oa.entity;

public class accreditedtowninfo {
    private Integer accreditedtownid;

    private Integer accreditedcountryid;

    private String accreditedtownname;

    public Integer getAccreditedtownid() {
        return accreditedtownid;
    }

    public void setAccreditedtownid(Integer accreditedtownid) {
        this.accreditedtownid = accreditedtownid;
    }

    public Integer getAccreditedcountryid() {
        return accreditedcountryid;
    }

    public void setAccreditedcountryid(Integer accreditedcountryid) {
        this.accreditedcountryid = accreditedcountryid;
    }

    public String getAccreditedtownname() {
        return accreditedtownname;
    }

    public void setAccreditedtownname(String accreditedtownname) {
        this.accreditedtownname = accreditedtownname == null ? null : accreditedtownname.trim();
    }
}