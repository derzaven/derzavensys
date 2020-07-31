package com.accp.dao.JHB;

import java.util.List;

import org.springframework.stereotype.Component;

import com.accp.pojo.Department;

@Component("JHBDepartmentMapper")
public interface DepartmentMapper {
    List<Department> selectAll();
}