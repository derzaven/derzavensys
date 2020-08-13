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

@TableName("goods")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO,value = "goodsid")
    private Integer goodsid;

    private String goodsname;
    
    private String goodstype;

    private Integer inventory;

    private Integer supid;

    private String supname;

    private String supbrand;

    private String supaddress;

    private BigDecimal goodsprice;
    
    private Integer state;
    
    private List<Goods> goodsList;
}