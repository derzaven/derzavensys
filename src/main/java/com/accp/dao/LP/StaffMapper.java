package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Staff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("LPStaffMapper")
public interface StaffMapper extends BaseMapper<Staff>{
	Staff queryUserWithRole(@Param("userName")String userName,@Param("userPwd")String userPwd);
	
	List<Staff> selectAllByStaff(@Param("id")Integer id);
}