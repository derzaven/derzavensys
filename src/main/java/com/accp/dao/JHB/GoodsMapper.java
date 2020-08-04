package com.accp.dao.JHB;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.accp.pojo.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBGoodsMapper")
public interface GoodsMapper extends BaseMapper<Goods>  {
	@Select("select * from goods")
    List<Goods> selectAll();
}