package com.accp.dao.JHB;

import java.util.List;

import com.accp.pojo.Staff;

public interface StaffMapper {
    List<Staff> selectAll();
    int insert(Staff staff);
    String selectMaxId();
}