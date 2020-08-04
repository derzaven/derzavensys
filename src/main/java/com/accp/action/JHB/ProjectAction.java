package com.accp.action.JHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.ProjectBiz;
import com.accp.biz.JHB.impl.ProjectBizImpl;
import com.accp.pojo.Project;

@RestController
@RequestMapping("/api/project")
public class ProjectAction {
	@Autowired
	private ProjectBiz pb;
	@Autowired
	private ProjectBizImpl pbImpl;
	@GetMapping("/selectAll")
	public List<Project> selectAll(){
		return pbImpl.list();
	}
}