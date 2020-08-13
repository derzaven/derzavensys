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

@TableName("record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO,value = "recid")
	private Integer recid;

    private String odd;

    private Integer rewid;
    
    private String rewtype;
    
    private Integer rectype;

    private Integer goodsid;

    private String goodsname;

    private BigDecimal goodsprice;

    private Integer num;

    private BigDecimal goodsamt;

    private Integer proid;

    private String proname;

    private BigDecimal proprice;
}