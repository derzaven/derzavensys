package com.accp.biz.JHB.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.ReworkBiz;
import com.accp.dao.JHB.ReworkMapper;
import com.accp.pojo.Rework;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ReworkBizImpl extends ServiceImpl<ReworkMapper, Rework> implements ReworkBiz {
	@Autowired
	private ReworkMapper reworkMapper;

	@Override
	public int countByOdd(String odd) {
		QueryWrapper<Rework> qw=Wrappers.query();
		qw.eq("odd", odd);
		return super.count(qw);
	}

	@Override
	public boolean insert(Rework rework) {
		return reworkMapper.insert(rework)>0;
	}
}
