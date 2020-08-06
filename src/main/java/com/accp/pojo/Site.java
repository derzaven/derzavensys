package com.accp.pojo;

import java.util.List;

public class Site {
    private Integer siteid;

    private String sitename;
    
    private Integer fsiteid;
    
    private List<Site> children;
    
	public List<Site> getChildren() {
		return children;
	}

	public void setChildren(List<Site> children) {
		this.children = children;
	}

	public Integer getFsiteid() {
		return fsiteid;
	}

	public void setFsiteid(Integer fsiteid) {
		this.fsiteid = fsiteid;
	}

	public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

	@Override
	public String toString() {
		return "Site [siteid=" + siteid + ", sitename=" + sitename + ", fsiteid=" + fsiteid + "]";
	}
    
}