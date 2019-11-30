package com.thzw.oa.entity;

import java.util.Date;

public class signinfo {
    private Integer signid;

    private Long userid;

    private Date signdatetime;

    private String latitude;

    private String longitude;

    public Integer getSignid() {
        return signid;
    }

    public void setSignid(Integer signid) {
        this.signid = signid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getSigndatetime() {
        return signdatetime;
    }

    public void setSigndatetime(Date signdatetime) {
        this.signdatetime = signdatetime;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }
}