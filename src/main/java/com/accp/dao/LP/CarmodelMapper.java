package com.accp.dao.LP;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Carmodel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("LPCarmodelMapper")
public interface CarmodelMapper extends BaseMapper<Carmodel>{
	
	int update(@Param("name") String name,@Param("id") Integer id);
	
}