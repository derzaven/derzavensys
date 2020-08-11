package com.accp.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Position implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer posid;

    private Integer depid;

    private String posname;
    
    private List<Handle> list;

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname == null ? null : posname.trim();
    }

	public List<Handle> getList() {
		return list;
	}

	public void setList(List<Handle> list) {
		this.list = list;
	}
    
}