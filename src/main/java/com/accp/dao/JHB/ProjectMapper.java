package com.accp.dao.JHB;

import com.accp.pojo.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}