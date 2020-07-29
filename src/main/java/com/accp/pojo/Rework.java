package com.accp.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Rework {
    private Integer rewid;

    private String odd;

    private String rewtype;

    private BigDecimal fine;

    private String rewcause;

    private Date rewdate;

    public Integer getRewid() {
        return rewid;
    }

    public void setRewid(Integer rewid) {
        this.rewid = rewid;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd == null ? null : odd.trim();
    }

    public String getRewtype() {
        return rewtype;
    }

    public void setRewtype(String rewtype) {
        this.rewtype = rewtype == null ? null : rewtype.trim();
    }

    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    public String getRewcause() {
        return rewcause;
    }

    public void setRewcause(String rewcause) {
        this.rewcause = rewcause == null ? null : rewcause.trim();
    }

    public Date getRewdate() {
        return rewdate;
    }

    public void setRewdate(Date rewdate) {
        this.rewdate = rewdate;
    }
}