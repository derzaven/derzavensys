package com.accp.biz.JHB.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.RecordBiz;
import com.accp.dao.JHB.RecordMapper;
import com.accp.pojo.Record;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RecordBizImpl extends ServiceImpl<RecordMapper, Record> implements RecordBiz {
	@Autowired
	private RecordMapper recordMapper;
	@Override
	public boolean insert(List<Record> record) {
		return super.saveBatch(record);
	}
	@Override
	public List<Record> selectByOdd(String odd) {
		QueryWrapper<Record> qw=Wrappers.query();
		qw.eq("odd", odd);
		return super.list(qw);
	}
	
	
}
