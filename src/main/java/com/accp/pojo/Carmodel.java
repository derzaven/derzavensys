package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("carmodel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carmodel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO,value = "cmlid")
	private Integer cmlid;

    private Integer cbdid;

    private String cbdname;

    private Integer engid;

    private String engname;

    private String cmlmodel;

    private BigDecimal reference;

}