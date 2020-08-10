package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.ItemsMapper;
import com.accp.pojo.Items;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ItemsBiz {
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	public List<Items> selectAll(){
		return itemsMapper.selectAll();
	}
	
	public List<Items> selectId(Integer id){
		return itemsMapper.queryId(id);
	}
	
	public int add(Items site) {
		return itemsMapper.add(site);
	}
	
	public int delete(Integer id) {
		return itemsMapper.delete(id);
	}
	public Items queryId(Integer id){
		return itemsMapper.SelectId(id);
	}

	public int update(Items site) {
		return itemsMapper.update(site);
	}
	
	
}
