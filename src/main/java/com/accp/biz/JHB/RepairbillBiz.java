package com.accp.biz.JHB;

import com.accp.pojo.Repairbill;
import com.github.pagehelper.PageInfo;

public interface RepairbillBiz {
	public boolean insert(Repairbill indent);
	public PageInfo<Repairbill> selectAll(Integer pageNum,Integer pageSize);
	public boolean update(Repairbill indent);
}