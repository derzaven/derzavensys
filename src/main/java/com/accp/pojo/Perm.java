package com.accp.pojo;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("perm")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Perm implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "pid")
	private Integer pid;

    private Integer posid;

    private Integer hanid;

    private String perm;

}