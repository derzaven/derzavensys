package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Carmodel;
import com.accp.pojo.Supplier;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("LPSupplierMapper")
public interface SupplierMapper extends BaseMapper<Supplier>{
		List<Supplier> selectAll();
		List<Supplier> selectId(List<Integer> roleList);
}