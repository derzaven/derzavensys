package com.accp.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Starlevel implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId(type=IdType.INPUT,value="lvid")
	private Integer lvid;

    private String lvname;

    private Long dapfasom;
}