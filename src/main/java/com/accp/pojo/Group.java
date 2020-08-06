package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("`group`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type=IdType.AUTO,value="classid")
	private Integer classid;

    private String staid;

    private String principal;

    private String classname;

    private String module;

    private BigDecimal cost;

 
}