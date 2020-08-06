package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("supplier")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO,value = "supid")
	private Integer supid;

    private String supname;

    private String supbrand;
    
    private Integer siteid;

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

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}
    
}