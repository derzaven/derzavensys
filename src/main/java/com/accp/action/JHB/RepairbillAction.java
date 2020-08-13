package com.accp.action.JHB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.RepairbillBiz;
import com.accp.pojo.Repairbill;
import com.github.pagehelper.PageInfo;

@Component("JHBRepairbillAction")
@RestController
@RequestMapping("/api/repair")
public class RepairbillAction {
	@Autowired
	private RepairbillBiz rbb;
	@PostMapping("/insert")
	public boolean insert(@RequestBody Repairbill indent) {
		System.out.println(indent);
		return rbb.insert(indent);
	}
	@GetMapping("/selectAll/{pageNum}/{pageSize}")
	public PageInfo<Repairbill> selectAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return rbb.selectAll(pageNum, pageSize);
	}
	@PutMapping("/update")
	public boolean update(@RequestBody Repairbill indent) {
//		System.out.println(indent);
//		return true;
		return rbb.update(indent);
	}
}
