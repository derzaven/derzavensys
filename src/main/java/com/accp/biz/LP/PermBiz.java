package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.PermMapper;
import com.accp.pojo.Perm;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PermBiz {

	@Autowired
	private PermMapper permMapper;
	
	public List<Perm> SelectAll(Integer id){
		return permMapper.selectAll(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delete(Integer id,List<Integer> hanId) {
		return permMapper.deleteById(id,hanId);
	}
}
