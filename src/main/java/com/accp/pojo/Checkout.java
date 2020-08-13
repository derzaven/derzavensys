package com.accp.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("checkout")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Checkout implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO,value = "chkid")
	private Integer chkid;
	
	private String odd;
	
	private Date practicaldate;
	
	private String delaycause;
	
	private String staid;
	
	private String staname;
	
	private Integer isok;
}
