package com.accp.biz.xh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.xh.ArtisanMapper;
import com.accp.pojo.Artisan;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)

public class ArtisanBiz extends ServiceImpl<ArtisanMapper, Artisan>{
	@Autowired
	private ArtisanMapper mapper;
	
	public PageInfo<Artisan> queryAll(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<Artisan> list = select();
		System.out.println("list:"+list.toString());
		PageInfo<Artisan> pageInfo = new PageInfo<Artisan>(list);
		return pageInfo;
	}
	
	
	public List<Artisan> select(){
		QueryWrapper<Artisan> qw = Wrappers.query();
		qw.eq("atjstate", 1);
		return super.getBaseMapper().selectList(qw);
	}
	
}
