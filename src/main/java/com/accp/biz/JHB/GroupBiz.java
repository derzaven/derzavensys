package com.accp.biz.JHB;

import java.util.List;

import com.accp.pojo.Group;

public interface GroupBiz {
	public List<Group> selectAll();
	public String selectPrincipal(Integer classId);
}