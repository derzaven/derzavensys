package com.accp.pojo;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("handle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Handle implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "hanid")
	private Integer hanid;

    private String hancode;
    
    private String hanindex;

    private String hanimg;

    private String hanname;

    private Integer fhanid;
    
    private Handle children;
    @TableField(exist = false)
    private List<Handle> childrens;
  
}