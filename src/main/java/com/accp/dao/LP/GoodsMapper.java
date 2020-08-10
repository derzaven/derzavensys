package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


@Component("LPGoodsMapper")
public interface GoodsMapper extends BaseMapper<Goods>{

	Integer UpdateOne(@Param("name")String name,@Param("brand")String brand,@Param("site")String site,@Param("id")Integer id);
}