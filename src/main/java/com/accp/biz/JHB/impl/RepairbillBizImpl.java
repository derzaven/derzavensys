package com.accp.biz.JHB.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.RepairbillBiz;
import com.accp.dao.JHB.RepairbillMapper;
import com.accp.pojo.Repairbill;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RepairbillBizImpl extends ServiceImpl<RepairbillMapper, Repairbill> implements RepairbillBiz {
	@Autowired
	private RepairbillMapper repairbillMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public boolean insert(Repairbill indent) {
		return repairbillMapper.insert(indent) > 0;
	}

	@Override
	public PageInfo<Repairbill> selectAll(Integer pageNum, Integer pageSize) {
		// 设置分页参数（当前页，页面显示最大记录数）
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Repairbill>(repairbillMapper.selectAll());
	}

	@Override
	public boolean update(Repairbill indent) {
		return super.updateById(indent);
	}

}