package com.accp.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("cilcar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cilcar implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.INPUT,value = "clrno")
	private String clrno;

    private Integer clid;

    private String cliname;
    
    private String cliphone;

    private Integer cmlid;

    private String cbdname;

    private String cmlmodel;

    private Integer engid;

    private String engname;

    private String affiliation;
}