package com.accp.pojo;

import java.math.BigDecimal;

public class Rescuecar {
    private String resno;

    private Integer classid;

    private String classname;

    private Integer outstate;

    private BigDecimal mileage;

    public String getResno() {
        return resno;
    }

    public void setResno(String resno) {
        this.resno = resno == null ? null : resno.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getOutstate() {
        return outstate;
    }

    public void setOutstate(Integer outstate) {
        this.outstate = outstate;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }
}