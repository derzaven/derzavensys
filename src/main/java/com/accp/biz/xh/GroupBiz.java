package com.accp.biz.xh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.xh.GroupMapper;
import com.accp.pojo.Group;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)

public class GroupBiz extends ServiceImpl<GroupMapper, Group>{

	@Autowired
	private GroupMapper mapper;
	
	public List<Group> selectAll(){
		QueryWrapper<Group> qw = Wrappers.query();
		return super.getBaseMapper().selectList(qw);
	}
}
