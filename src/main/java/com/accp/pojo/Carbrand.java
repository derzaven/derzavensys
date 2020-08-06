package com.accp.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("carbrand")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carbrand implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO,value = "cbdid")
	private Integer cbdid;

    private String cbdname;

    private String logogram;

	public Carbrand(String cbdname, String logogram) {
		super();
		this.cbdname = cbdname;
		this.logogram = logogram;
	}
    
    
}