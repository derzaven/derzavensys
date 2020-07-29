package com.accp.pojo;

public class Starlevel {
    private Integer lvid;

    private String lvname;

    private Long dapfasom;

    public Integer getLvid() {
        return lvid;
    }

    public void setLvid(Integer lvid) {
        this.lvid = lvid;
    }

    public String getLvname() {
        return lvname;
    }

    public void setLvname(String lvname) {
        this.lvname = lvname == null ? null : lvname.trim();
    }

    public Long getDapfasom() {
        return dapfasom;
    }

    public void setDapfasom(Long dapfasom) {
        this.dapfasom = dapfasom;
    }
}