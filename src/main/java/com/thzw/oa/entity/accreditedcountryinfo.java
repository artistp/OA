package com.thzw.oa.entity;

public class accreditedcountryinfo {
    private Integer accreditedcountryid;

    private String accreditedcountryname;

    public Integer getAccreditedcountryid() {
        return accreditedcountryid;
    }

    public void setAccreditedcountryid(Integer accreditedcountryid) {
        this.accreditedcountryid = accreditedcountryid;
    }

    public String getAccreditedcountryname() {
        return accreditedcountryname;
    }

    public void setAccreditedcountryname(String accreditedcountryname) {
        this.accreditedcountryname = accreditedcountryname == null ? null : accreditedcountryname.trim();
    }
}