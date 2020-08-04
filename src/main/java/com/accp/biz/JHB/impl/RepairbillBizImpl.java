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

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RepairbillBizImpl extends ServiceImpl<RepairbillMapper,Repairbill> implements RepairbillBiz {
	@Autowired
	private RepairbillMapper repairbillMapper;
	
	
}