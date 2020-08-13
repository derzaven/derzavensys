package com.accp.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("site")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Site implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "siteid")
	private Integer siteid;
	
	private String sitename;
	
	private Integer fsiteid;
	
}