package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("rework")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rework implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "rewid")
	private Integer rewid;

    private String odd;

    private String rewtype;
    
    private String principal;

    private BigDecimal fine;

    private String rewcause;

    private Date rewdate;
    
}