package com.accp.biz.xh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.xh.StarlevelMapper;
import com.accp.pojo.Starlevel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)

public class StarlevelBiz extends ServiceImpl<StarlevelMapper, Starlevel>{
	@Autowired
	private StarlevelMapper mapper;
	
	public List<Starlevel> selectAll(){
		QueryWrapper<Starlevel> qw = Wrappers.query();
		return super.getBaseMapper().selectList(qw);
	}
}
