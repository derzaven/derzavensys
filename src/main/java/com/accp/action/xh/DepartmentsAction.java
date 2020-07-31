package com.accp.action.xh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xh.DepartmentBiz;
import com.accp.pojo.Department;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api")
public class DepartmentsAction {
	@Autowired
	private DepartmentBiz departmentbiz;
	
	@GetMapping("{p}/{s}")
	public PageInfo<Department> queryAll(@PathVariable Integer p, @PathVariable Integer s) {
		PageInfo<Department> pageinfo = departmentbiz.queryAll(p,s);
		System.out.println(pageinfo.getList());
		return pageinfo;
	}
	
	@PostMapping("insertdepartment/{depname}")
	public Map<String,Object> insert(@PathVariable String depname){
		System.out.println("進入到新增方法");
		System.out.println(depname.toString());
		departmentbiz.insert(depname);
		Map<String,Object> message = new HashMap<String ,Object>();
		message.put("code","200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("department/{depid}")
	public Department selectById(@PathVariable Integer depid){
		return departmentbiz.selectById(depid);
	}
	
	@GetMapping("update")
	public Map<String,Object> update(Integer depid,String depname){
		System.out.println("id:"+depid+"depname:"+depname);
		Map<String,Object> message = new HashMap<String ,Object>();
		if(departmentbiz.update(depid,depname)) {
		message.put("code","200");
		message.put("msg", "ok");
		return message;
		}else {
			message.put("code","300");
			return message;
		}
	}
	
	@DeleteMapping("delete/{depid}")
	public Map<String,Object> delete(@PathVariable Integer depid){
		System.out.println("id:"+depid);
		Map<String,Object> message = new HashMap<String ,Object>();
		if(departmentbiz.delete(depid)) {
		message.put("code","200");
		message.put("msg", "ok");
		return message;
		}else {
			message.put("code","300");
			return message;
		}
	}
}
