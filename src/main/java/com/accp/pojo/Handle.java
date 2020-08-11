package com.accp.pojo;

import java.util.List;

public class Handle {
    private Integer hanid;

    private String hancode;
    
    private String hanindex;

    private String hanimg;

    private String hanname;

    private Integer fhanid;
    
    private Handle children;

	public String getHanindex() {
		return hanindex;
	}

	public void setHanindex(String hanindex) {
		this.hanindex = hanindex;
	}



	public Handle getChildren() {
		return children;
	}

	public void setChildren(Handle children) {
		this.children = children;
	}

	public Integer getHanid() {
        return hanid;
    }

    public void setHanid(Integer hanid) {
        this.hanid = hanid;
    }

    public String getHancode() {
        return hancode;
    }

    public void setHancode(String hancode) {
        this.hancode = hancode == null ? null : hancode.trim();
    }

    public String getHanimg() {
        return hanimg;
    }

    public void setHanimg(String hanimg) {
        this.hanimg = hanimg == null ? null : hanimg.trim();
    }

    public String getHanname() {
        return hanname;
    }

    public void setHanname(String hanname) {
        this.hanname = hanname == null ? null : hanname.trim();
    }

    public Integer getFhanid() {
        return fhanid;
    }

    public void setFhanid(Integer fhanid) {
        this.fhanid = fhanid;
    }
    
}