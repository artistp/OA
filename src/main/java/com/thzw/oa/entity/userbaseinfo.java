package com.thzw.oa.entity;

import java.util.Date;

public class userbaseinfo {
    private Long userid;

    private String pwd;

    private String sex;

    private String name;

    private Date birthday;

    private String nation;

    private String politicalstatus;

    private String email;

    private String phone;

    private String originalposition;

    private Integer accreditedvillageid;

    private String remarks;

    private String picurl;

    private Byte roletype;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(String politicalstatus) {
        this.politicalstatus = politicalstatus == null ? null : politicalstatus.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOriginalposition() {
        return originalposition;
    }

    public void setOriginalposition(String originalposition) {
        this.originalposition = originalposition == null ? null : originalposition.trim();
    }

    public Integer getAccreditedvillageid() {
        return accreditedvillageid;
    }

    public void setAccreditedvillageid(Integer accreditedvillageid) {
        this.accreditedvillageid = accreditedvillageid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public Byte getRoletype() {
        return roletype;
    }

    public void setRoletype(Byte roletype) {
        this.roletype = roletype;
    }
}