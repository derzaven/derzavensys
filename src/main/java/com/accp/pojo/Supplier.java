package com.accp.pojo;

public class Supplier {
    private Integer supid;

    private String supname;

    private String supbrand;

    private String supaddress;

    private String supphone;

    private String supemail;

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname == null ? null : supname.trim();
    }

    public String getSupbrand() {
        return supbrand;
    }

    public void setSupbrand(String supbrand) {
        this.supbrand = supbrand == null ? null : supbrand.trim();
    }

    public String getSupaddress() {
        return supaddress;
    }

    public void setSupaddress(String supaddress) {
        this.supaddress = supaddress == null ? null : supaddress.trim();
    }

    public String getSupphone() {
        return supphone;
    }

    public void setSupphone(String supphone) {
        this.supphone = supphone == null ? null : supphone.trim();
    }

    public String getSupemail() {
        return supemail;
    }

    public void setSupemail(String supemail) {
        this.supemail = supemail == null ? null : supemail.trim();
    }
}