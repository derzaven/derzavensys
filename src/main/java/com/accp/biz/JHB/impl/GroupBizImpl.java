package com.accp.biz.JHB.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.GroupBiz;
import com.accp.dao.JHB.GroupMapper;
import com.accp.pojo.Group;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class GroupBizImpl extends ServiceImpl<GroupMapper,Group> implements GroupBiz {
	@Autowired
	private GroupMapper groupMapper;
	
	public List<Group> selectAll(){
		return super.list();
	}
}
