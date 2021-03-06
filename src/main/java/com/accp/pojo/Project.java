package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "proid")
	private Integer proid;

    private String proname;
    
    private Integer itemsid;
    
    private String itemsname;

    private BigDecimal proprice;
    
}