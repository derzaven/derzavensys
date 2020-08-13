package com.accp.dao.JHB;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.accp.pojo.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


@Component("JHBGoodsMapper")
public interface GoodsMapper extends BaseMapper<Goods> {
	@Select("SELECT * FROM goods "
			+ "WHERE state=2")
    List<Goods> selectAll();
	
	Integer UpdateOne(@Param("name")String name,@Param("brand")String brand,@Param("site")String site,@Param("id")Integer id);
}