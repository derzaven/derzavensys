package com.accp.dao.xh;

import java.util.List;

import org.springframework.stereotype.Component;

import com.accp.pojo.Department;

@Component("XHDepartmentMapper")
public interface DepartmentMapper {
	List<Department> selectDepartment();

	int insertDepartment(String depname);

	Department selectById(Integer depid);

	boolean update(Integer depid,String depname);

	boolean deleteById(Integer depid);
}