package com.accp.biz.JHB;

import com.accp.pojo.Staff;
import com.github.pagehelper.PageInfo;

public interface StaffBiz {
	public PageInfo<Staff> selectAll(Integer pageNum,Integer pageSize);
	public boolean insert(Staff sta);
	public String selectMaxId();
}
