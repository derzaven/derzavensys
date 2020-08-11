package com.accp.biz.LP;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.StaffMapper;
import com.accp.pojo.Staff;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StaffBiz extends ServiceImpl<StaffMapper, Staff> {
	
	public Staff login(String name,String pwd) {
		return super.getBaseMapper().queryUserWithRole(name, pwd);
	}

}
