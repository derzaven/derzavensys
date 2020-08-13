package com.accp.action.JHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.DepartmentBiz;
import com.accp.pojo.Department;

@Component("JHBDepartmentAction")
@RestController
@RequestMapping("/api/dep")
public class DepartmentAction {
	@Autowired
	private DepartmentBiz db;
	
	@GetMapping("/selectAll")
	public List<Department> selectAll(){
		return db.selectAll();
	}
}
