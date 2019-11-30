package com.thzw.oa.entity;

public class imtomember {
    private Integer id;

    private Integer imid;

    private Long touserid;

    private Byte ifcheck;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImid() {
        return imid;
    }

    public void setImid(Integer imid) {
        this.imid = imid;
    }

    public Long getTouserid() {
        return touserid;
    }

    public void setTouserid(Long touserid) {
        this.touserid = touserid;
    }

    public Byte getIfcheck() {
        return ifcheck;
    }

    public void setIfcheck(Byte ifcheck) {
        this.ifcheck = ifcheck;
    }
}