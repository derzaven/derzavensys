package com.accp.dao.JHB;

import java.util.List;

import org.springframework.stereotype.Component;

import com.accp.pojo.Staff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBStaffMapper")
public interface StaffMapper extends BaseMapper<Staff>{
    List<Staff> selectAll();
    int insert(Staff staff);
    String selectMaxId();
}