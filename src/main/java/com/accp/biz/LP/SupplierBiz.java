package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.JHB.GoodsMapper;
import com.accp.dao.LP.SupplierMapper;
import com.accp.pojo.Supplier;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SupplierBiz extends ServiceImpl<SupplierMapper, Supplier>{
	@Autowired
	private SupplierMapper supplierMapper;
	
	@Autowired 
	private GoodsMapper goodsMapper;
	
	public List<Supplier> selectAll(){
		return supplierMapper.selectAll();
	}
	public List<Supplier> selectId(List<Integer> list){
		return supplierMapper.selectId(list);
	}
	
	public List<Supplier> selectName(String name){
		QueryWrapper<Supplier> qw = Wrappers.query();
		qw.like("supname", name);
		return super.getBaseMapper().selectList(qw);
	}
	
	public Integer add(Supplier entity) {
		return super.getBaseMapper().insert(entity);
	}
	public int Delete(Integer id) {
		return super.getBaseMapper().deleteById(id);
	}
	
	public Integer Update(Supplier entity) {
		int count = goodsMapper.UpdateOne(entity.getSupname(), entity.getSupbrand(), entity.getSupaddress(), entity.getSupid());
		return super.getBaseMapper().updateById(entity);
	}
	public Supplier selectById(Integer id) {
		// TODO Auto-generated method stub
		return super.getBaseMapper().selectById(id);
	}
}
