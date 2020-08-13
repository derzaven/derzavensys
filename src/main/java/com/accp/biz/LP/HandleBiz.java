package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.HandleMapper;
import com.accp.pojo.Handle;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class HandleBiz {

	@Autowired
	private HandleMapper handleMapper;
	
	public List<Handle> selectAll(){
		return handleMapper.selectAll();
	}
}
