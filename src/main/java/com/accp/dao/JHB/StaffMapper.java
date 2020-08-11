package com.accp.dao.JHB;

import java.util.List;

import org.springframework.stereotype.Component;

import com.accp.pojo.Staff;

@Component("JHBStaffMapper")
public interface StaffMapper {
    List<Staff> selectAll();
    int insert(Staff staff);
    String selectMaxId();
}