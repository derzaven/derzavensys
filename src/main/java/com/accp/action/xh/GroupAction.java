package com.accp.action.xh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xh.GroupBiz;
import com.accp.pojo.Group;

@RestController
@RequestMapping("/api/group")
public class GroupAction {
	
	@Autowired
	private GroupBiz biz;
	
	@GetMapping("selectGroup")
	public List<Group> selectAll(){
		return biz.selectAll();
	}
}
