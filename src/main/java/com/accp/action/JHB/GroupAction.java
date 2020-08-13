package com.accp.action.JHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.GroupBiz;
import com.accp.biz.JHB.impl.GroupBizImpl;
import com.accp.pojo.Group;

@RestController
@RequestMapping("/api/group")
public class GroupAction {
	@Autowired
	private GroupBiz gb;
	@Autowired
	private GroupBizImpl gbImpl;
	@GetMapping("/selectAll")
	public List<Group> selectAll(){
		return gb.selectAll();
	}
	@GetMapping("/selectPrincipal/{id}")
	public String selectPrincipal(@PathVariable Integer id) {
		return gb.selectPrincipal(id);
	}
}
