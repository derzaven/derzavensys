package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Staff {
    private String staid;

    private Integer posid;

    private String depname;

    private String posname;

    private String staname;

    private Integer stasex;
    @JSONField(format = "yyyy-MM-dd")
    private Date staborth;

    private String staidcard;

    private String staaddress;

    private String imgsrc;

    private String accounts;

    private String pwd;
    @JSONField(format = "yyyy-MM-dd")
    private Date entrydate;

    private Integer instate;
    @JSONField(format = "yyyy-MM-dd")
    private Date dimissiondate;

    private String dimissioncause;

    public String getStaid() {
        return staid;
    }

    public void setStaid(String staid) {
        this.staid = staid == null ? null : staid.trim();
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname == null ? null : posname.trim();
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname == null ? null : staname.trim();
    }

    public Integer getStasex() {
        return stasex;
    }

    public void setStasex(Integer stasex) {
        this.stasex = stasex;
    }

    public Date getStaborth() {
        return staborth;
    }

    public void setStaborth(Date staborth) {
        this.staborth = staborth;
    }

    public String getStaidcard() {
        return staidcard;
    }

    public void setStaidcard(String staidcard) {
        this.staidcard = staidcard == null ? null : staidcard.trim();
    }

    public String getStaaddress() {
        return staaddress;
    }

    public void setStaaddress(String staaddress) {
        this.staaddress = staaddress == null ? null : staaddress.trim();
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts == null ? null : accounts.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Integer getInstate() {
        return instate;
    }

    public void setInstate(Integer instate) {
        this.instate = instate;
    }

    public Date getDimissiondate() {
        return dimissiondate;
    }

    public void setDimissiondate(Date dimissiondate) {
        this.dimissiondate = dimissiondate;
    }

    public String getDimissioncause() {
        return dimissioncause;
    }

    public void setDimissioncause(String dimissioncause) {
        this.dimissioncause = dimissioncause == null ? null : dimissioncause.trim();
    }
}