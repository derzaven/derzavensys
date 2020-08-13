package com.accp.dao.JHB;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.accp.pojo.Cilcar;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBCilcarMapper")
public interface CilcarMapper extends BaseMapper<Cilcar> {
	@Select("select * from cilcar")
    List<Cilcar> selectAll();
}