package com.accp.dao.LP;

import com.accp.pojo.Perm;

public interface PermMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Perm record);

    int insertSelective(Perm record);

    Perm selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Perm record);

    int updateByPrimaryKey(Perm record);
}