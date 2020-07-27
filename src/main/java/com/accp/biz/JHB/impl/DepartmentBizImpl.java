package com.accp.biz.JHB.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.DepartmentBiz;
import com.accp.dao.JHB.DepartmentMapper;
import com.accp.pojo.Department;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DepartmentBizImpl implements DepartmentBiz {
	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> selectAll() {
		return departmentMapper.selectAll();
	}
	
}
