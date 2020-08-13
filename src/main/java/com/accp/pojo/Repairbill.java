package com.accp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("repairbill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repairbill implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.INPUT,value = "odd")
	private String odd;

    private String clrno;

    private Integer classid;

    private String classname;

    private String staid;

    private String staname;
    
    private String resno;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date billingtime;

    private String maintaintype;
    @JSONField(format = "yyyy-MM-dd")
    private Date predictdate;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date practicaldate;
    
    private String cause;
    
    private String remark;

    private Integer bcstate;

    private BigDecimal mhcost;

    private Integer consumehour;

    private BigDecimal rescue;

    private BigDecimal goodsamt;

    private BigDecimal projectamt;

    private BigDecimal oddamt;

    private Integer caastate;

    private String caatype;

    private BigDecimal caamoney;
    @TableField(exist = false)
    private List<Record> proList;
    @TableField(exist = false)
    private List<Record> goodsList;
    @TableField(exist = false)
    private Cilcar cilcar;
}