package com.accp.pojo;

public class Engine {
    private Integer engid;

    private String engname;

    private String engbrand;

    public Integer getEngid() {
        return engid;
    }

    public void setEngid(Integer engid) {
        this.engid = engid;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname == null ? null : engname.trim();
    }

    public String getEngbrand() {
        return engbrand;
    }

    public void setEngbrand(String engbrand) {
        this.engbrand = engbrand == null ? null : engbrand.trim();
    }
}