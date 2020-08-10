package com.accp.biz.LP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.GoodsMapper;
import com.accp.pojo.Carmodel;
import com.accp.pojo.Goods;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class GoodsBiz {
	@Autowired
	private GoodsMapper goodsmapper;
	
	public PageInfo<Goods> queryAll(int pageNum,int pageSize,String name,Integer state){
		QueryWrapper<Goods> qw = Wrappers.query();
		PageInfo<Goods> page = null;
		PageHelper.startPage(pageNum, pageSize);
		if("404".equals(name)) {
			qw.eq("state", state);
			page = new PageInfo<>(goodsmapper.selectList(qw));
		}else {
			qw.like("goodsname", name).eq("state", state);
			page = new PageInfo<>(goodsmapper.selectList(qw));
		}
		return page;
	}
	
	public Goods queryId(Integer id) {
		return goodsmapper.selectById(id);
	}
	
	
	public Integer add(Goods goods) {
		return goodsmapper.insert(goods);
	}
	
	public Integer UpdateOne(Goods goods) {
		return goodsmapper.updateById(goods);
	}
}
