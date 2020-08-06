package com.accp.biz.LP;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.CarmodelMapper;
import com.accp.pojo.Carbrand;
import com.accp.pojo.Carmodel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CarModelBiz extends ServiceImpl<CarmodelMapper, Carmodel>{
	
	public PageInfo<Carmodel> query(int pageNum,int pageSize,String name){
		QueryWrapper<Carmodel> qw = Wrappers.query();
		qw.like("cmlmodel", name);
		PageInfo<Carmodel> page = null;
		PageHelper.startPage(pageNum, pageSize);
		if("404".equals(name)) {
			page = new PageInfo<>(super.getBaseMapper().selectList(null));
		}else {
			page = new PageInfo<>(super.getBaseMapper().selectList(qw));
		}
		return page;
	}
	
	public List<Carmodel> queryAll(){
		return super.getBaseMapper().selectList(null);
	}
	
	public PageInfo<Carmodel> queryCarBrandId(Integer pageNum,Integer pageSize,Integer id){
		QueryWrapper<Carmodel> qw = Wrappers.query();
		qw.eq("cbdid", id);
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(super.getBaseMapper().selectList(qw));
	}
	
	
	public PageInfo<Carmodel> queryCarEngineId(Integer pageNum,Integer pageSize,Integer id){
		QueryWrapper<Carmodel> qw = Wrappers.query();
		qw.eq("engid", id);
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(super.getBaseMapper().selectList(qw));
	}
	
	
	public Carmodel queryId(Integer id) {
		return super.getBaseMapper().selectById(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int add(Carmodel carmodel) {
		return super.getBaseMapper().insert(carmodel);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Carmodel carmodel) {
		return super.getBaseMapper().updateById(carmodel);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delete(Integer id) {
		return super.getBaseMapper().deleteById(id);
	}
}
