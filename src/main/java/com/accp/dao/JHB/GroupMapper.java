package com.accp.dao.JHB;

import com.accp.pojo.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}