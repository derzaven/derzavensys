package com.accp.biz.JHB.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.StaffBiz;
import com.accp.dao.JHB.StaffMapper;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StaffBizImpl implements StaffBiz {
	@Autowired
	private StaffMapper staffMapper;
	@Override
	public PageInfo<Staff> selectAll(Integer pageNum,Integer pageSize) {
		//设置分页参数（当前页，页面显示最大记录数）
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Staff>(staffMapper.selectAll());
	}
	@Override
	public boolean insert(Staff sta) {
		return staffMapper.insert(sta)>0;
	}
	@Override
	public String selectMaxId() {
		return staffMapper.selectMaxId();
	}
	
}
