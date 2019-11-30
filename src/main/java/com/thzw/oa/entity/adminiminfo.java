package com.thzw.oa.entity;

import java.util.Date;

public class adminiminfo {
    private Integer imid;

    private String title;

    private Date stime;

    private Date etime;

    private Long userid;

    private Byte imtype;

    private String imcontent;

    public Integer getImid() {
        return imid;
    }

    public void setImid(Integer imid) {
        this.imid = imid;
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

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Byte getImtype() {
        return imtype;
    }

    public void setImtype(Byte imtype) {
        this.imtype = imtype;
    }

    public String getImcontent() {
        return imcontent;
    }

    public void setImcontent(String imcontent) {
        this.imcontent = imcontent == null ? null : imcontent.trim();
    }
}