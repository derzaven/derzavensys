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

@TableName("items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO,value = "itemsid")
	private Integer itemsid;
	
	private String itemsname;
	
	private Integer fitemsid;
	
    private List<Items> list;

	public List<Items> getList() {
		return list;
	}

	public void setList(List<Items> list) {
		this.list = list;
	}
    
    
}
