package com.accp.biz.xh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.xh.DepartmentMapper;
import com.accp.pojo.Department;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)

public class DepartmentBiz{
	@Autowired
	private DepartmentMapper departmentmapper;
	
	public PageInfo<Department> queryAll(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<Department> list = departmentmapper.selectDepartment();
		System.out.println("list:"+list.toString());
		PageInfo<Department> pageInfo = new PageInfo<Department>(list);
	return pageInfo;
}

	public int insert(String depname) {
		return departmentmapper.insertDepartment(depname);
	}

	public Department selectById(Integer depid) {
		return departmentmapper.selectById(depid);
	}

	public boolean update(Integer depid,String depname) {
		return departmentmapper.update(depid,depname);
	}

	public boolean delete(Integer depid) {
		// TODO Auto-generated method stub
		return departmentmapper.deleteById(depid);
	}
}
