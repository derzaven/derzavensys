package com.accp.pojo;

public class Perm {
    private Integer pid;

    private Integer posid;

    private Integer hanid;

    private String perm;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public Integer getHanid() {
        return hanid;
    }

    public void setHanid(Integer hanid) {
        this.hanid = hanid;
    }

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm == null ? null : perm.trim();
    }
}