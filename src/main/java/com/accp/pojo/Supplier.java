package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

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
public class Supplier implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "supid")
	private Integer supid;

    private String supname;

    private String supbrand;
    
    private  Integer siteid;

    private String supaddress;

    private String supphone;

    private String supemail;
    
}