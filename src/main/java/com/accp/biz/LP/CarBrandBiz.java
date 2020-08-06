package com.accp.biz.LP;

import java.util.List;

import javax.xml.ws.Action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.CarbrandMapper;
import com.accp.pojo.Carbrand;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CarBrandBiz extends ServiceImpl<CarbrandMapper, Carbrand>{
	
	public PageInfo<Carbrand> query(int pageNum,int pageSize,String name){
		QueryWrapper<Carbrand> qw = Wrappers.query();
		System.out.println(name);
		qw.like("cbdname", name).or().like("logogram", name);
		PageInfo<Carbrand> page = null;
		PageHelper.startPage(pageNum, pageSize);
		if("404".equals(name)) {
			page = new PageInfo<>(super.getBaseMapper().selectList(null));
		}else {
			page = new PageInfo<>(super.getBaseMapper().selectList(qw));
		}
		return page;
	}
	
	public List<Carbrand> queryName(String name){
		QueryWrapper<Carbrand> qw = Wrappers.query();
		qw.eq("cbdname", name);
		return super.getBaseMapper().selectList(qw);
	}
	
	public Carbrand queryId(Integer id) {
		return super.getBaseMapper().selectById(id);
	}
	
	public List<Carbrand> queryAll(){
		return super.getBaseMapper().selectList(null);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int add(Carbrand carbrand) {
		return super.getBaseMapper().insert(carbrand);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Carbrand carbrand) {
		return super.getBaseMapper().updateById(carbrand);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delete(Integer id) {
		return super.getBaseMapper().deleteById(id);
	}
}
