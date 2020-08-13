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

@TableName("position")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "itemsid")
	private Integer posid;

    private Integer depid;

    private String posname;
    @TableField(exist = false)
    private List<Handle> list;
}