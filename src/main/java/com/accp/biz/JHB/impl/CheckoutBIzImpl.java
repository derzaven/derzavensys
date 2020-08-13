package com.accp.biz.JHB.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.CheckoutBiz;
import com.accp.dao.JHB.CheckoutMapper;
import com.accp.pojo.Checkout;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CheckoutBIzImpl extends ServiceImpl<CheckoutMapper, Checkout> implements CheckoutBiz {
	@Autowired
	private CheckoutMapper checkoutMapper;

	@Override
	public PageInfo<Checkout> selectAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Checkout>(super.list());
	}
	
}