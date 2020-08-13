package com.accp.biz.JHB.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.CilcarBiz;
import com.accp.dao.JHB.CilcarMapper;
import com.accp.pojo.Cilcar;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CilcarBizImpl extends ServiceImpl<CilcarMapper, Cilcar> implements CilcarBiz {
	@Autowired
	private CilcarMapper cilcarMapper;
	@Override
	public PageInfo<Cilcar> selectAll(Integer pageNum, Integer pageSize) {
		//设置分页参数（当前页，页面显示最大记录数）
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Cilcar>(cilcarMapper.selectAll());
	}
	@Override
	public PageInfo<Cilcar> selectByCarNum(Integer pageNum, Integer pageSize, String clrno) {
		//设置分页参数（当前页，页面显示最大记录数）
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Cilcar> qw=Wrappers.query();
		qw.like("clrno", clrno);
		return new PageInfo<Cilcar>(super.list(qw));
	}

}
