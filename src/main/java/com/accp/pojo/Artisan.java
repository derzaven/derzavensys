package com.accp.pojo;

import java.util.Date;

public class Artisan {
    private Integer artid;

    private Integer lvid;

    private String lvname;

    private Integer classid;

    private String classname;

    private String artname;

    private Integer artsex;

    private String artphone;

    private String artadress;

    private Date artborth;

    private String artidcard;

    private Date entrydate;

    private Integer atjstate;

    private Date dimissiondate;

    private String dimcause;

    public Integer getArtid() {
        return artid;
    }

    public void setArtid(Integer artid) {
        this.artid = artid;
    }

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

    public String getArtname() {
        return artname;
    }

    public void setArtname(String artname) {
        this.artname = artname == null ? null : artname.trim();
    }

    public Integer getArtsex() {
        return artsex;
    }

    public void setArtsex(Integer artsex) {
        this.artsex = artsex;
    }

    public String getArtphone() {
        return artphone;
    }

    public void setArtphone(String artphone) {
        this.artphone = artphone == null ? null : artphone.trim();
    }

    public String getArtadress() {
        return artadress;
    }

    public void setArtadress(String artadress) {
        this.artadress = artadress == null ? null : artadress.trim();
    }

    public Date getArtborth() {
        return artborth;
    }

    public void setArtborth(Date artborth) {
        this.artborth = artborth;
    }

    public String getArtidcard() {
        return artidcard;
    }

    public void setArtidcard(String artidcard) {
        this.artidcard = artidcard == null ? null : artidcard.trim();
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Integer getAtjstate() {
        return atjstate;
    }

    public void setAtjstate(Integer atjstate) {
        this.atjstate = atjstate;
    }

    public Date getDimissiondate() {
        return dimissiondate;
    }

    public void setDimissiondate(Date dimissiondate) {
        this.dimissiondate = dimissiondate;
    }

    public String getDimcause() {
        return dimcause;
    }

    public void setDimcause(String dimcause) {
        this.dimcause = dimcause == null ? null : dimcause.trim();
    }
}