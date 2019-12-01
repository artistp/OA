package com.thzw.oa.entity;

import java.util.Date;

public class teammates_select_mission {
    private Long userid;

    private Integer imid;

    private Byte ifcheck;

    private String title;

    private Date stime;

    private Date etime;

    private String captainname;

    private Long captainid;

    private String imcontent;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getImid() {
        return imid;
    }

    public void setImid(Integer imid) {
        this.imid = imid;
    }

    public Byte getIfcheck() {
        return ifcheck;
    }

    public void setIfcheck(Byte ifcheck) {
        this.ifcheck = ifcheck;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getCaptainname() {
        return captainname;
    }

    public void setCaptainname(String captainname) {
        this.captainname = captainname == null ? null : captainname.trim();
    }

    public Long getCaptainid() {
        return captainid;
    }

    public void setCaptainid(Long captainid) {
        this.captainid = captainid;
    }

    public String getImcontent() {
        return imcontent;
    }

    public void setImcontent(String imcontent) {
        this.imcontent = imcontent == null ? null : imcontent.trim();
    }
}