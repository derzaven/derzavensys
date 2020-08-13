package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Items;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("LPItemsMapper")
public interface ItemsMapper extends BaseMapper<Items>{
	 List<Items> selectAll();
	  List<Items> queryId(@Param("id") Integer id);
	  Integer add(@Param("items") Items items);
	  Integer delete(@Param("id") Integer id);
	  Items SelectId(@Param("id") Integer id);
	  Integer update(@Param("items") Items items);
}
