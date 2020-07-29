package com.accp.dao.JHB;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Cilcar;

public interface CilcarMapper {
	@Select("select * from cilcar")
    List<Cilcar> selectAll();
}