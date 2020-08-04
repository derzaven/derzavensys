package com.accp.pojo;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("staff")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.INPUT,value = "staid")
	private String staid;

    private Integer posid;

    private String depname;

    private String posname;

    private String staname;

    private Integer stasex;
    @JSONField(format = "yyyy-MM-dd")
    private Date staborth;

    private String staidcard;

    private String staaddress;

    private String imgsrc;

    private String accounts;

    private String pwd;
    @JSONField(format = "yyyy-MM-dd")
    private Date entrydate;

    private Integer instate;
    @JSONField(format = "yyyy-MM-dd")
    private Date dimissiondate;

    private String dimissioncause;

}